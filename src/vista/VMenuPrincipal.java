/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import presentador.interfaces.IVMenuPrincipal;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Axel y Ampy
 */
import presentador.PMenuPrincipal;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import vista.componentes.Nodo;

public class VMenuPrincipal extends javax.swing.JFrame implements IVMenuPrincipal{

    private final PMenuPrincipal presentador;

    /**
     * Creates new form frmMenuPrincipal
     */
    public VMenuPrincipal() {
        initComponents();
        presentador = new PMenuPrincipal(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        txtFiltro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        arbol = new javax.swing.JTree();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtFiltro.setName("txtCodigoOperacion"); // NOI18N
        txtFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo de Operacion");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(arbol);

        jMenu3.setText("Archivo");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ejecutarBusqueda();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree arbol;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables

    private void nodos() {

        DefaultMutableTreeNode top = new DefaultMutableTreeNode("ERP- Sistemas Industriales");
        TreeModel modeloArbol = new DefaultTreeModel(top);
        arbol.setModel(modeloArbol);

        DefaultMutableTreeNode A1 = new DefaultMutableTreeNode("Gestion Departamento");
        DefaultMutableTreeNode A11 = new DefaultMutableTreeNode("Ingenieria y Mantenimiento");
        DefaultMutableTreeNode A111 = new DefaultMutableTreeNode("Avisos");
        DefaultMutableTreeNode A1111 = new Nodo("IM01", "Nuevo aviso");
        DefaultMutableTreeNode A1112 = new Nodo("IM02", "Listado de Avisos");
        DefaultMutableTreeNode A112 = new DefaultMutableTreeNode("Orden de trabajo");
        DefaultMutableTreeNode A1121 = new Nodo("OT01", "Nueva OT");
         DefaultMutableTreeNode A1122 = new Nodo("OT02", "Listado de OT");
        DefaultMutableTreeNode A113 = new DefaultMutableTreeNode("Programa de mantenimiento");
        DefaultMutableTreeNode A1131 = new Nodo("Por definir", "Nuevo PM");
        DefaultMutableTreeNode A1132 = new Nodo("Por definir", "Consultar PM");
        DefaultMutableTreeNode A12 = new DefaultMutableTreeNode("Finanzas");
        DefaultMutableTreeNode A13 = new DefaultMutableTreeNode("Recursos Humanos");
        DefaultMutableTreeNode A14 = new DefaultMutableTreeNode("Finanzas");
        DefaultMutableTreeNode A15 = new DefaultMutableTreeNode("Produccion");
        DefaultMutableTreeNode A16 = new DefaultMutableTreeNode("Proyecto");
        DefaultMutableTreeNode A17 = new DefaultMutableTreeNode("Calidad");
        DefaultMutableTreeNode A18 = new DefaultMutableTreeNode("Loguistica");
        top.add(A1);
        A1.add(A11);
        A11.add(A111);
        A111.add(A1111);
        A111.add(A1112);
        A11.add(A112);
        A112.add(A1121);
        A112.add(A1122);
        A11.add(A113);
        A113.add(A1131);
        A113.add(A1132);
        A1.add(A12);
        A1.add(A13);
        A1.add(A14);
        A1.add(A15);
        A1.add(A16);
        A1.add(A17);
        A1.add(A18);

        DefaultMutableTreeNode A2 = new DefaultMutableTreeNode("Gestion de KPI");
        DefaultMutableTreeNode A21 = new Nodo("PTA", "Porcentaje de tratamiento de avisos");
        DefaultMutableTreeNode A22 = new Nodo("TMEF", "Tiempo medio entre fallos");
        DefaultMutableTreeNode A23 = new Nodo("MPT", "Mantenimiento productivo total");
        DefaultMutableTreeNode A24 = new Nodo("TMR", "Tiempo medio de respuesta");
        DefaultMutableTreeNode A25 = new Nodo("OEE", "Eficiencia general del equipo");
        DefaultMutableTreeNode A26 = new Nodo("OE", "Paro de maquina propia y de terceros");
        DefaultMutableTreeNode A27 = new Nodo("LEF", "Eficiencia de maquina");
        DefaultMutableTreeNode A28 = new Nodo("ICM", "Indice de cumplimiento del mantenimiento");
        top.add(A2);
        A2.add(A21);
        A2.add(A22);
        A2.add(A23);
        A2.add(A24);
        A2.add(A25);
        A2.add(A26);
        A2.add(A27);
        A2.add(A28);

        DefaultMutableTreeNode A3 = new DefaultMutableTreeNode("Gestion Fallo de Linea");
        DefaultMutableTreeNode A31 = new Nodo("CF01", "Carga de Fallo");
        DefaultMutableTreeNode A32 = new Nodo("CF02", "Consula de Fallo");
        top.add(A3);
        A3.add(A31);
        A3.add(A32);

        arbol.expandRow(0);
        arbol.expandRow(1);

        String codigo;
        MouseListener ml = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    Object path = arbol.getLastSelectedPathComponent();
                    try {
                        Nodo nodo = (Nodo) path;
                        mostrarVista(nodo.getCodigo());
                    } catch (Exception ex) {
                    };

                    if (path == null) {
                        return;
                    }

                }
            }
        };

        arbol.addMouseListener(ml);

    }

    @Override
    public void configuracion() {
        setTitle("MAGNA ERP - Sistemas Industriales");
        //TOOLKIT NOS AYUDA A OBTENER LAS DIMENCIONES DE PANTALLA, ASI LA APLICACION SE AJUSTA AUTOMATICAMENTE.
        setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
        nodos();
        this.setVisible(true);

    }

    @Override
    public void mostrarVista(String comando) {
        switch (comando) {
            case "IM01":
                new VAviso(this, true);
                break;
            case "IM02":
                new VListadoAviso(this, true);
                break;
            case "OT01":
                new VOrdenTrabajo(this, true);
                break;
            case "OT02":
                new ListarOT(this, true);
                break;
            case "CF01":
                new VCargarFallo(this,true);
                break;
            case "CF02":
                new VConsultaFallo(this, true);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ese comando no esta definido");
                break;
        }
        txtFiltro.setText("");
    }

    public void ejecutarBusqueda() {
        presentador.ejecutarComando(txtFiltro.getText());
    }
}
