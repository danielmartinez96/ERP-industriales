package Modelo;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

//ESTA CLASE AYUDA A CONTROLAR EL ACCIONAMIENTO DEL MENU PRINCIPAL.
public class ActionLabel implements MouseListener {

    private JPanel pnlPop;
    private JLabel label;

    public ActionLabel() {
    }

    public ActionLabel(JPanel pnlPop, JLabel label) {
        this.pnlPop = pnlPop;
        this.label = label;

        this.pnlPop.setVisible(false);
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
        if (pnlPop.isVisible()) {
            pnlPop.setVisible(false);
        } else {
            pnlPop.setVisible(true);
        }
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        Font font = new Font("Arial", Font.BOLD, 12);
        this.label.setFont(font);
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        this.label.setFont(font);
    }

    @Override
    public void mousePressed(MouseEvent arg0) {
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
    }

}
