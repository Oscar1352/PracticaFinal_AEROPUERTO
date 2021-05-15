/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.InterfazGráfica.ModuloAdministración;

import AñadirObjetos.AñadirVuelos;
import AñadirObjetos.EditarAviones;
import AñadirObjetos.EditarVuelos;
import com.mycompany.Abstracts.AEROPUERTO;
import com.mycompany.Enums.ESTADO_DE_VUELO;
import com.mycompany.InterfazGráfica.ModuloUsuario.Principal;
import com.mycompany.Objetos.PASAPORTE;
import com.mycompany.Objetos.VUELO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JComboBox;

/**
 *
 * @author Oscar Luna
 */
public class Operador extends javax.swing.JFrame implements ActionListener {
    
   //Aeropuerto
    private Vector listaAeropuertos;
    private Vector CiudadAeropuertoOrigen;
    private AEROPUERTO aeropuertoOrigen;
    private AEROPUERTO aeropuertoDestino;
    private Vector CiudadAeropuertoDestino;
    private Vector FechaVuelo;
    private Vector NombreAeropuertos = new Vector();
    private VUELO vueloactual;
    private AEROPUERTO aeropuertoactual;
    
    
     //Estado Vuelo
    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox comboBox = (JComboBox) e.getSource();
        this.vueloactual = (VUELO) comboBox.getSelectedItem();
        EstadoVuelo.setText(String.valueOf(vueloactual.getEstado_de_vuelo()));
    }
    
     //Vuelo
    private Vector listaVuelos = new Vector();
    private Vector VueloPendiente = new Vector();
    
   
    //Vuelo
    public void actualizarVuelo(long CODIGO_VUELO, long CODIGO_AVION, String NOMBRE_AEROPUERTO_ORIGEN, String NOMBRE_AEROPUERTO_DESTINO, Integer PRECIO_BOLETO, String FECHA_SALIDAD){
        if (CODIGO_VUELO!=0)
        listaVuelos.add(new VUELO(CODIGO_VUELO,CODIGO_AVION,NOMBRE_AEROPUERTO_ORIGEN,NOMBRE_AEROPUERTO_DESTINO,PRECIO_BOLETO,FECHA_SALIDAD) {});
    }
    /**
     * Creates new form Operador
     */
    public Operador() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        EstadoVuelo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Vuelos = new javax.swing.JComboBox(listaVuelos);
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        UsuariojMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Area de Operador de Vuelo");

        jButton1.setBackground(new java.awt.Color(255, 102, 51));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("CANCELAR");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 255, 153));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("CREAR VUELO");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 153));
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("POSPONER VUELO");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jLabel1.setText("Estado Vuelo:");

        EstadoVuelo.setEditable(false);
        EstadoVuelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EstadoVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoVueloActionPerformed(evt);
            }
        });

        jLabel2.setText("Vuelo:");

        Vuelos.addActionListener( this );
        /*comboBoxListaPasaportes.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JComboBox comboBox = (JComboBox)e.getSource();
                Pelicula item = (Pelicula)comboBox.getSelectedItem();
                System.out.println( item.toString());
                System.out.println( item.getId());
            }
        } );*/
        Vuelos.putClientProperty("JComboBox.isTableCellEditor", Boolean.TRUE);
        Vuelos.setAutoscrolls(true);

        jButton4.setBackground(new java.awt.Color(153, 204, 255));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("INICIAR");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Vuelos, 0, 993, Short.MAX_VALUE)
                    .addComponent(EstadoVuelo))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(295, 295, 295))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(435, 435, 435))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(Vuelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(EstadoVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Vuelos", jPanel1);

        jMenu1.setText("MODULOS");

        UsuariojMenu3.setText("USUARIO");
        UsuariojMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsuariojMenu3MouseClicked(evt);
            }
        });
        jMenu1.add(UsuariojMenu3);

        jMenu4.setText("ADMINISTRATIVO");
        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("AYUDA");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("SALIR");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuariojMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuariojMenu3MouseClicked
        // TODO add your handling code here:
        Principal principal= new Principal();
        principal.setVisible(true);
    }//GEN-LAST:event_UsuariojMenu3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:

        new AñadirVuelos(null,this);
    }//GEN-LAST:event_jButton2MouseClicked

    private void EstadoVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoVueloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstadoVueloActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        this.vueloactual.setEstado_de_vuelo(ESTADO_DE_VUELO.COMPLETADO);
        EstadoVuelo.setText(String.valueOf(VUELO.getEstado_de_vuelo()));
        
        
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        this.vueloactual.setEstado_de_vuelo(ESTADO_DE_VUELO.CANCELADO);
        this.EstadoVuelo.setText(String.valueOf(vueloactual.getEstado_de_vuelo()));
        aeropuertoOrigen.setCANTIDAD_DE_AVIONES(aeropuertoOrigen.getCANTIDAD_DE_AVIONES()-1);
        aeropuertoDestino.setCANTIDAD_DE_AVIONES(aeropuertoDestino.getCANTIDAD_DE_AVIONES()+1);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        new EditarVuelos(vueloactual,this);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Operador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operador().setVisible(true);
            }
        });
    }

    public Vector getListaVuelos() {
        return listaVuelos;
    }

    public void setListaVuelos(Vector listaVuelos) {
        this.listaVuelos = listaVuelos;
    }

    public Vector getCiudadAeropuertoOrigen() {
        return CiudadAeropuertoOrigen;
    }

    public void setCiudadAeropuertoOrigen(Vector CiudadAeropuertoOrigen) {
        this.CiudadAeropuertoOrigen = CiudadAeropuertoOrigen;
    }

    public Vector getCiudadAeropuertoDestino() {
        return CiudadAeropuertoDestino;
    }

    public void setCiudadAeropuertoDestino(Vector CiudadAeropuertoDestino) {
        this.CiudadAeropuertoDestino = CiudadAeropuertoDestino;
    }

    public Vector getFechaVuelo() {
        return FechaVuelo;
    }

    public void setFechaVuelo(Vector FechaVuelo) {
        this.FechaVuelo = FechaVuelo;
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EstadoVuelo;
    private javax.swing.JMenu UsuariojMenu3;
    private javax.swing.JComboBox<String> Vuelos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
