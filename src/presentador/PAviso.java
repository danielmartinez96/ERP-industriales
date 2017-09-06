/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import gestorBD.AvisoDAO;
import interfaces.IVAviso;
import modelo.AvisoVO;

/**
 *
 * @author DanielM
 */
public class PAviso {
    private IVAviso vista;
    private AvisoDAO avisoDAO;

    public PAviso(IVAviso vista) {
        this.vista = vista;
        vista.actualizar();
    }

    public void cargarAviso() {
   
       AvisoVO aviso = new AvisoVO();
       avisoDAO= new  AvisoDAO();
       avisoDAO.agregar(aviso);
        
    }
    
    
    
    
}
