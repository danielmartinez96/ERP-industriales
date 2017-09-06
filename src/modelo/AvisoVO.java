/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import gestorBD.conexion.EjecutorRutinaDB;
import java.util.Date;



/**
 *
 * @author DanielM
 */
public class AvisoVO {
    private int idAviso;
    private EstadoAviso estado;
    private String tipo;
    private Date creacion;
    private String descripcion;
    private int cantNecesariaRep;

    public AvisoVO(int idAviso, EstadoAviso estado, String tipo, Date creacion, String descripcion, int cantNecesariaRep) {
        this.idAviso = idAviso;
        this.estado = estado;
        this.tipo = tipo;
        this.creacion = creacion;
        this.descripcion = descripcion;
        this.cantNecesariaRep = cantNecesariaRep;
    }

    public int getIdAviso() {
        return idAviso;
    }

    public void setIdAviso(int idAviso) {
        this.idAviso = idAviso;
    }

    public EstadoAviso getEstado() {
        return estado;
    }

    public void setEstado(EstadoAviso estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
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
    
    
    
    
   
}
