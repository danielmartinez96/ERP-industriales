/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import interfaces.IVAviso;
import modelo.AvisoVO;

/**
 *
 * @author DanielM
 */
public class PAviso {
    private IVAviso vista;

    public PAviso(IVAviso vista) {
        this.vista = vista;
        vista.actualizar();
    }

    public void cargarAviso() {
   
       
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
