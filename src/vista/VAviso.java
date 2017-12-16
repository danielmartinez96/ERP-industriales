/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import modelo.Maquina;
import modelo.ParteMaquina;
import modelo.Personal;
import modelo.enumeraciones.EstadoAviso;
import modelo.enumeraciones.PrioridadAviso;
import modelo.enumeraciones.Sector;
import modelo.enumeraciones.TipoAviso;
import presentador.PAviso;
import presentador.interfaces.IVAviso;
import presentador.interfaces.IVOrdenTrabajo;

/**
 *
 * @author DanielM
 */
public class VAviso extends javax.swing.JDialog implements IVAviso {

    PAviso presentador;
    int key;
    Frame parent;
    /**
     * Creates new form frmAvisos
     */
    public VAviso(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.parent= parent;
        initComponents();
        configuraciones();
        this.presentador = new PAviso(this);
        actualizar();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbTipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAgregarAviso = new javax.swing.JButton();
        btnCrearOT = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbTiempo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbMaquina = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbParteMaquina = new javax.swing.JComboBox<>();
        cbPersonal = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbEstados = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        cbPrioridad = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        cbResponsable = new javax.swing.JComboBox<>();
        dateDesde = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        btnNuevoAviso = new javax.swing.JButton();
        labelNotificacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setText("Descripcion");

        jLabel1.setText("Tipo");

        btnAgregarAviso.setText("Cargar Aviso");
        btnAgregarAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAvisoActionPerformed(evt);
            }
        });

        btnCrearOT.setText("Crear OT");
        btnCrearOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearOTActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("Tiempo Rep. Estimado");

        jLabel5.setText("Maquina:");

        jLabel4.setText("Parte Maquina:");

        jLabel11.setText("Estado");

        jLabel6.setText("min.");

        jLabel42.setText("Fecha Creación");

        jLabel41.setText("Solicitante");

        jLabel43.setText("Prioridad");

        jLabel44.setText("Sector Responsable");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        jLabel7.setText("Carga de Avisos");

        btnNuevoAviso.setText("Nuevo aviso");
        btnNuevoAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoAvisoActionPerformed(evt);
            }
        });

        labelNotificacion.setText("sad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelNotificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(47, 47, 47)
                                .addComponent(jScrollPane2)
                                .addGap(10, 10, 10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addGap(54, 54, 54)
                                .addComponent(btnNuevoAviso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCrearOT)
                                .addGap(38, 38, 38)
                                .addComponent(btnAgregarAviso)
                                .addGap(5, 5, 5))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel1))
                                                .addGap(39, 39, 39)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cbEstados, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(cbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel41)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbPersonal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel43)
                                        .addGap(27, 27, 27)
                                        .addComponent(cbPrioridad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel5)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel42)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dateDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cbParteMaquina, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cbMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cbResponsable, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(cbTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel6))))
                                            .addComponent(jLabel44))))))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNotificacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbParteMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel42)
                                .addComponent(jLabel41)
                                .addComponent(cbPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cbEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel43)
                        .addComponent(cbPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel44)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevoAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAgregarAviso)
                        .addComponent(btnCrearOT)
                        .addComponent(btnCancelar)))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAvisoActionPerformed
        agregarAviso();       
      
    }//GEN-LAST:event_btnAgregarAvisoActionPerformed

    private void btnCrearOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearOTActionPerformed
        crearNuevaOT();
        dispose();
    }//GEN-LAST:event_btnCrearOTActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNuevoAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoAvisoActionPerformed
       volverDatosIniciales();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoAvisoActionPerformed

    /**
     * @param args the command line arguments
     */
    //</editor-fold>

    /* Create and display the dialog */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAviso;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrearOT;
    private javax.swing.JButton btnNuevoAviso;
    private javax.swing.JComboBox<EstadoAviso> cbEstados;
    private javax.swing.JComboBox<Maquina> cbMaquina;
    private javax.swing.JComboBox<ParteMaquina> cbParteMaquina;
    private javax.swing.JComboBox<Personal> cbPersonal;
    private javax.swing.JComboBox<PrioridadAviso> cbPrioridad;
    private javax.swing.JComboBox<Sector> cbResponsable;
    private javax.swing.JComboBox<String> cbTiempo;
    private javax.swing.JComboBox<TipoAviso> cbTipo;
    private com.toedter.calendar.JDateChooser dateDesde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelNotificacion;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizar() {

        ArrayList<Personal> personal = presentador.getPersonal();

        for (Personal personal1 : personal) {
            cbPersonal.addItem(personal1);
        }

        ArrayList<Maquina> maquinas = presentador.getMaquinas();

        for (Maquina maquina : maquinas) {
            cbMaquina.addItem(maquina);
        }

        EstadoAviso[] estados = presentador.getEstados();

        for (int i = 0; i < estados.length; i++) {
            cbEstados.addItem(estados[i]);
        }

        PrioridadAviso[] prioridad = presentador.getPrioridad();

        for (int i = 0; i < prioridad.length; i++) {
            cbPrioridad.addItem(prioridad[i]);
        }

        Sector[] sectores = presentador.getSectores();

        for (int i = 0; i < sectores.length; i++) {
            cbResponsable.addItem(sectores[i]);
        }

        TipoAviso[] tipos = presentador.getTipos();

        for (int i = 0; i < tipos.length; i++) {
            cbTipo.addItem(tipos[i]);
        }

        for (int i = 10; i < 300; i = i + 10) {
            cbTiempo.addItem(String.valueOf(i));
        }

        setVisible(true);
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

    private void agregarAviso() {
        TipoAviso t = (TipoAviso) cbTipo.getSelectedItem();
        EstadoAviso e = (EstadoAviso) cbEstados.getSelectedItem();
        Personal p = (Personal) cbPersonal.getSelectedItem();
        PrioridadAviso pa = (PrioridadAviso) cbPrioridad.getSelectedItem();
        Maquina m = (Maquina) cbMaquina.getSelectedItem();
        ParteMaquina pm = (ParteMaquina) cbParteMaquina.getSelectedItem();
        Calendar cal = dateDesde.getCalendar();
        Sector sec = (Sector) cbResponsable.getSelectedItem();
        String tiemp = String.valueOf(cbTiempo.getSelectedItem());
        String desc = txtDescripcion.getText();

        if(cal!=null || desc=="")
            {
        key= this.presentador.guardarAviso(t, e, p, pa,m, pm, cal, sec, tiemp, desc);
       
       deshablitarComponentes();
        labelNotificacion.setForeground(Color.GREEN);
        labelNotificacion.setText("Se creo el nuevo aviso con exito");
            } else{
            labelNotificacion.setForeground(Color.RED);
            labelNotificacion.setText("No se pudo crear el aviso, por que le falto algun campo");
        }
        
    }

    public void crearNuevaOT() {
     
        IVOrdenTrabajo ot = new VOrdenTrabajo(parent, true,key);
      
    }

    private void deshablitarComponentes() {
       btnAgregarAviso.setEnabled(false);
       btnCrearOT.setEnabled(true);
       btnNuevoAviso.setEnabled(true);
       cbEstados.setEnabled(false);
       cbMaquina.setEnabled(false);
       cbParteMaquina.setEnabled(false);
       cbPersonal.setEnabled(false);
       cbPrioridad.setEnabled(false);
       cbResponsable.setEnabled(false);
       cbTiempo.setEnabled(false);
       cbTipo.setEnabled(false);
       dateDesde.setEnabled(false);
       txtDescripcion.setEditable(false);
       
    }

    private void configuraciones() {
         Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension ventana = this.getSize();
        this.setLocation((pantalla.width - ventana.width)/2, (pantalla.height -ventana.height)/2);
        btnCrearOT.setEnabled(false);
        btnNuevoAviso.setEnabled(false);
        int key=-1;
        labelNotificacion.setText("");
        
    }

    private void volverDatosIniciales() {
        
        labelNotificacion.setText("");
        btnCrearOT.setEnabled(false);
        btnNuevoAviso.setEnabled(false);
        btnAgregarAviso.setEnabled(true);
        

      
       cbEstados.setEnabled(true);
       cbMaquina.setEnabled(true);
       cbParteMaquina.setEnabled(true);
       cbPersonal.setEnabled(true);
       cbPrioridad.setEnabled(true);
       cbResponsable.setEnabled(true);
       cbTiempo.setEnabled(true);
       cbTipo.setEnabled(true);
       dateDesde.setEnabled(true);
       txtDescripcion.setEditable(true);
       
       cbEstados.setSelectedIndex(0);
       cbMaquina.setSelectedIndex(0);
       cbParteMaquina.setSelectedIndex(0);
       cbPersonal.setSelectedIndex(0);
       cbPrioridad.setSelectedIndex(0);
       cbResponsable.setSelectedIndex(0);
       cbTiempo.setSelectedIndex(0);
       cbTipo.setSelectedIndex(0);
       dateDesde.setCalendar(null);
       txtDescripcion.setText("");
       
       
    }

}
