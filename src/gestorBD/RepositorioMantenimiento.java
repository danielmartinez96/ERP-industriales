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
        ArrayList<Personal> personal= new ArrayList<>();
        EjecutorRutinaDB.ejecutarSelectStatement((resultSet) -> {
            while(resultSet.next())
            {
                Personal p= new Personal();
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
         ArrayList<Maquina> maquinas= new ArrayList<>();
        EjecutorRutinaDB.ejecutarSelectStatement((resultSet) -> {
            while(resultSet.next())
            {
                Maquina m= new Maquina();
                m.setId(resultSet.getInt("id_maquina"));
                m.setDescripcion(resultSet.getString("descripcion"));
                m.setTipoMaquina(TipoMaquina.valueOf(resultSet.getString("tipo")));
         
                maquinas.add(m);
            }
                
            
        }, "SELECT * FROM maquinas");
        
        return maquinas;
    }

    public static ArrayList<ParteMaquina> getPartes(int id) {
        ArrayList<ParteMaquina> partes= new ArrayList<>();
        EjecutorRutinaDB.ejecutarSelectStatement((resultSet) -> {
            while(resultSet.next())
            {
                ParteMaquina pm= new ParteMaquina();
                pm.setId(resultSet.getInt("id_parte_de_maquina"));
                pm.setDescripcion(resultSet.getString("descripcion"));
               
         
               partes.add(pm);
            }
                
            
        }, "SELECT * FROM partes_de_maquina WHERE id_maquina="+id);
        
        return partes;
        


    }
    
    
    public static void agregarAviso(Aviso aviso)
    {
        
        
        EjecutorRutinaDB.ejecutarUpdateStatement("INSERT INTO avisos(estado,tipo,fecha_creacion,descripcion,cantidad_necesaria_reparacion,sector_responsable,prioridad,id_parte_de_maquina) VALUES("
                + "'"+aviso.getEstado()+"','"+aviso.getTipo()+"','"+aviso.getCreacion().getTime()+"','"+aviso.getDescripcion()+"','"+aviso.getCantNecesariaRep()+"','"+aviso.getSectorResponsable()+"','"+aviso.getPrioridad()+"',"+aviso.getParteMaquina().getId()+")");
        
        
    }
    
}
