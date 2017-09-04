/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import gestorBD.EjecutorRutinaDB;

/**
 *
 * @author DanielM
 */
public abstract class Modelo {
    private EjecutorRutinaDB rutina;

    public EjecutorRutinaDB getRutina() {
        return rutina;
    }

    public void setRutina(EjecutorRutinaDB rutina) {
        this.rutina = rutina;
    }
    
    
}
