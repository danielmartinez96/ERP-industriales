/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesAuxiliares;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import modelo.enumeraciones.PrioridadAviso;
import modelo.enumeraciones.TipoAviso;

/**
 *
 * @author navar
 */

public class RowsRenderer extends DefaultTableCellRenderer {
private int columna ;

public RowsRenderer(int Colpatron)
{
    this.columna = Colpatron;
}

@Override
public Component getTableCellRendererComponent (JTable table, Object value, boolean selected, boolean focused, int row, int column)
{        
    
    setForeground(Color.black);
    table.setForeground(Color.black);
    super.getTableCellRendererComponent(table, value, selected, focused, row, column);
    
    
    if(table.getValueAt(row,columna).equals(PrioridadAviso.BAJA))
    {
        this.setBackground(Color.green);
    
    }else if(table.getValueAt(row, columna).equals(PrioridadAviso.MEDIA)){
        this.setBackground(Color.yellow);
    }else if(table.getValueAt(row, columna).equals(PrioridadAviso.ALTA))
    {
          this.setBackground(Color.red);
    }else if(table.getValueAt(row, columna).equals(PrioridadAviso.URGENTE))
    {
        this.setForeground(Color.white);
          this.setBackground(Color.black);
    }
        
    return this;
  }
  }


