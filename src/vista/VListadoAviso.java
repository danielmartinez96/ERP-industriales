/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Aviso;
import modelo.Maquina;
import modelo.enumeraciones.PrioridadAviso;
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
    JScrollBar barra;
    int alto;
    
   
    
    /**
     * Creates new form VListadoAviso
     */
    public VListadoAviso(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.parent= parent;
        initComponents();
        this.setLocationRelativeTo(this);
        this.presentador = new PListarAviso(this); 
        tablaConfiguraciones();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbPrioridad = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbMaquina = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        btnSiguiente = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        scrollPaneTabla = new javax.swing.JScrollPane();
        TableAvisos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        calendarFecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Listado de Avisos");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

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

        jLabel2.setText("Filtro");

        jLabel3.setText("Prioridad:");

        jLabel4.setText("Maquina:");

        jButton3.setText("Filtrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnSiguiente.setText("Siguiente");

        btnAnterior.setText("Anterior");

        scrollPaneTabla.setHorizontalScrollBar(null);

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
        scrollPaneTabla.setViewportView(TableAvisos);

        jLabel5.setText("Fecha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(calendarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(45, 45, 45)
                                .addComponent(jButton2)
                                .addGap(50, 50, 50)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator3))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAnterior)
                        .addGap(126, 126, 126)
                        .addComponent(btnSiguiente)
                        .addGap(298, 298, 298))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(scrollPaneTabla)
                        .addContainerGap())))
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
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(cbPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(cbMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3)
                            .addComponent(jLabel5))
                        .addGap(20, 20, 20)
                        .addComponent(scrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSiguiente)
                            .addComponent(btnAnterior))
                        .addGap(11, 11, 11)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalir)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addComponent(calendarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      String prioridad = (String) cbPrioridad.
              .getSelectedItem();
        Maquina maquina = (Maquina) cbMaquina.getSelectedItem();
        Calendar fecha = calendarFecha.getCalendar();
        filtrar(,fecha);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableAvisos;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSiguiente;
    private com.toedter.calendar.JDateChooser calendarFecha;
    private javax.swing.JComboBox<Object> cbMaquina;
    private javax.swing.JComboBox<String> cbPrioridad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JScrollPane scrollPaneTabla;
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
    
        paginadoTabla();
    }

    private void tablaConfiguraciones() {
    //variables
    ArrayList<String> lista=new ArrayList<>();
    modelo= new DefaultTableModel(){ 
    @Override
    public boolean isCellEditable(int row, int column) {
       return false;
    }};
     TableRowSorter sorter = new TableRowSorter(modelo);    
      
    
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
        cbPrioridad.addItem("Todos");
        lista= presentador.getPrioridades();
        for (String cadena : lista) {
           cbPrioridad.addItem(cadena); 
        }
        cbMaquina.addItem("Todos");
        ArrayList<Maquina> maquinas=presentador.getMaquinas();
        for (Maquina maquina : maquinas) {
            cbMaquina.addItem(maquina);
        }
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

    private void paginadoTabla() {
         Dimension dm;  
    final int filas= 20;
    //scrollPaneTabla = new JScrollPane(TableAvisos, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPaneTabla.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPaneTabla.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        dm= TableAvisos.getPreferredSize();
        scrollPaneTabla.setPreferredSize(new Dimension(dm.width,TableAvisos.getRowHeight()*filas));
        
        btnSiguiente.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            
            alto= TableAvisos.getRowHeight()*(filas-1);
            barra= scrollPaneTabla.getVerticalScrollBar();
            barra.setValue(barra.getValue()+alto);
        }
    });
         btnAnterior.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            alto= TableAvisos.getRowHeight()*(filas-1);
            barra= scrollPaneTabla.getVerticalScrollBar();
            barra.setValue(barra.getValue()-alto);
        }
    });
        
         
         
    }

    private void filtrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}


