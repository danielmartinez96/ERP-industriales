/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import gestorBD.RepositorioMantenimiento;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Usuario
 */
public class KpiLEF {
    private ArrayList<ParteMaquina> partesMaquina;
    private ArrayList<FalloDeMaquina> fallosMaquina;
    
    public float calcularLEF(ArrayList<ParteMaquina> partes){
        float valorParte=0;
        int tiempoTotalFalla=0;
        float acumulador=0;
        float valorTotal=0;
        
        partesMaquina = partes;
        
        for(int i=0; i<partes.size(); i++){
            fallosMaquina = RepositorioMantenimiento.obtenerTiemposFallos(partesMaquina.get(i).getId());
            
            for(int j=0; j<fallosMaquina.size(); j++){
                int dias = fallosMaquina.get(i).getDias();
                int horas = fallosMaquina.get(i).getCalendarTiempoDeFalla().get(Calendar.HOUR_OF_DAY);
                int minutos = fallosMaquina.get(i).getCalendarTiempoDeFalla().get(Calendar.MINUTE);
           
                tiempoTotalFalla = + 1440 * dias + horas*60 + minutos;
            }
            RepositorioMantenimiento.agregarTiempoFallaAParte(partesMaquina.get(i).getId(), tiempoTotalFalla);
            
            valorParte = tiempoTotalFalla/ 1000;

            acumulador =+ valorParte;
        }
   
        valorTotal = acumulador/partes.size();
        
        return valorTotal;
    }
}
