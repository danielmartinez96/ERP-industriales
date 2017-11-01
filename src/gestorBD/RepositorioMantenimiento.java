/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorBD;

import gestorBD.conexion.EjecucionResultSet;
import gestorBD.conexion.EjecutorRutinaDB;
import java.util.ArrayList;
import modelo.Aviso;
import modelo.Maquina;
import modelo.OrdenTrabajo;
import modelo.ParteMaquina;

import modelo.Personal;
import modelo.enumeraciones.Sector;
import modelo.enumeraciones.TipoMaquina;

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

    /*
     public static void agregarMaquina(Maquina maquina) {
     EjecutorRutinaDB.ejecutarUpdateStatement("INSERT INTO maquina(id,tipo,descripcion,parte_de_maquina) VALUES("
     + "'" + maquina.getId()+ "','" + maquina.getTipoMaquina()+ "','" + maquina.getDescripcion() + "','" + maquina.getPartesMaquina()+ ")");

     }
     */

    public static void agregarAviso(Aviso aviso) {
        EjecutorRutinaDB.ejecutarUpdateStatement("INSERT INTO avisos(estado, tipo, solicitante, maquina, fecha_creacion, descripcion,"
                                                + "cantidad_necesaria_reparacion, sector_responsable, prioridad, id_parte_de_maquina) "
                                                + "VALUES("+"'"+aviso.getEstado() + "','" + aviso.getTipo() + "','" + aviso.getPersonal() + "','" 
                                                + aviso.getMaquina() + "','"+ aviso.getCreacion().getTime() + "','" + aviso.getDescripcion() + "','" 
                                                + aviso.getCantNecesariaRep() + "','"+ aviso.getSectorResponsable() + "','" + aviso.getPrioridad() + "'," 
                                                + aviso.getParteMaquina().getId() + ")");
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
                                                + "VALUES('"+ot.getAviso().getId()+"','"+ot.getEstado() +"','" + ot.getResp() 
                                                + "','" + ot.getFechaInicio().getTime() + "','" + ot.getFechaFin().getTime() + "','" + ot.getParte().getId()+"','"+ot.getTipo().toString()+"')");
    }

    
}
