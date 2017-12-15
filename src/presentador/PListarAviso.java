/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import gestorBD.RepositorioMantenimiento;
import java.util.ArrayList;
import modelo.*;
import modelo.enumeraciones.PrioridadAviso;
import presentador.interfaces.IVListarAviso;

/**
 *
 * @author Usuario
 */
public class PListarAviso {
    private IVListarAviso vista;

    public PListarAviso(IVListarAviso vista) {
        this.vista = vista;
    }
    
    public ArrayList<Aviso> listarAvisos(String prioridad,String maquina,String fecha){
        String sql=" WHERE";
        
        if(prioridad != "Todos")sql+=" prioridad='"+prioridad+"'";
         if(maquina != "Todos")
         {
             if(sql!=" WHERE")
             {
                 sql+=" AND ";
             }
              sql+=" maquina='"+maquina+"'";
         }
         if(fecha != "Todos"){
             
             if(sql!=" WHERE")
             {
                 sql+=" AND ";
             }
              sql+=" locate ('"+fecha+"',fecha_creacion)" ;
         }
        
         if(sql==" WHERE")
         {
             sql="";
         }
        
        return RepositorioMantenimiento.listarAvisos(sql);
    }

    public ArrayList<String> getPrioridades() {
     ArrayList<String> lista= new ArrayList<>();
     PrioridadAviso[] prioridades= PrioridadAviso.values();
     
     for(int i=0; i<prioridades.length;i++)
     {
         lista.add(prioridades[i].name());
     }
     return lista;   
    }

    public ArrayList<Maquina> getMaquinas() {
   return RepositorioMantenimiento.getMaquinas();
    }
}
