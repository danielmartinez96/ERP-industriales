/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador.interfaces;

import java.util.ArrayList;
import modelo.ParteMaquina;

/**
 *
 * @author DanielM
 */
public interface IVAviso {

    void actualizar();
    public void agregarParte(ArrayList<ParteMaquina> pm);
    void agregarListener();
}
