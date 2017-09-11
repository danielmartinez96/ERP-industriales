/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.enumeraciones.PrioridadAviso;
import modelo.enumeraciones.TipoAviso;
import modelo.enumeraciones.EstadoAviso;
import gestorBD.conexion.EjecutorRutinaDB;
import java.util.Calendar;
import java.util.Date;
import modelo.enumeraciones.Sector;



/**
 *
 * @author DanielM
 */
public class Aviso {
    private int id;
    private EstadoAviso estado;
    private TipoAviso tipo;
    private Calendar creacion;
    private String descripcion;
    private int cantNecesariaRep;
    private Maquina maquina;
    private ParteMaquina parteMaquina;
    private PrioridadAviso prioridad;
    private Sector sectorResponsable;
    private Personal personal;
    
    
    public Aviso(){
        
    }   

    public Aviso(int id, EstadoAviso estado, TipoAviso tipo, Calendar creacion, String descripcion, int cantNecesariaRep, ParteMaquina parteMaquina, PrioridadAviso prioridad, Sector sectorResponsable) {
        this.id = id;
        this.estado = estado;
        this.tipo = tipo;
        this.creacion = creacion;
        this.descripcion = descripcion;
        this.cantNecesariaRep = cantNecesariaRep;
        this.parteMaquina = parteMaquina;
        this.prioridad = prioridad;
        this.sectorResponsable = sectorResponsable;
    }  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EstadoAviso getEstado() {
        return estado;
    }

    public void setEstado(EstadoAviso estado) {
        this.estado = estado;
    }

    public TipoAviso getTipo() {
        return tipo;
    }

    public void setTipo(TipoAviso tipo) {
        this.tipo = tipo;
    }

    public Calendar getCreacion() {
        return creacion;
    }

    public void setCreacion(Calendar creacion) {
        this.creacion = creacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantNecesariaRep() {
        return cantNecesariaRep;
    }

    public void setCantNecesariaRep(int cantNecesariaRep) {
        this.cantNecesariaRep = cantNecesariaRep;
    }

    public ParteMaquina getParteMaquina() {
        return parteMaquina;
    }

    public void setParteMaquina(ParteMaquina parteMaquina) {
        this.parteMaquina = parteMaquina;
    }

    public PrioridadAviso getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(PrioridadAviso prioridad) {
        this.prioridad = prioridad;
    }

    public Sector getSectorResponsable() {
        return sectorResponsable;
    }

    public void setSectorResponsable(Sector sectorResponsable) {
        this.sectorResponsable = sectorResponsable;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }


}
