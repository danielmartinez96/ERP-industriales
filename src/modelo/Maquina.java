/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.enumeraciones.TipoMaquina;
import java.util.ArrayList;

/**
 *
 * @author DanielM
 */
public class Maquina {
    private int id;
    private TipoMaquina tipoMaquina;
    private String descripcion;
    private ArrayList<ParteMaquina> partesMaquina;

    public Maquina()
    {
        this.partesMaquina = new ArrayList<>();
    }
    public Maquina(int id, TipoMaquina maquina, String descripcion) {
        this.id = id;
        this.tipoMaquina = maquina;
        this.descripcion = descripcion;
        this.partesMaquina = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoMaquina getTipoMaquina() {
        return tipoMaquina;
    }

    public void setTipoMaquina(TipoMaquina maquina) {
        this.tipoMaquina = maquina;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<ParteMaquina> getPartesMaquina() {
        return partesMaquina;
    }

    public void setPartesMaquina(ArrayList<ParteMaquina> partesMaquina) {
        this.partesMaquina = partesMaquina;
    }

    @Override
    public String toString() {
        return descripcion; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
