/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.enumeraciones.PrioridadAviso;
import modelo.enumeraciones.TipoAviso;
import modelo.enumeraciones.EstadoAviso;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
    final private  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
    
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

    public String getCreacion()
    {
        return sdf.format(creacion.getTime());
    }
           

    public void setCreacion(Calendar creacion) {

    
      int year       = creacion.get(Calendar.YEAR);
      int month      = creacion.get(Calendar.MONTH);
      int dayOfMonth = creacion.get(Calendar.DAY_OF_MONTH);
      
      int hour       = creacion.get(Calendar.HOUR);
      int minute     = creacion.get(Calendar.MINUTE);
      
      creacion= new GregorianCalendar(year, month, dayOfMonth, hour, minute);
        try {
            
            Date date = sdf.parse(sdf.format(creacion.getTime()));
            this.creacion= Calendar.getInstance();
            this.creacion.setTime(date);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
     
   
    }
    public void setCreacion(String fecha) {

      
       
        try {
            Date date = sdf.parse(fecha);
            this.creacion= Calendar.getInstance();
            this.creacion.setTime(date);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
     
   
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

    @Override
    public String toString() {
        return descripcion;
    }

    public String toString2() {
       // return "id: "+id+"\t-\t Responsable: "+personal+ "\n (Maquina)Parte de Maquina: ("+maquina.toString()+
       //        ")"+maquina.getPartesMaquina().toString()+"\n Descripcion: "+descripcion;
       return "id: "+id+"\n Descripcion: "+descripcion;
    }


}
