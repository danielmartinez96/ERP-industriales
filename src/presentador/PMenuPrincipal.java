/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import interfaces.IVMenuPrincipal;

public class PMenuPrincipal {

    private IVMenuPrincipal vista;

    public PMenuPrincipal(IVMenuPrincipal vista) {
        this.vista = vista;
        vista.configuracion();
    }

    
    public void ejecutarComando()
    {
        
    }
    /*
        //CONTROLA EL ACCIONAMIENO DEL MENU PRINCIPAL.
        ActionLabel actionIngYMant = new ActionLabel(frmPrincipal.getPnlIngYMantenimiento(), frmPrincipal.getLblIngenieriaYMantenimiento());
        frmPrincipal.getLblIngenieriaYMantenimiento().addMouseListener(actionIngYMant);

        ActionLabel actionAvisos = new ActionLabel(frmPrincipal.getPnlAvisos(), frmPrincipal.getLblAvisos());
        frmPrincipal.getLblAvisos().addMouseListener(actionAvisos);

        ActionLabel actionOT = new ActionLabel(frmPrincipal.getPnlOT(), frmPrincipal.getLblOT());
        frmPrincipal.getLblOT().addMouseListener(actionOT);

        ActionLabel actionPM = new ActionLabel(frmPrincipal.getPnlPM(), frmPrincipal.getLblPM());
        frmPrincipal.getLblPM().addMouseListener(actionPM);

        //CONTROLA LA APARICION DE LOS FORMULARIOS AL HACER CLICK. 
        frmAviso = new VAviso(frmPrincipal, true);
        BotonLabel actionAv = new BotonLabel(frmAviso, frmPrincipal.getLblNuevoAviso());
        frmPrincipal.getLblNuevoAviso().addMouseListener(actionAv);

        this.frmPrincipal.getBtnBuscar().addActionListener(this);

        frmPrincipal.show();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //CONTROLA EL FUNCIONAMIENTO DEL FILTRO PARA LOS DISTINTOS FORMULARIOS.
        if (e.getSource() == frmPrincipal.getBtnBuscar()) {
            try {
                switch (frmPrincipal.getTxtFiltro().getText()) {
                    case "IM01":
                        frmAviso.setTitle("Nuevo aviso");
                        frmAviso.setLocationRelativeTo(null);
                        frmAviso.show();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "El codigo de operacion no existe. Intente de nuevo.");
                        break;
                }

            } catch (Exception ex) {

            }

        }
    }
     */
}
