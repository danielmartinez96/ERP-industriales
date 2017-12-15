/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
  final private  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
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
    public void setFechaInicio(Calendar fechaInicio) {


       
      
      int year       = fechaInicio.get(Calendar.YEAR);
      int month      = fechaInicio.get(Calendar.MONTH);
      int dayOfMonth = fechaInicio.get(Calendar.DAY_OF_MONTH);
      
      int hour       = fechaInicio.get(Calendar.HOUR);
      int minute     = fechaInicio.get(Calendar.MINUTE);
      
      fechaInicio= new GregorianCalendar(year, month, dayOfMonth, hour, minute);
      
        try {
             
             Date date = sdf.parse(sdf.format(fechaInicio.getTime()));
             this.fechaInicio= Calendar.getInstance();
             this.fechaInicio.setTime(date);
 
         //
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
     
   
    }
    public void setFechaInicio(String fecha) {

  
       
        try {
            Date date = sdf.parse(fecha);
            this.fechaInicio= Calendar.getInstance();
            this.fechaInicio.setTime(date);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
     
   
    }
    public String getFechaInicio() {
           return sdf.format(fechaInicio.getTime());
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
