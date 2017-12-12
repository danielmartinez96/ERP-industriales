/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.OrdenTrabajo;
import presentador.PListarOT;
import presentador.interfaces.IVListarOT;

/**
 *
 * @author DanielM
 */
public class VListarOT extends javax.swing.JDialog implements IVListarOT{
    PListarOT presentador;
    DefaultTableModel modelo;
    /**
     * Creates new form ListarOT
     */
    public VListarOT(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this);
        tablaConfiguraciones();
        presentador= new PListarOT(this);
        actualizarTablaDeOT();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnSalir = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableOT = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Listado de OT");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        TableOT.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TableOT);

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableOT;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables


    @Override
    public void actualizarTablaDeOT() {
 
        ArrayList<OrdenTrabajo> lista ;
                
        lista = presentador.listarOT();
        
     
        Object fila [] = new Object[modelo.getColumnCount()];
        
        for(int i=0; i<lista.size(); i++){
            fila[0]=lista.get(i).getId();
            fila[1]=lista.get(i).getFechaInicio();
            fila[2]=lista.get(i).getFechaFin();
            fila[3]=lista.get(i).getEstado();
            fila[4]=lista.get(i).getAviso();
            fila[5]=lista.get(i).getTipo();
            fila[6]=lista.get(i).getResp();
            fila[7]=lista.get(i).getParte();
            
            
            modelo.addRow(fila);
        }
       
      
    }
    
  
       private void tablaConfiguraciones() {
        
        
    modelo= new DefaultTableModel(){ 
    @Override
    
    public boolean isCellEditable(int row, int column) {
       return false;
    }};
    
         modelo.addColumn("id");
         modelo.addColumn("Fecha Inicio");
         modelo.addColumn("Fecha Fin");
         modelo.addColumn("Estado");
         modelo.addColumn("Aviso");
         modelo.addColumn("Tipo OT");
         modelo.addColumn("Responsable");
         modelo.addColumn("Parte Maquina");
    
       TableRowSorter sorter = new TableRowSorter(modelo);
       TableOT.setFillsViewportHeight(true);
       TableOT.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
       TableOT.getTableHeader().setReorderingAllowed(false) ;
       TableOT.getColumnModel().setColumnSelectionAllowed(false);
       TableOT.setRowSorter(sorter);
       TableOT.setModel(modelo);
    }
}
