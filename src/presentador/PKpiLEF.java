/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import gestorBD.RepositorioMantenimiento;
import java.util.ArrayList;
import modelo.Maquina;
import presentador.interfaces.IVKpiLEF;

/**
 *
 * @author Usuario
 */
public class PKpiLEF {
    private final IVKpiLEF vista;

    public PKpiLEF(IVKpiLEF vista) {
        this.vista = vista;
    }
    
    public ArrayList<Maquina> getMaquinas() {

        return RepositorioMantenimiento.getMaquinas();
    }
    
}
