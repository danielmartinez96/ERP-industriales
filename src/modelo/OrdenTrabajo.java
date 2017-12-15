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
    private Calendar fechaInicio;
    private Calendar fechaFin;
    private ParteMaquina parte;
    private Responsable resp;
    private Aviso aviso;
    final private  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");

    public OrdenTrabajo() {
    }

    public OrdenTrabajo(int id, EstadoOT estado, TipoOT tipo, Calendar FechaInicio, Calendar FechaFin) {
        this.id = id;
        this.estado = estado;
        this.tipo = tipo;
        this.fechaInicio = FechaInicio;
        this.fechaFin = FechaFin;
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

 

    public String getFechaFin() {
           return sdf.format(fechaFin.getTime());
    }

     public void setFechaFin(Calendar fechaFin) {

            
      
      int year       = fechaFin.get(Calendar.YEAR);
      int month      = fechaFin.get(Calendar.MONTH);
      int dayOfMonth = fechaFin.get(Calendar.DAY_OF_MONTH);
      
      int hour       = fechaFin.get(Calendar.HOUR);
      int minute     = fechaFin.get(Calendar.MINUTE);
      
      fechaFin= new GregorianCalendar(year, month, dayOfMonth, hour, minute);
      
        try {
            Date date = sdf.parse(sdf.format(fechaFin.getTime()));
            this.fechaFin= Calendar.getInstance();
            this.fechaFin.setTime(date);
            
            
         
             
            this.fechaInicio.setTime(date);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
     
   
    }
    public void setFechaFin(String fecha) {

    
       
        try {
            Date date = sdf.parse(fecha);
             this.fechaFin= Calendar.getInstance();
            this.fechaFin.setTime(date);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
     
   
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
