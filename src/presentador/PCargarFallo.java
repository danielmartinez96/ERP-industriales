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

    private final IVCargarFallo vista1;

    public PCargarFallo(IVCargarFallo vista) {
        vista1 = vista;
        vista1.agregarListener2();

    }
    
 

   public void agregarPartesMaquinas(int id) {
        ArrayList<ParteMaquina> pm = RepositorioMantenimiento.getPartes(id);

        vista1.agregarParte2(pm);
    }
    
    public ArrayList<Maquina> getMaquinas() {
        return RepositorioMantenimiento.getMaquinas();
    }

    public void mostrar() {
     vista1.actualizar2();
     
    }
    
     public CausaFalla[] getEstados() {

        return EstadoAviso.values();
    }

    
}