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
    private Calendar fechaReal;
    private ParteMaquina parte;
    private Personal resp;
    private Aviso aviso;
    private String operaciones;
 
    final private  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public OrdenTrabajo() {
    }

       public OrdenTrabajo(int id, EstadoOT estado, TipoOT tipo, Calendar fechaInicio, Calendar fechaFin, ParteMaquina parte, Personal resp, Aviso aviso, String operaciones) {
        this.id = id;
        this.estado = estado;
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.parte = parte;
        this.resp = resp;
        this.aviso = aviso;
        this.operaciones = operaciones;
    }

    public String getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(String operaciones) {
        this.operaciones = operaciones;
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

    
    public void setId(int id) {
        this.id = id;
    }

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
      
      int hour       = fechaInicio.get(Calendar.HOUR_OF_DAY);
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
    public void setFechaReal(Calendar fechaReal) {

            
     
      int year       = fechaReal.get(Calendar.YEAR);
      int month      = fechaReal.get(Calendar.MONTH);
      int dayOfMonth = fechaReal.get(Calendar.DAY_OF_MONTH);
      
      int hour       = fechaReal.get(Calendar.HOUR_OF_DAY);
      int minute     = fechaReal.get(Calendar.MINUTE);
      
      fechaReal= new GregorianCalendar(year, month, dayOfMonth, hour, minute);
      
        try {
            Date date = sdf.parse(sdf.format(fechaReal.getTime()));
             this.fechaReal= Calendar.getInstance();
            this.fechaReal.setTime(date);

        
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
     
   
    }
    public void setFechaReal(String fecha) {

      try{
       
        try {
            Date date = sdf.parse(fecha);
            this.fechaReal= Calendar.getInstance();
            this.fechaReal.setTime(date);
            
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
      }catch(NullPointerException e)
      {
          this.fechaReal=null;
      }
      
   
    }
    public String getFechaInicio() {
           return sdf.format(fechaInicio.getTime());
    }

       public Calendar getFechaInicioCalendar() {
           return fechaInicio;
    }
   public Calendar getFechaFinCalendar() {
           return fechaFin;
    }

    public String getFechaFin() {
           return sdf.format(fechaFin.getTime());
    }

     public Calendar getFechaRealCalendar() {
           return fechaReal;
    }

    public String getFechaReal() {
        try{
            return sdf.format(fechaReal.getTime()); 
        }catch(NullPointerException ex)
        {
            return "No se cerro";
        }   
          
    }
     public void setFechaFin(Calendar fechaFin) {

            
      
      int year       = fechaFin.get(Calendar.YEAR);
      int month      = fechaFin.get(Calendar.MONTH);
      int dayOfMonth = fechaFin.get(Calendar.DAY_OF_MONTH);
      
      int hour       = fechaFin.get(Calendar.HOUR_OF_DAY);
      int minute     = fechaFin.get(Calendar.MINUTE);
      
      fechaFin= new GregorianCalendar(year, month, dayOfMonth, hour, minute);
      
        try {
            Date date = sdf.parse(sdf.format(fechaFin.getTime()));
            this.fechaFin= Calendar.getInstance();
            this.fechaFin.setTime(date);
            
            this.fechaFin.setTime(date);
            
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

    public Personal getResp() {
        return resp;
    }

    public void setResp(Personal resp) {
        this.resp = resp;
    }

    public void setFechaInicio(Calendar calInicio, Date dInicio) {
            int year       = fechaInicio.get(Calendar.YEAR);
      int month      = fechaInicio.get(Calendar.MONTH);
      int dayOfMonth = fechaInicio.get(Calendar.DAY_OF_MONTH);
      
      int hour       = dInicio.getHours();
      int minute     = dInicio.getMinutes();
      
      fechaInicio= new GregorianCalendar(year, month, dayOfMonth, hour, minute);
      
        try {
            Date date = sdf.parse(sdf.format(fechaInicio.getTime()));
             this.fechaInicio= Calendar.getInstance();
            this.fechaInicio.setTime(date);

        
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
     
    }

    public void setFechaFin(Calendar calFin, Date dFin) {
      
      int year       = fechaFin.get(Calendar.YEAR);
      int month      = fechaFin.get(Calendar.MONTH);
      int dayOfMonth = fechaFin.get(Calendar.DAY_OF_MONTH);
      
      int hour       = dFin.getHours();
      int minute     = dFin.getMinutes();
      
      fechaFin= new GregorianCalendar(year, month, dayOfMonth, hour, minute);
      
        try {
            Date date = sdf.parse(sdf.format(fechaFin.getTime()));
            this.fechaFin= Calendar.getInstance();
            this.fechaFin.setTime(date);
            
            this.fechaFin.setTime(date);
            
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
     
    }
    
    
    
    
}
