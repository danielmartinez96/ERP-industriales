
package Modelo;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JDialog;
import javax.swing.JLabel;

//ESTA CLASE AYUDA AL ACCIONAMIENTO DE LOS FORULARIOS AL HACER CLICK.
public class BotonLabel implements MouseListener { 
    private JLabel label;
    private JDialog vista;
    public BotonLabel(JDialog vista,JLabel label) {
        this.label = label;
        this.vista=vista;
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
       this.vista.setVisible(true);
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
