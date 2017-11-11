/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorBD;

import gestorBD.conexion.EjecucionResultSet;
import gestorBD.conexion.EjecutorRutinaDB;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Aviso;
import modelo.FalloDeMaquina;
import modelo.Maquina;
import modelo.OrdenTrabajo;
import modelo.ParteMaquina;

import modelo.Personal;
import modelo.enumeraciones.EstadoAviso;
import modelo.enumeraciones.EstadoOT;
import modelo.enumeraciones.PrioridadAviso;
import modelo.enumeraciones.Responsable;
import modelo.enumeraciones.Sector;
import modelo.enumeraciones.TipoAviso;
import modelo.enumeraciones.TipoMaquina;
import modelo.enumeraciones.TipoOT;

/**
 *
 * @author DanielM
 */
public class RepositorioMantenimiento {

    public static ArrayList<Personal> getPersonal() {
        ArrayList<Personal> personal = new ArrayList<>();
        EjecutorRutinaDB.ejecutarSelectStatement((resultSet) -> {
            while (resultSet.next()) {
                Personal p = new Personal();
                p.setId(resultSet.getInt("id_personal"));
                p.setApellido(resultSet.getString("apellido"));
                p.setNombre(resultSet.getString("nombre"));
                p.setSector(Sector.valueOf(resultSet.getString("sector")));
                personal.add(p);
            }

        }, "SELECT * FROM personal");

        return personal;
    }

    public static Personal getSolicitante(int id) {
        Personal p = new Personal();
        EjecutorRutinaDB.ejecutarSelectStatement((resultSet) -> {
            while (resultSet.next()) {
                p.setId(resultSet.getInt("id_personal"));
                p.setApellido(resultSet.getString("apellido"));
                p.setNombre(resultSet.getString("nombre"));
                p.setSector(Sector.valueOf(resultSet.getString("sector")));
            }
        }, "SELECT * FROM personal WHERE id_personal=" + id);

        return p;
    }

    public static ArrayList<Maquina> getMaquinas() {
        ArrayList<Maquina> maquinas = new ArrayList<>();
        EjecutorRutinaDB.ejecutarSelectStatement((resultSet) -> {
            while (resultSet.next()) {
                Maquina m = new Maquina();
                m.setId(resultSet.getInt("id_maquina"));
                m.setDescripcion(resultSet.getString("descripcion"));
                m.setTipoMaquina(TipoMaquina.valueOf(resultSet.getString("tipo")));

                maquinas.add(m);
            }

        }, "SELECT * FROM maquinas");

        return maquinas;
    }

    public static Maquina getMaquina(int idParteMaquina) {
        Maquina m = new Maquina();
       EjecutorRutinaDB.ejecutarSelectStatement((resultSet) -> {
            while (resultSet.next()) {
                m.setId(resultSet.getInt("id_maquina"));
                m.setDescripcion(resultSet.getString("descripcion"));
                m.setTipoMaquina(TipoMaquina.valueOf(resultSet.getString("tipo")));
            }

        }, "SELECT * FROM maquinas LEFT JOIN partes_de_maquina ON maquinas.id_maquina = partes_de_maquina.id_parte_de_maquina");

        return m;
    }

    public static ArrayList<ParteMaquina> getPartes(int id) {
        ArrayList<ParteMaquina> partes = new ArrayList<>();
        EjecutorRutinaDB.ejecutarSelectStatement((resultSet) -> {
            while (resultSet.next()) {
                ParteMaquina pm = new ParteMaquina();
                pm.setId(resultSet.getInt("id_parte_de_maquina"));
                pm.setDescripcion(resultSet.getString("descripcion"));

                partes.add(pm);
            }

        }, "SELECT * FROM partes_de_maquina WHERE id_maquina=" + id);

        return partes;

    }

    public static ParteMaquina getParte(int id) {
        ParteMaquina pm = new ParteMaquina();
        EjecutorRutinaDB.ejecutarSelectStatement((resultSet) -> {
            while (resultSet.next()) {
                pm.setId(resultSet.getInt("id_parte_de_maquina"));
                pm.setDescripcion(resultSet.getString("descripcion"));
            }
        }, "SELECT * FROM partes_de_maquina WHERE id_parte_de_maquina=" +id);

        return pm;
    }

    public static ArrayList<Aviso> listarAvisos() {
        ArrayList<Aviso> avisos = new ArrayList<>();
        EjecutorRutinaDB.ejecutarSelectStatement((resultSet) -> {
            while (resultSet.next()) {
                Aviso aviso = new Aviso();
                
                aviso.setId(resultSet.getInt("id_aviso"));
                aviso.setEstado(EstadoAviso.valueOf(resultSet.getString("estado")));
                aviso.setTipo(TipoAviso.valueOf(resultSet.getString("tipo")));

                // ESTE FRAGMENTO SIRVE PARA MANEJAR LA COINCIDENCIA DE LOS TIPOS CALENDAR Y STRING. 
                Calendar cal = null;
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.getDefault());
                    Date date = sdf.parse(resultSet.getString("fecha_creacion"));
                    cal = sdf.getCalendar();
                } catch (Exception e) {
                    e.toString();
                }
                aviso.setCreacion(cal);
                //*******************************************************************************

                aviso.setDescripcion(resultSet.getString("descripcion"));
                aviso.setCantNecesariaRep(resultSet.getInt("cantidad_necesaria_reparacion"));
                aviso.setSectorResponsable(Sector.valueOf(resultSet.getString("sector_responsable")));
                aviso.setPrioridad(PrioridadAviso.valueOf(resultSet.getString("prioridad")));
                aviso.setParteMaquina(getParte(resultSet.getInt("id_parte_de_maquina")));
                aviso.setPersonal(getSolicitante(resultSet.getInt("id_solicitante")));
                aviso.setMaquina(getMaquina(resultSet.getInt("id_parte_de_maquina")));
                
                avisos.add(aviso);
                
                System.out.println("id:"+aviso.getId());
                System.out.println("est:"+aviso.getEstado());
                System.out.println("tip:"+aviso.getTipo());
                System.out.println("fecha:"+aviso.getCreacion());
                System.out.println("desc:"+aviso.getDescripcion());
                System.out.println("cant nec:"+aviso.getCantNecesariaRep());
                System.out.println("sec:"+aviso.getSectorResponsable());
                System.out.println("prior:"+aviso.getPrioridad());
                System.out.println("idparma:"+aviso.getParteMaquina().getId());
                System.out.println("pers:"+aviso.getPersonal().getId());
                System.out.println("maq:"+aviso.getMaquina().getId());
            }

        }, "SELECT * FROM avisos");

        return avisos;
    }

    /*
     public static void agregarMaquina(Maquina maquina) {
     EjecutorRutinaDB.ejecutarUpdateStatement("INSERT INTO maquina(id,tipo,descripcion,parte_de_maquina) VALUES("
     + "'" + maquina.getId()+ "','" + maquina.getTipoMaquina()+ "','" + maquina.getDescripcion() + "','" + maquina.getPartesMaquina()+ ")");

     }
     */
    public static void agregarAviso(Aviso aviso) {
        EjecutorRutinaDB.ejecutarUpdateStatement("INSERT INTO avisos(estado, tipo, id_solicitante, maquina, fecha_creacion, descripcion,"
                + "cantidad_necesaria_reparacion, sector_responsable, prioridad, id_parte_de_maquina) "
                + "VALUES(" + "'" + aviso.getEstado() + "','" + aviso.getTipo() + "','" + aviso.getPersonal().getId() + "','"
                + aviso.getMaquina() + "','" + aviso.getCreacion().getTime() + "','" + aviso.getDescripcion() + "','"
                + aviso.getCantNecesariaRep() + "','" + aviso.getSectorResponsable() + "','" + aviso.getPrioridad() + "',"
                + aviso.getParteMaquina().getId() + ")");
    }

    public static Aviso getAviso(int id)
    {
         Aviso aviso = new Aviso();
        EjecutorRutinaDB.ejecutarSelectStatement((resultSet) -> {
            while (resultSet.next()) {
               
                aviso.setId(resultSet.getInt("id_aviso"));
                aviso.setDescripcion(resultSet.getString("descripcion"));

                
                
              
            }

        }, "SELECT * FROM avisos where id_aviso="+id);

        return aviso;
    }
    
    // Quizas deberiamos filtrar segun el estado de aviso cuando es para cargar la ot
    public static ArrayList<Aviso> getAvisosOT() {
        ArrayList<Aviso> avisos = new ArrayList<>();
        EjecutorRutinaDB.ejecutarSelectStatement((resultSet) -> {
            while (resultSet.next()) {
                Aviso aviso = new Aviso();
                aviso.setId(resultSet.getInt("id_aviso"));
                aviso.setDescripcion(resultSet.getString("descripcion"));

                
                
                avisos.add(aviso);
            }

        }, "SELECT * FROM avisos");

        return avisos;
    }

    public static void agregarOT(OrdenTrabajo ot) {
        //      EjecutorRutinaDB.ejecutarUpdateStatement("INSERT INTO tabla_ot(estado, id_tipo_ot, responsable, fecha_inicio, fecha_fin, parte_maquina) "
        //                                            + "VALUES("+"'"+ot.getEstado() + "','" + ot.getTipo() + "','" + ot.getResp() 
        //                                          + "','" + ot.getFechaInicio().getTime() + "','" + ot.getFechaFin().getTime() + "','" + ot.getParte()+"')");
        EjecutorRutinaDB.ejecutarUpdateStatement("INSERT INTO tabla_ot(id_aviso,estado, responsable, fecha_inicio, fecha_fin, parte_maquina,tipo_ot) "
                + "VALUES('" + ot.getAviso().getId() + "','" + ot.getEstado() + "','" + ot.getResp()
                + "','" + ot.getFechaInicio().getTime() + "','" + ot.getFechaFin().getTime() + "','" + ot.getParte().getId() + "','" + ot.getTipo().toString() + "')");
    }

    public static void cargarFallo(FalloDeMaquina fallo) {
        
         EjecutorRutinaDB.ejecutarUpdateStatement("INSERT INTO fallo_maquina(fecha_creacion,sintoma, causa, detalle,id_parte_de_maquina) "
                + "VALUES('" + fallo.getFechaInicio().getTime() + "','" + fallo.getSintomaFalla()+ "','" + fallo.getCausaFalla()
                + "','" + fallo.getDetalle() + "','" + fallo.getParteMaquina().getId() + "')");
    }

    public static ArrayList<OrdenTrabajo> listarOT() {
        
 ArrayList<OrdenTrabajo> ordenes = new ArrayList<>();
        EjecutorRutinaDB.ejecutarSelectStatement((resultSet) -> {
            while (resultSet.next()) {
               OrdenTrabajo ot = new OrdenTrabajo();
               ot.setEstado(EstadoOT.valueOf(resultSet.getString("estado")));
               
 
                ot.setTipo(TipoOT.valueOf(resultSet.getString("tipo_ot")));
                ot.setAviso(getAviso(resultSet.getInt("id_aviso")));
                ot.setResp(Responsable.valueOf(resultSet.getString("responsable")));
                ot.setParteMaquina(getParte(resultSet.getInt("parte_maquina")));
                
                ordenes.add(ot);
            }

        }, "SELECT * FROM tabla_ot");

        return ordenes;
    }

}
