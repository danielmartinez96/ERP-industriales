/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import gestorBD.RepositorioMantenimiento;
import java.util.ArrayList;
import modelo.FalloDeMaquina;
import presentador.interfaces.IVConsultaFallo;

/**
 *
 * @author Usuario
 */
public class PConsultaFallo {
    private final IVConsultaFallo vista;

    public PConsultaFallo(IVConsultaFallo vista) {
        this.vista = vista;
        
    }
    
    public ArrayList<FalloDeMaquina> listarFallos(){
        return RepositorioMantenimiento.listarFallos();
    }
}
