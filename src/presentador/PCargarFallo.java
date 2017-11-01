/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import gestorBD.RepositorioMantenimiento;
import java.util.ArrayList;
import modelo.Maquina;
import modelo.ParteMaquina;
import presentador.interfaces.IVCargarFallo;


/**
 *
 * @author DanielM
 */
public class PCargarFallo {

    IVCargarFallo vista;
    
    public PCargarFallo(IVCargarFallo vista) {
        this.vista=vista;
        this.vista.agregarListener();
    }

   public void agregarPartesMaquinas(int id) {
        ArrayList<ParteMaquina> pm = RepositorioMantenimiento.getPartes(id);

        vista.agregarParte(pm);
    }
    
    public ArrayList<Maquina> getMaquinas() {
        return RepositorioMantenimiento.getMaquinas();
    }
}
