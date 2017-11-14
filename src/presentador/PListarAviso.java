/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import gestorBD.RepositorioMantenimiento;
import java.util.ArrayList;
import javax.swing.JTable;
import modelo.*;
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
    
    public ArrayList<Aviso> listarAvisos(){
        return RepositorioMantenimiento.listarAvisos();
    }
}
