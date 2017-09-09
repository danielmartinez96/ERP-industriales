/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.enumeraciones.Sector;

/**
 *
 * @author DanielM
 */
public class Personal {
    private int id;
    private String nombre;
    private String apellido;
    private Sector sector;

    public Personal() {
    }

    public Personal(int id, String nombre, String apellido, Sector sector) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sector = sector;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    @Override
    public String toString() {
        return apellido+" "+nombre; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
