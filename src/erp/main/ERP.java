/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.main;

import gestorBD.conexion.EjecucionResultSet;
import gestorBD.conexion.EjecutorRutinaDB;
import java.io.BufferedReader;
import java.io.FileReader;
import vista.VMenuPrincipal;
import vista.componentes.Graficador;
import presentador.PMenuPrincipal;
/**
 *
 * @author Axel y Ampy
 */
public class ERP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        try {
            String sql= "\n";
            String linea;
             BufferedReader bf = new BufferedReader(new FileReader("SQL/sql creacion.txt"));
             while((linea = bf.readLine())!=null) {
            sql= sql+linea+"\n";
              }
            EjecutorRutinaDB.ejecutarUpdateStatement(sql);
             //System.out.println(sql);
            bf.close();
             
        } catch (Exception e) {
            
        }
       
        
        
        VMenuPrincipal vista = new VMenuPrincipal();
        
        
        
      //  Graficador g = new Graficador();
       // g.iniciarGraficoDeCurva();
       // g.iniciarGraficoTorta();
       
    }
    
}
