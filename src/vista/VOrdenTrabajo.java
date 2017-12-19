/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import modelo.*;
import modelo.enumeraciones.EstadoAviso;
import modelo.enumeraciones.EstadoOT;
import modelo.enumeraciones.TipoOT;
import presentador.POrdenTrabajo;
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
       TipoOT tipoOT;
        Personal responsable;
        Calendar calInicio;
        Date dateTiempoFalla;
        Calendar calHorasFalla;
        Calendar calFin;
        ParteMaquina parteMaquina;
    /**
     * Creates new form VOrdenTrabajo
     */
    public VOrdenTrabajo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.parent= parent;
        initComponents();
         setTitle("Cargar Orden de Trabajo");
        inicializar();
        textAviso.setText("Pulse el boton buscar para buscar un aviso");
        deshabilitarComponentes();
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

        btnAgregarOT = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        dateInicio = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        dateFin = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        cbResponsable = new javax.swing.JComboBox();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        cbMaquina = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbParteMaquina = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        horasInicio = new javax.swing.JSpinner();
        horasFin = new javax.swing.JSpinner();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        btnBuscarAviso = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        textAviso = new javax.swing.JTextArea();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        cbOperaciones = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableOperaciones = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textOperacionDescripcion = new javax.swing.JTextArea();
        btnQuitarOperaciones = new javax.swing.JButton();
        btnAgregarOperaciones = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtResumenOperaciones = new javax.swing.JTextArea();
        btnCerrarOt = new javax.swing.JButton();
        btnDefinirOperaciones = new javax.swing.JButton();
        btnCambiar = new javax.swing.JButton();
        labelNotificacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden de Trabajo"));

        jLabel5.setText("Fecha Inicio: ");

        jLabel4.setText("Tipo:");

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Fecha Fin:");

        jLabel8.setText("Responsable: ");

        cbResponsable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        Date date = new Date();
        SpinnerDateModel sm =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        horasInicio = new javax.swing.JSpinner(sm);
        JSpinner.DateEditor de = new JSpinner.DateEditor(horasInicio,"HH:mm");
        horasInicio.setEditor(de);

        Date date1 = new Date();
        SpinnerDateModel sm1 =
        new SpinnerDateModel(date1, null, null, Calendar.HOUR_OF_DAY);
        horasFin = new javax.swing.JSpinner(sm1);
        JSpinner.DateEditor de1 = new JSpinner.DateEditor(horasInicio,"HH:mm");
        horasFin.setEditor(de1);

        jLayeredPane3.setLayer(dateInicio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(cbTipo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(dateFin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(cbResponsable, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(horasInicio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(horasFin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(38, 38, 38)
                                .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dateInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                    .addComponent(dateFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbResponsable, 0, 89, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(horasFin, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(horasInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75)))
                        .addGap(18, 18, 18))
                    .addComponent(jLayeredPane1))
                .addContainerGap())
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(horasInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateFin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horasFin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Aviso\n"));

        btnBuscarAviso.setText("Buscar");
        btnBuscarAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAvisoActionPerformed(evt);
            }
        });

        jLabel10.setText("Aviso");

        textAviso.setColumns(20);
        textAviso.setRows(5);
        textAviso.setLineWrap(true);
        textAviso.setWrapStyleWord(true);
        jScrollPane5.setViewportView(textAviso);

        jLayeredPane2.setLayer(btnBuscarAviso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jScrollPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarAviso)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(btnBuscarAviso))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createTitledBorder("Definir Operaciones"));

        cbOperaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tableOperaciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tableOperaciones);

        jLabel1.setText("Operaciones:");

        textOperacionDescripcion.setColumns(20);
        textOperacionDescripcion.setRows(5);
        textOperacionDescripcion.setLineWrap(true);
        textOperacionDescripcion.setWrapStyleWord(true);
        jScrollPane2.setViewportView(textOperacionDescripcion);

        btnQuitarOperaciones.setText("Quitar");

        btnAgregarOperaciones.setText("Agregar");

        jLabel2.setText("Resumen:");

        txtResumenOperaciones.setColumns(20);
        txtResumenOperaciones.setRows(5);
        txtResumenOperaciones.setLineWrap(true);
        txtResumenOperaciones.setWrapStyleWord(true);
        jScrollPane4.setViewportView(txtResumenOperaciones);

        jLayeredPane4.setLayer(cbOperaciones, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(btnQuitarOperaciones, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(btnAgregarOperaciones, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAgregarOperaciones)
                                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane4Layout.createSequentialGroup()
                        .addComponent(btnQuitarOperaciones)
                        .addGap(26, 26, 26))))
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarOperaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQuitarOperaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnCerrarOt.setText("Cerrar OT");

        btnDefinirOperaciones.setText("Definir Operaciones");
        btnDefinirOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefinirOperacionesActionPerformed(evt);
            }
        });

        btnCambiar.setText("Modificar Datos");
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });

        labelNotificacion.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLayeredPane3)
                        .addComponent(jLayeredPane2)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnCancelar)
                            .addGap(73, 73, 73)
                            .addComponent(btnCambiar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDefinirOperaciones)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelNotificacion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarOT)
                        .addGap(26, 26, 26)
                        .addComponent(btnCerrarOt)))
                .addGap(0, 72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(labelNotificacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLayeredPane3))
                    .addComponent(jLayeredPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAgregarOT)
                    .addComponent(btnCerrarOt)
                    .addComponent(btnDefinirOperaciones)
                    .addComponent(btnCambiar))
                .addGap(21, 21, 21))
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

    private void btnDefinirOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefinirOperacionesActionPerformed
        try{
            validarDatos();
            habilitarDefinirOperaciones();  
            labelNotificacion.setForeground(Color.green);
            labelNotificacion.setText("Los datos fueron validados!!");
        }catch(Exception ex)
        {
            labelNotificacion.setForeground(Color.red);
            if(ex.getMessage()=="Las fecha Inicio es posterios a la de Fin!")
            {
                labelNotificacion.setText(ex.getMessage());
            }else
            {
            labelNotificacion.setText("Faltan datos o no son correctos!!");
            }
        }
        
       
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDefinirOperacionesActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed

        realizarCambioOT();
    
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCambiarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarOT;
    private javax.swing.JButton btnAgregarOperaciones;
    private javax.swing.JButton btnBuscarAviso;
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrarOt;
    private javax.swing.JButton btnDefinirOperaciones;
    private javax.swing.JButton btnQuitarOperaciones;
    private javax.swing.JComboBox<Maquina> cbMaquina;
    private javax.swing.JComboBox<String> cbOperaciones;
    private javax.swing.JComboBox<ParteMaquina> cbParteMaquina;
    private javax.swing.JComboBox cbResponsable;
    private javax.swing.JComboBox cbTipo;
    private com.toedter.calendar.JDateChooser dateFin;
    private com.toedter.calendar.JDateChooser dateInicio;
    private javax.swing.JSpinner horasFin;
    private javax.swing.JSpinner horasInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel labelNotificacion;
    private javax.swing.JTable tableOperaciones;
    private javax.swing.JTextArea textAviso;
    private javax.swing.JTextArea textOperacionDescripcion;
    private javax.swing.JTextArea txtResumenOperaciones;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizar() {
     
     

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
       // Aviso aviso = (Aviso) cbAviso.getSelectedItem();
        av.setEstado(EstadoAviso.EN_TRATAMIENTO);
        String operaciones= txtResumenOperaciones.getText();
        presentador.guardarOT(av,EstadoOT.ABIERTO, tipoOT, responsable, calInicio, calFin, parteMaquina,operaciones);   
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
         cbTipo.removeAllItems();
         cbResponsable.removeAllItems();
        
        TipoOT[] tipos = presentador.getTipos();
        
        for (int i = 0; i < tipos.length; i++) {
            cbTipo.addItem(tipos[i]);
        }

        ArrayList<Maquina> maquinas = presentador.getMaquinas();

        for (Maquina maquina : maquinas) {
            cbMaquina.addItem(maquina);
        }

        ArrayList<Personal> responsable = presentador.getResponsables();
        
        for (Personal personal : responsable) {
            cbResponsable.addItem(personal);
        }
        
        btnCerrarOt.setEnabled(false);
        this.btnAgregarOT.setEnabled(false);
        this.cbOperaciones.setEnabled(false);
        textOperacionDescripcion.setEnabled(false);
        tableOperaciones.setEnabled(false);
        txtResumenOperaciones.setEnabled(false);
        btnQuitarOperaciones.setEnabled(false);
        btnAgregarOperaciones.setEnabled(false);
        
        
         actualizar();

    }

    private void habilitarDefinirOperaciones() {
    deshabilitarComponentes();
        btnAgregarOT.setEnabled(true);
        cbOperaciones.setEnabled(true);
        textOperacionDescripcion.setEnabled(true);
        tableOperaciones.setEnabled(true);
        txtResumenOperaciones.setEnabled(true);
        btnQuitarOperaciones.setEnabled(true);
        btnAgregarOperaciones.setEnabled(true);
        btnCambiar.setEnabled(true);
    
       ArrayList<Operacion> operaciones= presentador.getOperaciones(parteMaquina.getId());
        
       
        
    }

   private void deshabilitarComponentes()
   {
        cbMaquina.setEnabled(false);
        cbParteMaquina.setEnabled(false);
        cbResponsable.setEnabled(false);
        cbTipo.setEnabled(false);
        dateFin.setEnabled(false);
        dateInicio.setEnabled(false);
        btnCerrarOt.setEnabled(false);
        this.btnAgregarOT.setEnabled(false);
        this.cbOperaciones.setEnabled(false);
        textOperacionDescripcion.setEnabled(false);
        tableOperaciones.setEnabled(false);
        txtResumenOperaciones.setEnabled(false);
        btnDefinirOperaciones.setEnabled(false);
        btnQuitarOperaciones.setEnabled(false);
        btnAgregarOperaciones.setEnabled(false);
        btnCambiar.setEnabled(false);
   }

    private void validarDatos() throws NullPointerException,ClassCastException {
    //   
    tipoOT = (TipoOT) cbTipo.getSelectedItem();
       responsable = (Personal) cbResponsable.getSelectedItem();
        
       //     
        Calendar calendar;
        Date date;
        calendar = dateInicio.getCalendar();
     //
        date=(Date)horasInicio.getModel().getValue();
        date.setDate(calendar.get(Calendar.DAY_OF_MONTH));
        date.setMonth(calendar.get(Calendar.MONTH));
        date.setYear(calendar.get(Calendar.YEAR));
        
        calInicio= Calendar.getInstance();        
        calInicio.setTime(date);
        
        //
        calendar = dateFin.getCalendar();
      
        date=(Date)horasFin.getModel().getValue();
        date.setDate(calendar.get(Calendar.DAY_OF_MONTH));
        date.setMonth(calendar.get(Calendar.MONTH));
        date.setYear(calendar.get(Calendar.YEAR));
        
        calFin= Calendar.getInstance();        
        calFin.setTime(date);
        
        if(calFin.before(calInicio))
        {
         throw new NullPointerException("Las fecha Inicio es posterios a la de Fin!");
        }
        
        coso();
        //
        parteMaquina = (ParteMaquina) cbParteMaquina.getSelectedItem();
        
        
    }

    private void coso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void realizarCambioOT() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
