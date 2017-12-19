/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import gestorBD.RepositorioMantenimiento;
import java.util.ArrayList;
import java.util.Calendar;
import modelo.Aviso;
import modelo.Maquina;
import modelo.Operacion;
import modelo.OrdenTrabajo;
import modelo.ParteMaquina;
import modelo.Personal;
import modelo.enumeraciones.EstadoOT;
import modelo.enumeraciones.Responsable;
import modelo.enumeraciones.TipoOT;
import presentador.interfaces.IVOrdenTrabajo;

/**
 *
 * @author Usuario
 */
public class POrdenTrabajo {

    private final IVOrdenTrabajo vista;

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

    public ArrayList<Personal> getResponsables() {
        return RepositorioMantenimiento.getPersonales();
    }

    public ArrayList<Maquina> getMaquinas() {
        return RepositorioMantenimiento.getMaquinas();
    }

    public void agregarPartesMaquinas(int id) {
        ArrayList<ParteMaquina> pm = RepositorioMantenimiento.getPartes(id);

        vista.agregarParte(pm);
    }



    public Aviso getAviso(int key) {

       return  RepositorioMantenimiento.getAviso(key);
    }

    public void guardarOT(Aviso av, EstadoOT estadoOT, TipoOT tipoOT, Personal responsable, Calendar calInicio, Calendar calFin, ParteMaquina parteMaquina, String operaciones) {
 OrdenTrabajo ot = new OrdenTrabajo();

        ot.setAviso(av);
        ot.setEstado(estadoOT);
        ot.setTipo(tipoOT);
        ot.setFechaInicio(calInicio);
        ot.setFechaFin(calFin);
        ot.setParteMaquina(parteMaquina);
        ot.setResp(responsable);
        ot.setOperaciones(operaciones);

        RepositorioMantenimiento.agregarOT(ot);

    }

    public ArrayList<Operacion> getOperaciones(int id) {

    return RepositorioMantenimiento.obtenerOperaciones(id);
    }

}
