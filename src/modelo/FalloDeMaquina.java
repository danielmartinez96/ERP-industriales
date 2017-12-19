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

    private ParteMaquina parteMaquina;
    private Calendar fechaInicio;
    private Calendar tiempoDeFalla;
    private String detalle;
    private SintomaFalla SintomaFalla;
    private CausaFalla CausaFalla;
    int dias;

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    final private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    final private SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");

    public FalloDeMaquina() {
    }

    public FalloDeMaquina(ParteMaquina parteMaquina, Calendar fechaInicio, String detalle, SintomaFalla SintomaFalla, CausaFalla CausaFalla, Calendar horasDeFalla, int dias) {
        this.parteMaquina = parteMaquina;
        this.setFechaInicio(fechaInicio);
        this.detalle = detalle;
        this.SintomaFalla = SintomaFalla;
        this.CausaFalla = CausaFalla;
        setTiempoDeFalla(horasDeFalla);
        this.dias = dias;
    }

    public String getTiempoDeFalla() {
        return sdf2.format(tiempoDeFalla.getTime());
    }

    public Calendar getCalendarTiempoDeFalla() {
        return tiempoDeFalla;
    }

    public void setTiempoDeFalla(Calendar horasDeFalla) {

        int hour = horasDeFalla.get(Calendar.HOUR_OF_DAY);
        int minute = horasDeFalla.get(Calendar.MINUTE);

        tiempoDeFalla = new GregorianCalendar(1, 1, 1, hour, minute);

        try {

            Date date = sdf2.parse(sdf2.format(tiempoDeFalla.getTime()));
            this.tiempoDeFalla = Calendar.getInstance();
            this.tiempoDeFalla.setTime(date);

            //
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

    }

    public void setTiempoDeFalla(String fecha) {

        try {
            Date date = sdf2.parse(fecha);
            this.tiempoDeFalla = Calendar.getInstance();
            this.tiempoDeFalla.setTime(date);
            this.tiempoDeFalla.set(Calendar.HOUR_OF_DAY, date.getHours());
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

    }

    public ParteMaquina getParteMaquina() {
        return parteMaquina;
    }

    public void setParteMaquina(ParteMaquina parteMaquina) {
        this.parteMaquina = parteMaquina;
    }

    public void setFechaInicio(Calendar fechaInicio) {

        int year = fechaInicio.get(Calendar.YEAR);
        int month = fechaInicio.get(Calendar.MONTH);
        int dayOfMonth = fechaInicio.get(Calendar.DAY_OF_MONTH);

        int hour = fechaInicio.get(Calendar.HOUR_OF_DAY);
        int minute = fechaInicio.get(Calendar.MINUTE);

        fechaInicio = new GregorianCalendar(year, month, dayOfMonth, hour, minute);

        try {

            Date date = sdf.parse(sdf.format(fechaInicio.getTime()));
            this.fechaInicio = Calendar.getInstance();
            this.fechaInicio.setTime(date);

            //
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

    }

    public void setFechaInicio(String fecha) {

        try {
            Date date = sdf.parse(fecha);
            this.fechaInicio = Calendar.getInstance();
            this.fechaInicio.setTime(date);
            this.fechaInicio.set(Calendar.HOUR_OF_DAY, date.getHours());
        } catch (ParseException ex) {
            this.fechaInicio=null;
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

    public void setFechaInicio(Calendar fecha, Date InicioFallDate) {
      
      
      int year       = fechaInicio.get(Calendar.YEAR);
      int month      = fechaInicio.get(Calendar.MONTH);
      int dayOfMonth = fechaInicio.get(Calendar.DAY_OF_MONTH);
      
      int hour       = InicioFallDate.getHours();
      int minute     = InicioFallDate.getHours();
      
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
  
  
  
}
