/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import gestorBD.RepositorioMantenimiento;
import java.util.ArrayList;
import modelo.OrdenTrabajo;
import presentador.interfaces.IVListarOT;

/**
 *
 * @author DanielM
 */
public class PListarOT {
     private final IVListarOT vista;

    public PListarOT(IVListarOT vista) {
        this.vista = vista;
      
    }
    
    public ArrayList<OrdenTrabajo> listarOT(){
        return RepositorioMantenimiento.listarOT();
    }
}
