/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Calendar;
import modelo.enumeraciones.CausaFalla;
import modelo.enumeraciones.SintomaFalla;

/**
 *
 * @author DanielM
 */
public class FalloDeMaquina {
  private ParteMaquina  parteMaquina;
  private Calendar fechaInicio;
  private String detalle;
  private SintomaFalla SintomaFalla;
  private CausaFalla CausaFalla; 

    public FalloDeMaquina() {
    }

    public FalloDeMaquina(ParteMaquina parteMaquina, Calendar fechaInicio, String detalle, SintomaFalla SintomaFalla, CausaFalla CausaFalla) {
        this.parteMaquina = parteMaquina;
        this.fechaInicio = fechaInicio;
        this.detalle = detalle;
        this.SintomaFalla = SintomaFalla;
        this.CausaFalla = CausaFalla;
    }

    public ParteMaquina getParteMaquina() {
        return parteMaquina;
    }

    public void setParteMaquina(ParteMaquina parteMaquina) {
        this.parteMaquina = parteMaquina;
    }

    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public SintomaFalla getSintomaFalla() {
        return SintomaFalla;
    }

    public void setSintomaFalla(SintomaFalla SintomaFalla) {
        this.SintomaFalla = SintomaFalla;
    }

    public CausaFalla getCausaFalla() {
        return CausaFalla;
    }

    public void setCausaFalla(CausaFalla CausaFalla) {
        this.CausaFalla = CausaFalla;
    }
  
  
  
}
