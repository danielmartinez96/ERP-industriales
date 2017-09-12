/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import gestorBD.RepositorioMantenimiento;
import java.util.ArrayList;
import java.util.Calendar;
import modelo.Maquina;
import modelo.OrdenTrabajo;
import modelo.ParteMaquina;
import modelo.Personal;
import modelo.enumeraciones.EstadoAviso;
import modelo.enumeraciones.EstadoOT;
import modelo.enumeraciones.PrioridadAviso;
import modelo.enumeraciones.Responsable;
import modelo.enumeraciones.Sector;
import modelo.enumeraciones.TipoAviso;
import modelo.enumeraciones.TipoOT;
import presentador.interfaces.IVOrdenTrabajo;

/**
 *
 * @author Usuario
 */
public class POrdenTrabajo {

    private IVOrdenTrabajo vista;

    public POrdenTrabajo(IVOrdenTrabajo vista) {
        this.vista = vista;
        vista.agregarListener();
    }

    public EstadoOT[] getEstados() {
        return EstadoOT.values();
    }

    public TipoOT[] getTipos() {

        return TipoOT.values();
    }

    public Responsable[] getResponsables() {
        return Responsable.values();
    }

    public ArrayList<Maquina> getMaquinas() {
        return RepositorioMantenimiento.getMaquinas();
    }

    public void agregarPartesMaquinas(int id) {
        ArrayList<ParteMaquina> pm = RepositorioMantenimiento.getPartes(id);

        vista.agregarParte(pm);
    }

    public void guardarOT(/*int id,*/ EstadoOT estado, TipoOT tipo,Responsable resp, Calendar inicio, Calendar fin, ParteMaquina pm) {
        OrdenTrabajo ot = new OrdenTrabajo();

        //ot.setId(id);
        ot.setEstado(estado);
        ot.setTipo(tipo);
        ot.setFechaInicio(inicio);
        ot.setFechaFin(fin);
        ot.setParteMaquina(pm);
        ot.setResp(resp);

        RepositorioMantenimiento.agregarOT(ot);

    }

}
