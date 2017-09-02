/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.main;

import Vista.*;
import Modelo.*;
import Controlador.*;
/**
 *
 * @author Axel y Ampy
 */
public class ERP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        frmMenuPrincipal frmPrincipal = new frmMenuPrincipal();
        ControladorDepartamentos controlIng = new ControladorDepartamentos(frmPrincipal); 
        
        controlIng.iniciar();
        
        Graficador g = new Graficador();
        g.iniciarGraficoDeCurva();
        g.iniciarGraficoTorta();
       
    }
    
}
