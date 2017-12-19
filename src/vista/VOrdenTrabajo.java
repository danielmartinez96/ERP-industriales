/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Calendar;
import modelo.*;
import modelo.enumeraciones.EstadoAviso;
import modelo.enumeraciones.EstadoOT;
import modelo.enumeraciones.Responsable;
import modelo.enumeraciones.TipoOT;
import presentador.POrdenTrabajo;
import presentador.interfaces.IVAviso;
import presentador.interfaces.IVListarAviso;
import presentador.interfaces.IVOrdenTrabajo;

/**
 *
 * @author Usuario
 */
public class VOrdenTrabajo extends javax.swing.JDialog implements IVOrdenTrabajo {

    POrdenTrabajo presentador;
    Aviso av;
    Frame parent;

    /**
     * Creates new form VOrdenTrabajo
     */
    public VOrdenTrabajo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.parent= parent;
        initComponents();
        inicializar();
        textAviso.setText("Pulse el boton buscar para buscar un aviso");
        cbMaquina.setEnabled(false);
        cbParteMaquina.setEnabled(false);
        cbResponsable.setEnabled(false);
        cbTipo.setEnabled(false);
        dateFin.setEnabled(false);
        dateInicio.setEnabled(false);
        setVisible(true);
        
    }

    public VOrdenTrabajo(java.awt.Frame parent, boolean modal,int key) {
        super(parent, modal);
        initComponents();
        inicializar();
         this.agregarAviso(key);
        setVisible(true);
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
        btnAgregarOT = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox();
        dateInicio = new com.toedter.calendar.JDateChooser();
        dateFin = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        cbResponsable = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAviso = new javax.swing.JTextPane();
        btnBuscarAviso = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        cbMaquina = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbParteMaquina = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Orden de Trabajo");

        btnAgregarOT.setText("Agregar OT");
        btnAgregarOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarOTActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo:");

        jLabel5.setText("Fecha Inicio: ");

        jLabel6.setText("Fecha Fin:");

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Responsable: ");

        cbResponsable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setText("Aviso");

        jScrollPane1.setViewportView(textAviso);

        btnBuscarAviso.setText("Buscar");
        btnBuscarAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAvisoActionPerformed(evt);
            }
        });

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Maquina"));

        jLabel9.setText("Maquina:");

        jLabel7.setText("Parte Maquina:");

        jLayeredPane1.setLayer(cbMaquina, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cbParteMaquina, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(51, 51, 51)
                        .addComponent(cbMaquina, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(22, 22, 22)
                        .addComponent(cbParteMaquina, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbParteMaquina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                        .addContainerGap(327, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(52, 52, 52)
                                .addComponent(dateInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbResponsable, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dateFin, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                .addGap(2, 2, 2)))
                        .addGap(18, 18, 18))
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addComponent(jLayeredPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarAviso)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgregarOT)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(dateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(cbResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuscarAviso)
                                .addGap(230, 230, 230)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(dateFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jLayeredPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAgregarOT))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarOTActionPerformed
        agregarOT();
        dispose();
    }//GEN-LAST:event_btnAgregarOTActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAvisoActionPerformed
        dispose();
        IVListarAviso vista = new VListadoAviso(parent,true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarAvisoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VOrdenTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VOrdenTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VOrdenTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VOrdenTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarOT;
    private javax.swing.JButton btnBuscarAviso;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<Maquina> cbMaquina;
    private javax.swing.JComboBox<ParteMaquina> cbParteMaquina;
    private javax.swing.JComboBox cbResponsable;
    private javax.swing.JComboBox cbTipo;
    private com.toedter.calendar.JDateChooser dateFin;
    private com.toedter.calendar.JDateChooser dateInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextPane textAviso;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizar() {
        cbTipo.removeAllItems();
        cbResponsable.removeAllItems();
        
       // ArrayList<Aviso> avisos = presentador.getAviso();
               
      //  for (Aviso aviso : avisos) {
       //     cbAviso.addItem(aviso);
       // }
        
        TipoOT[] tipos = presentador.getTipos();
        
        for (int i = 0; i < tipos.length; i++) {
            cbTipo.addItem(tipos[i]);
        }

        ArrayList<Maquina> maquinas = presentador.getMaquinas();

        for (Maquina maquina : maquinas) {
            cbMaquina.addItem(maquina);
        }

        Responsable[] responsable = presentador.getResponsables();
        
        for (int i = 0; i < tipos.length; i++) {
            cbResponsable.addItem(responsable[i]);
        }
        
     

    }

    @Override
    public void agregarListener() {
        cbMaquina.addItemListener(new ItemListener() {
        
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    // los nuevos registros son agregados al MODEL del JCombo HIJO
                    Maquina item = (Maquina) e.getItem();
                    presentador.agregarPartesMaquinas(item.getId());
                }

            }
        });
    }

    @Override
    public void agregarParte(ArrayList<ParteMaquina> pm) {
        cbParteMaquina.removeAllItems();
        for (ParteMaquina parteMaquina : pm) {
            cbParteMaquina.addItem(parteMaquina);
        }
    }

    public void agregarOT() {
        //int id = Integer.valueOf(txtId.getText());
        TipoOT tipoOT = (TipoOT) cbTipo.getSelectedItem();
        Responsable responsable = (Responsable) cbResponsable.getSelectedItem();
        Calendar calInicio = dateInicio.getCalendar();
        Calendar calFin = dateFin.getCalendar();
        ParteMaquina parteMaquina = (ParteMaquina) cbParteMaquina.getSelectedItem();
       // Aviso aviso = (Aviso) cbAviso.getSelectedItem();
       av.setEstado(EstadoAviso.EN_TRATAMIENTO);
        this.presentador.guardarOT(av,EstadoOT.ABIERTO, tipoOT, responsable, calInicio, calFin, parteMaquina);
    }

    @Override
    public void agregarAviso(int key) {
      
        av= presentador.getAviso(key);
        
        textAviso.setText(av.toString2());
        this.repaint();
   
    }

    private void inicializar() {
     
         this.presentador = new POrdenTrabajo(this);
         textAviso.setEditable(false);
         this.setLocationRelativeTo(this);
         actualizar();

    }

    
    
}
