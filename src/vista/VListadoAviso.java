/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import clasesAuxiliares.Page;
import clasesAuxiliares.RowsRenderer;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Aviso;
import modelo.Maquina;
import modelo.enumeraciones.EstadoAviso;
import modelo.enumeraciones.EstadoOT;
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
     final int filas= 20;
     String prioridad="Todos";
     String maquina="Todos";
     String fecha="Todos";
     String estado="Todos";
     final private  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
     Page pagina;
     int paginaMax=1;
     int paginaActual;
  
    ArrayList<Aviso> lista;
    /**
     * Creates new form VListadoAviso
     */
    public VListadoAviso(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.parent= parent;
        initComponents();
         setTitle("Listado de Avisos");
        paginaActual= Integer.valueOf(txtPaginaActual.getText());
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
        btnSalir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        btnSiguiente = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        scrollPaneTabla = new javax.swing.JScrollPane();
        TableAvisos = new javax.swing.JTable();
        txtPaginaActual = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        labelPaginaMaxima = new javax.swing.JLabel();
        btnIr = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        calendarDesde = new com.toedter.calendar.JDateChooser();
        btnFiltradoPorDefecto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbMaquina = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbPrioridad = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        calendarHasta = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

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

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

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

        txtPaginaActual.setText("1");
        txtPaginaActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPaginaActualKeyPressed(evt);
            }
        });

        jLabel6.setText("De 1");

        labelPaginaMaxima.setText("...a X");

        btnIr.setText("Ir");
        btnIr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrActionPerformed(evt);
            }
        });

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtro"));

        calendarDesde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                calendarDesdeKeyPressed(evt);
            }
        });

        btnFiltradoPorDefecto.setText("Filtrado por Defecto");
        btnFiltradoPorDefecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltradoPorDefectoActionPerformed(evt);
            }
        });

        jLabel3.setText("Prioridad:");

        cbMaquina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbMaquinaKeyPressed(evt);
            }
        });

        jLabel5.setText("Fecha de-hasta:");

        cbPrioridad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbPrioridadKeyPressed(evt);
            }
        });

        jButton3.setText("Filtrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Maquina:");

        calendarHasta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                calendarHastaKeyPressed(evt);
            }
        });

        jLabel2.setText("Estado");

        jLayeredPane1.setLayer(calendarDesde, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnFiltradoPorDefecto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cbMaquina, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cbPrioridad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(calendarHasta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cbEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(calendarDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(calendarHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnFiltradoPorDefecto)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnFiltradoPorDefecto)
                        .addComponent(jButton3))
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(calendarDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(cbMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addComponent(calendarHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(18, 18, 18)
                        .addComponent(btnSiguiente)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(11, 11, 11)
                        .addComponent(txtPaginaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelPaginaMaxima)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIr)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(scrollPaneTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 1048, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLayeredPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguiente)
                    .addComponent(btnAnterior)
                    .addComponent(txtPaginaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(labelPaginaMaxima)
                    .addComponent(btnIr))
                .addGap(11, 11, 11)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
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
     estado="Todos";
     paginaActual=0;
     txtPaginaActual.setText(""+1);
     cbPrioridad.setSelectedIndex(0);
     cbMaquina.setSelectedIndex(0);
     cbEstado.setSelectedIndex(0);
     calendarDesde.setCalendar(null);
      calendarHasta.setCalendar(null);
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

    private void calendarDesdeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calendarDesdeKeyPressed
        botonEnter(evt);    
        // TODO add your handling code here:
    }//GEN-LAST:event_calendarDesdeKeyPressed

    private void btnIrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrActionPerformed

        cambiarPagina();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIrActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
      anterior();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed

  siguiente();
// TODO add your handling code here:
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void txtPaginaActualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaginaActualKeyPressed
       
     
             if(evt.getKeyCode()== KeyEvent.VK_ENTER)
        {
          cambiarPagina();
        }        
// TODO add your handling code here:
        
    }//GEN-LAST:event_txtPaginaActualKeyPressed

    private void calendarHastaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calendarHastaKeyPressed
        botonEnter(evt);
        // TODO add your handling code here:
    }//GEN-LAST:event_calendarHastaKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
       
       
// TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableAvisos;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnFiltradoPorDefecto;
    private javax.swing.JButton btnIr;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSiguiente;
    private com.toedter.calendar.JDateChooser calendarDesde;
    private com.toedter.calendar.JDateChooser calendarHasta;
    private javax.swing.JComboBox<String> cbEstado;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelPaginaMaxima;
    private javax.swing.JScrollPane scrollPaneTabla;
    private javax.swing.JTextField txtPaginaActual;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizarTabla() {
        
        int sizeModel = modelo.getRowCount();
 
	    for (int i = 0; i < sizeModel ; i ++) {
	    	modelo.removeRow(0);
	    }
 
        
       
               
      pagina = presentador.listarAvisos(prioridad,maquina,estado,fecha,paginaActual,filas);
       
         
      lista= pagina.getResults();
     
       
       
        Object fila [] = new Object[modelo.getColumnCount()];
        
        
         paginaMax=pagina.getLastPage();
        labelPaginaMaxima.setText("... a "+paginaMax);
        for(int i=0; i<lista.size(); i++){
            fila[1]=lista.get(i).getEstado();
            fila[2]=lista.get(i).getId();
            fila[3]=lista.get(i).getTipo();
            fila[0]=lista.get(i).getCreacion();
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
     
        modelo.addColumn("Fecha Inicio");
        modelo.addColumn("Estado");
        modelo.addColumn("ID");
        modelo.addColumn("Tipo");
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
        
        EstadoAviso[] estados=EstadoAviso.values();
        cbEstado.addItem("Todos");
        for(int i=0;i<estados.length;i++)
        {
            cbEstado.addItem(estados[i].toString());
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
        TableAvisos.setDefaultRenderer(Object.class, new RowsRenderer(7));
        

 
txtPaginaActual.addKeyListener(new KeyAdapter()
{
   public void keyTyped(KeyEvent e)
   {
      char caracter = e.getKeyChar();

      // Verificar si la tecla pulsada no es un digito
      if(((caracter < '0') ||
         (caracter > '9')) &&
         (caracter != '\b' /*corresponde a BACK_SPACE*/))
      {
         e.consume();  // ignorar el evento de teclado
      }
   }
});
     //   TableAvisos.setRowSorter(sorter);
      //  DefaultRowSorter sort = ((DefaultRowSorter)TableAvisos.getRowSorter()); 
       // ArrayList list = new ArrayList();
       // list.add( new RowSorter.SortKey(3, SortOrder.DESCENDING) );
       // sorter.setSortKeys(list);
      // sorter.sort();
    
        
     
         
         
    }

    private void crearOT() {
      
        if(TableAvisos.getSelectedRow()!=-1)
        {
     //       int filaSeleccionada = TableAvisos.getRowSorter().
       //             convertRowIndexToModel(TableAvisos.getSelectedRow());
            int filaSeleccionada= TableAvisos.getSelectedRow();
            int i = (int) TableAvisos.getModel().getValueAt(filaSeleccionada, 2);
 EstadoAviso estado=(EstadoAviso)TableAvisos.getModel().getValueAt(filaSeleccionada, 1);
            if(estado== EstadoAviso.ABIERTO)
            {
              
          IVOrdenTrabajo vista = new VOrdenTrabajo (parent, true,i);
          actualizarTabla();
            }else
            {
                 JOptionPane.showConfirmDialog(null, "Solo se puede crear una ot de un aviso ABIERTO","Operacion no posible"
, JOptionPane.CLOSED_OPTION); 
            }
            
          
            
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
      estado= (String)cbEstado.getSelectedItem();
      try
      { 
          Date date;
          date = calendarDesde.getDate();
          date.setHours(0);
          date.setMinutes(0);
          String fechaDesde = sdf.format(date);
          
          
          
          date= calendarHasta.getDate();
          date.setHours(0);
          date.setMinutes(0);
          String fechaHasta = sdf.format(date);
          
          
          fecha= " '"+fechaDesde+"' AND '"+fechaHasta+"' ";
         
      }catch(NullPointerException ex)
      {
         fecha="Todos";
      }
         
      
        actualizarTabla();
    }

    private void cambiarPagina() {
        
        
      try
      {
           int numero=Integer.valueOf(txtPaginaActual.getText());
             if(numero<1)
       {
           txtPaginaActual.setText(""+1);
           
       }else if(numero>paginaMax)
           {
               txtPaginaActual.setText(""+paginaMax);
           }
           
            
        paginaActual=Integer.valueOf(txtPaginaActual.getText());
           
      }catch(NumberFormatException ex)
      {
          
      } 
        
         actualizarTabla();
    }

    private void siguiente() {
             int numero= Integer.valueOf(txtPaginaActual.getText());
        numero++;
        txtPaginaActual.setText(""+numero);
          cambiarPagina();
    }

    private void anterior() {
          int numero= Integer.valueOf(txtPaginaActual.getText());
        numero--;
        txtPaginaActual.setText(""+numero);
          cambiarPagina();
    }

   


}


