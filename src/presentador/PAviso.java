/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import gestorBD.RepositorioMantenimiento;
import java.util.ArrayList;
import java.util.Calendar;
import modelo.*;
import modelo.enumeraciones.EstadoAviso;
import modelo.enumeraciones.PrioridadAviso;
import modelo.enumeraciones.Sector;
import modelo.enumeraciones.TipoAviso;
import presentador.interfaces.IVAviso;

/**
 *
 * @author DanielM
 */
public class PAviso {

    private IVAviso vista;

    public PAviso(IVAviso vista) {
        this.vista = vista;
        vista.agregarListener();
        //vista.actualizar();
    }

    public EstadoAviso[] getEstados() {

        return EstadoAviso.values();
    }

    public ArrayList<Personal> getPersonal() {

        return RepositorioMantenimiento.getPersonal();
    }

    public PrioridadAviso[] getPrioridad() {

        return PrioridadAviso.values();
    }

    public Sector[] getSectores() {

        return Sector.values();
    }

    public TipoAviso[] getTipos() {

        return TipoAviso.values();
    }

    public ArrayList<Maquina> getMaquinas() {

        return RepositorioMantenimiento.getMaquinas();
    }

    public void agregarPartesMaquinas(int id) {
        ArrayList<ParteMaquina> pm = RepositorioMantenimiento.getPartes(id);

        vista.agregarParte(pm);
    }

    public void guardarAviso(TipoAviso t, EstadoAviso e, Personal p, PrioridadAviso pa, Maquina m, ParteMaquina pm, Calendar cal, Sector sec, String tiemp, String desc) {
        Aviso aviso = new Aviso();
        aviso.setTipo(t);
        aviso.setEstado(e);
        aviso.setPersonal(p);
        aviso.setPrioridad(pa);
        aviso.setMaquina(m);
        aviso.setParteMaquina(pm);
        aviso.setCreacion(cal);
        aviso.setSectorResponsable(sec);
        aviso.setCantNecesariaRep(Integer.valueOf(tiemp));
        aviso.setDescripcion(desc);

        RepositorioMantenimiento.agregarAviso(aviso);
        
    }
}
