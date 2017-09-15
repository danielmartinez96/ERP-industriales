/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Calendar;
import modelo.enumeraciones.EstadoOT;
import modelo.enumeraciones.Responsable;
import modelo.enumeraciones.TipoOT;

/**
 *
 * @author Usuario
 */
public class OrdenTrabajo {
    private int id;
    private EstadoOT estado;
    private TipoOT tipo;
    private Calendar FechaInicio;
    private Calendar FechaFin;
    private ParteMaquina parte;
    private Responsable resp;
    private Aviso aviso;

    public OrdenTrabajo() {
    }

    public OrdenTrabajo(int id, EstadoOT estado, TipoOT tipo, Calendar FechaInicio, Calendar FechaFin) {
        this.id = id;
        this.estado = estado;
        this.tipo = tipo;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
    }

    public Aviso getAviso() {
        return aviso;
    }

    public void setAviso(Aviso aviso) {
        this.aviso = aviso;
    }

    
    public int getId() {
        return id;
    }

    /*
    public void setId(int id) {
        this.id = id;
    }*/

    public EstadoOT getEstado() {
        return estado;
    }

    public void setEstado(EstadoOT estado) {
        this.estado = estado;
    }

    public TipoOT getTipo() {
        return tipo;
    }

    public void setTipo(TipoOT tipo) {
        this.tipo = tipo;
    }

    public Calendar getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Calendar FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Calendar getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Calendar FechaFin) {
        this.FechaFin = FechaFin;
    }

    public ParteMaquina getParte() {
        return parte;
    }

    public void setParteMaquina(ParteMaquina parte) {
        this.parte = parte;
    }

    public Responsable getResp() {
        return resp;
    }

    public void setResp(Responsable resp) {
        this.resp = resp;
    }
    
    
    
    
}
