/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Frame;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Aviso;
import presentador.PListarAviso;
import presentador.interfaces.IVAviso;
import presentador.interfaces.IVListarAviso;
import presentador.interfaces.IVOrdenTrabajo;

/**
 *
 * @author Usuario
 */
public class VListadoAviso extends javax.swing.JDialog implements IVListarAviso{
    PListarAviso presentador;
    DefaultTableModel modelo;
    Frame parent;

    
    /**
     * Creates new form VListadoAviso
     */
    public VListadoAviso(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.parent= parent;
        initComponents();
        this.setLocationRelativeTo(this);
        tablaConfiguraciones();
        this.presentador = new PListarAviso(this); 
        actualizarTabla();
        setVisible(true);
    }

    public JTable getTableAvisos() {
        return TableAvisos;
    }

    public void setTableAvisos(JTable TableAvisos) {
        this.TableAvisos = TableAvisos;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnSalir = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableAvisos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Listado de Avisos");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        TableAvisos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TableAvisos);

        jButton1.setText("Crear OT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Nuevo Aviso");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(45, 45, 45)
                .addComponent(jButton2)
                .addGap(50, 50, 50)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          crearOT();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    IVAviso vista = new VAviso(parent, true);  
    
    actualizarTabla();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableAvisos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizarTabla() {
        
        int sizeModel = modelo.getRowCount();
 
	    for (int i = 0; i < sizeModel ; i ++) {
	    	modelo.removeRow(0);
	    }
 
        
        ArrayList<Aviso> lista;
                
        lista = presentador.listarAvisos();
        
        
        Object fila [] = new Object[modelo.getColumnCount()];

        
        for(int i=0; i<lista.size(); i++){
            fila[0]=lista.get(i).getId();
            fila[1]=lista.get(i).getEstado();
            fila[2]=lista.get(i).getTipo();
            fila[3]=lista.get(i).getCreacion();
            fila[4]=lista.get(i).getDescripcion();
            fila[5]=lista.get(i).getCantNecesariaRep();
            fila[6]=lista.get(i).getSectorResponsable();
            fila[7]=lista.get(i).getPrioridad();
            fila[8]=lista.get(i).getParteMaquina();
            fila[9]=lista.get(i).getPersonal();
            fila[10]=lista.get(i).getMaquina();
            
            modelo.addRow(fila);
        }
    

    }

    private void tablaConfiguraciones() {
        
        
    modelo= new DefaultTableModel(){ 
    @Override
    
    public boolean isCellEditable(int row, int column) {
       return false;
    }};
    
        modelo.addColumn("ID");
        modelo.addColumn("Estado");
        modelo.addColumn("Tipo");
        modelo.addColumn("Fecha Inicio");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Canidad necesaria reparacion");
        modelo.addColumn("Sector Responsable");
        modelo.addColumn("Prioridad");
        modelo.addColumn("Parte de maquina");
        modelo.addColumn("Soliciante");
        modelo.addColumn("Maquina");
    
      TableRowSorter sorter = new TableRowSorter(modelo);
        TableAvisos.setFillsViewportHeight(true);
        TableAvisos.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        TableAvisos.getTableHeader().setReorderingAllowed(false) ;
        TableAvisos.getColumnModel().setColumnSelectionAllowed(false);
        TableAvisos.setRowSorter(sorter);
        TableAvisos.setModel(modelo);
    }

    private void crearOT() {
      
        if(TableAvisos.getSelectedRow()!=-1)
        {
            int filaSeleccionada = TableAvisos.getRowSorter().
                    convertRowIndexToModel(TableAvisos.getSelectedRow()); 
            int i = (int) TableAvisos.getModel().getValueAt(filaSeleccionada, 0);
           
            IVOrdenTrabajo vista = new VOrdenTrabajo (parent, true,i);
            
        }else
        {
            JOptionPane.showConfirmDialog(null, "No selecciono ningun aviso","ERROR"
, JOptionPane.CLOSED_OPTION);
        }
        
    }


}


