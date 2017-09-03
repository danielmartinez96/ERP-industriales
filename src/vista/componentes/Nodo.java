/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.componentes;

/**
 *
 * @author DanielM
 */
public class Nodo {
    private String codigo;
    private String nombre;

    public Nodo(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return  nombre +"("+codigo+")";
    }
    
    
    
}
