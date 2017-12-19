/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import gestorBD.RepositorioMantenimiento;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import modelo.FalloDeMaquina;
import modelo.Maquina;
import modelo.ParteMaquina;
import modelo.enumeraciones.CausaFalla;
import modelo.enumeraciones.SintomaFalla;
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
    
     public CausaFalla[] getCausas() {

        return CausaFalla.values();
    }

      public SintomaFalla[] getSintomas() {

        return SintomaFalla.values();
    }

  
    

    public void cargarFallo(ParteMaquina pm, SintomaFalla sintoma, CausaFalla causa, String detalle, Calendar fecha,Date InicioFallDate, Calendar calHorasFalla, int dias) {
       
        FalloDeMaquina fallo= new FalloDeMaquina(pm, fecha, detalle, sintoma, causa,calHorasFalla,dias);
        fallo.setFechaInicio(fecha,InicioFallDate);
        RepositorioMantenimiento.cargarFallo(fallo);    
    }
}