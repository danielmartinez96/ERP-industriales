/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import gestorBD.RepositorioMantenimiento;
import java.util.ArrayList;
import modelo.KpiLEF;
import modelo.Maquina;
import modelo.ParteMaquina;
import modelo.enumeraciones.TipoGrafica;
import presentador.interfaces.IVKpiLEF;
import vista.componentes.Graficador;

/**
 *
 * @author Usuario
 */
public class PKpiLEF {

    private final IVKpiLEF vista;

    public PKpiLEF(IVKpiLEF vista) {
        this.vista = vista;
    }

    public ArrayList<Maquina> getMaquinas() {

        return RepositorioMantenimiento.getMaquinas();
    }

    public TipoGrafica[] getTiposGraficas() {
        return TipoGrafica.values();
    }

    public float calcularKpi(Maquina maquina) {
        KpiLEF oee = new KpiLEF();
        ArrayList<ParteMaquina> partes = new ArrayList<ParteMaquina>();

        partes = RepositorioMantenimiento.getPartes(maquina.getId());

        float valorOEE = oee.calcularLEF(partes);

        return valorOEE;
    }

    public void obtenerValoresGrafica(Maquina maquina, TipoGrafica tg) {
        Graficador g = new Graficador();
        ArrayList<ParteMaquina> partes = new ArrayList<ParteMaquina>();

        partes = RepositorioMantenimiento.getPartesYTiempoFalla(maquina.getId());

        if (tg.equals(TipoGrafica.BARRA)) {
            g.iniciarGraficoDeBarra(partes, maquina, "LEF ");
        } else if (tg.equals(TipoGrafica.TORTA)) {
            g.iniciarGraficoTorta(partes, maquina, "LEF ");
        }
    }

}
