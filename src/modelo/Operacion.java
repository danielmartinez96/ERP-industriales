/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author navar
 */
public class Operacion {
   int id;
   String nombre;
   String descripcion;
   int idParteMaquina;

    public Operacion() {
    }

    public Operacion(int id, String nombre, String descripcion, int idParteMaquina) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idParteMaquina = idParteMaquina;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdParteMaquina() {
        return idParteMaquina;
    }

    public void setIdParteMaquina(int idParteMaquina) {
        this.idParteMaquina = idParteMaquina;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
}
