/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador.interfaces;

import modelo.Maquina;

/**
 *
 * @author Usuario
 */
public interface IVKpiLEF {
    public void acualizar();
    public void actualizarGrafica(Maquina maquina);
    public void calcularValorKpi(Maquina maquina);
    
}
