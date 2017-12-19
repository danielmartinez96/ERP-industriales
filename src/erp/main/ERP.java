/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.main;

import vista.VMenuPrincipal;
import vista.componentes.Graficador;
/**
 *
 * @author Axel y Ampy
 */
public class ERP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
      /* try {
            String sql= "";
            String linea;
             BufferedReader bf = new BufferedReader(new FileReader("SQL/sql creacion.txt"));
             while((linea = bf.readLine())!=null) {
            sql= sql+linea;
                  }
             System.out.println(sql);
            EjecutorRutinaDB.crearBD(sql);
            
            bf.close();
             
        } catch (Exception e) {
            
        }
      */ 
        
        
        VMenuPrincipal vista = new VMenuPrincipal();
        
        
        
      /*Graficador g = new Graficador();
       g.iniciarGraficoDeCurva();
       g.iniciarGraficoTorta();*/
       
    }
    
}
