/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.componentes;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Usuario
 */
public class Graficador {

    public void iniciarGraficoTorta() {
        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("Categría 1", 43.2);
        data.setValue("Categría 2", 27.9);
        data.setValue("Categría 4", 79.5);

        //Creamos un Chart
        JFreeChart chart = ChartFactory.createPieChart("Ejemplo de grafico de torta", data, true, true, true);

        //Creamos una especie de frame y mostramos el JFreeChart en él
        //Este constructor nos pide el título del Chart y el chart creado
        ChartFrame frame = new ChartFrame("Grafico de torta", chart);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    public void iniciarGraficoDeCurva() {
        DefaultCategoryDataset lineChartDataset = new DefaultCategoryDataset();
        lineChartDataset.addValue(80, "visitas", "Julio");
        lineChartDataset.addValue(300, "visitas", "Agosto");
        lineChartDataset.addValue(1450, "visitas", "Septiembre");
        lineChartDataset.addValue(1400, "visitas", "Octubre"); 
        lineChartDataset.addValue(1000, "visitas", "Noviembre");   

        //Creamos un Chart
        JFreeChart chart = ChartFactory.createLineChart("Ejemplo de grafico de curva", "Vaiable 1", "Variable 2", lineChartDataset, PlotOrientation.VERTICAL, true, true, false);
        

       //Creamos una especie de frame y mostramos el JFreeChart en él
        //Este constructor nos pide el título del Chart y el chart creado
        ChartFrame frame = new ChartFrame("Grafico de curva", chart);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}
