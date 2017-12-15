/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultRowSorter;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.RowSorter.SortKey;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Aviso;
import modelo.Maquina;
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
     final int filas= 20;
     String prioridad="Todos";
     String maquina="Todos";
     String fecha="Todos";
     final private  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    
    /**
     * Creates new form VListadoAviso
     */
    public VListadoAviso(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.parent= parent;
        initComponents();
        this.setLocationRelativeTo(this);
        this.presentador = new PListarAviso(this); 
        Configuraciones();
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
        btnFiltradoPorDefecto = new javax.swing.JButton();

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

        cbPrioridad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbPrioridadKeyPressed(evt);
            }
        });

        jLabel4.setText("Maquina:");

        cbMaquina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbMaquinaKeyPressed(evt);
            }
        });

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

        calendarFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                calendarFechaKeyPressed(evt);
            }
        });

        btnFiltradoPorDefecto.setText("Filtrado por Defecto");
        btnFiltradoPorDefecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltradoPorDefectoActionPerformed(evt);
            }
        });

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
                                .addGap(76, 76, 76)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(btnFiltradoPorDefecto))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(calendarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(cbPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(cbMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnFiltradoPorDefecto)
                                    .addComponent(jButton3))
                                .addGap(23, 23, 23)))
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
                            .addComponent(jButton2))))
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
     
        obtenerValoresFiltro();
        
   
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnFiltradoPorDefectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltradoPorDefectoActionPerformed


     prioridad="Todos";
     maquina="Todos";
     fecha="Todos";
     cbPrioridad.setSelectedIndex(0);
     cbMaquina.setSelectedIndex(0);
     calendarFecha.setCalendar(null);
        // TODO add your handling code here:
     actualizarTabla();
    }//GEN-LAST:event_btnFiltradoPorDefectoActionPerformed

    private void cbPrioridadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbPrioridadKeyPressed
    
    botonEnter(evt);
// TODO add your handling code here:
    }//GEN-LAST:event_cbPrioridadKeyPressed

    private void cbMaquinaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbMaquinaKeyPressed

        botonEnter(evt);
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMaquinaKeyPressed

    private void calendarFechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calendarFechaKeyPressed
        botonEnter(evt);    
        // TODO add your handling code here:
    }//GEN-LAST:event_calendarFechaKeyPressed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableAvisos;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnFiltradoPorDefecto;
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
                
        lista = presentador.listarAvisos(prioridad,maquina,fecha);
        
        
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

    private void Configuraciones() {
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
        
        TableAvisos.setModel(modelo);
        cbMaquina.addItem(new Maquina(-1, null, "Todos"));
        ArrayList<Maquina> maquinas=presentador.getMaquinas();
        for (Maquina maquina : maquinas) {
            cbMaquina.addItem(maquina);
        }
        TableAvisos.setFillsViewportHeight(true);
        TableAvisos.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        TableAvisos.getTableHeader().setReorderingAllowed(false) ;
        TableAvisos.getColumnModel().setColumnSelectionAllowed(false);
        TableAvisos.setRowSorter(sorter);
        DefaultRowSorter sort = ((DefaultRowSorter)TableAvisos.getRowSorter()); 
        ArrayList list = new ArrayList();
        list.add( new RowSorter.SortKey(3, SortOrder.DESCENDING) );
        sorter.setSortKeys(list);
        sorter.sort();
    
       
        
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
   
    //scrollPaneTabla = new JScrollPane(TableAvisos, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPaneTabla.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPaneTabla.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        dm= TableAvisos.getPreferredSize();
        scrollPaneTabla.setPreferredSize(new Dimension(dm.width,TableAvisos.getRowHeight()*filas));
        

    }

    private void botonEnter(KeyEvent evt) {
        
             if(evt.getKeyCode()== KeyEvent.VK_ENTER)
        {
            obtenerValoresFiltro();
        }
    }

    private void obtenerValoresFiltro() {
      
        
      prioridad = (String) cbPrioridad.getSelectedItem();
      Maquina maquina1 = (Maquina) cbMaquina.getSelectedItem();
      maquina= maquina1.getDescripcion();
      try
      {
           fecha = sdf.format(calendarFecha.getDate()); 
      }catch(NullPointerException ex)
      {
         fecha="Todos";
      }
         
      
        actualizarTabla();
    }

   


}


