/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import gestorBD.RepositorioMantenimiento;
import java.util.ArrayList;
import modelo.KpiOEE;
import modelo.Maquina;
import modelo.ParteMaquina;
import modelo.enumeraciones.TipoGrafica;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import presentador.interfaces.IVKpiOEE;
import vista.componentes.Graficador;

/**
 *
 * @author Usuario
 */
public class PKpiOEE {

    private final IVKpiOEE vista;

    public PKpiOEE(IVKpiOEE vista) {
        this.vista = vista;
    }

    public ArrayList<Maquina> getMaquinas() {

        return RepositorioMantenimiento.getMaquinas();
    }

    public TipoGrafica[] getTiposGraficas() {
        return TipoGrafica.values();
    }

    public float calcularKpi(Maquina maquina) {
        KpiOEE oee = new KpiOEE();
        ArrayList<ParteMaquina> partes = new ArrayList<ParteMaquina>();

        partes = RepositorioMantenimiento.getPartes(maquina.getId());

        float valorOEE = oee.calcularOEE(partes);

        return valorOEE;

    }

    public void obtenerValoresGrafica(Maquina maquina, TipoGrafica tg) {
        Graficador g = new Graficador();
        ArrayList<ParteMaquina> partes = new ArrayList<ParteMaquina>();

        partes = RepositorioMantenimiento.getPartesYTiempoFalla(maquina.getId());

        if (tg.equals(TipoGrafica.BARRA)) {
            g.iniciarGraficoDeBarra(partes, maquina, "OEE ");
        } else if(tg.equals(TipoGrafica.TORTA)){
            g.iniciarGraficoTorta(partes, maquina, "OEE ");
        }
    }

}
