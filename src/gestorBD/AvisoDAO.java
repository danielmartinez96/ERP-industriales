/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorBD;

import gestorBD.conexion.EjecutorRutinaDB;
import modelo.AvisoVO;

/**
 *
 * @author DanielM
 */
public class AvisoDAO {
  
    
    public void agregar(AvisoVO aviso)
    {
        EjecutorRutinaDB.ejecutarUpdateStatement("SQL"+aviso);
        
    }
    
}
