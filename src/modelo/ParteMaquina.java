/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author DanielM
 */
public class ParteMaquina {
    private int id;
    private String descripcion;
    private int idMaquina;
    private int tiempoFallo;
    
    public ParteMaquina() {
    }

    public ParteMaquina(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(int idMaquina) {
        this.idMaquina = idMaquina;
    }

    public int getTiempoFallo() {
        return tiempoFallo;
    }

    public void setTiempoFallo(int tiempoFallo) {
        this.tiempoFallo = tiempoFallo;
    }

    
    
    @Override
    public String toString() {
        return descripcion; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
