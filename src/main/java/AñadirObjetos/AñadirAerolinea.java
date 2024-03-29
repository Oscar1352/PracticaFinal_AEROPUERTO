/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AñadirObjetos;

import ManejadoresDeDatos.ImportExportAerolinea;
import com.mycompany.Abstracts.AEROPUERTO;
import com.mycompany.InterfazGráfica.ModuloAdministración.Administracion;
import com.mycompany.Objetos.AEROLINEA;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar Luna
 */
public class AñadirAerolinea extends javax.swing.JFrame {
//Aeropuerto
    private static Vector listaAerolineas = new Vector();
    private Vector NombreAeropuertos = new Vector();
    private AEROPUERTO Aeropuerto;
    private AEROPUERTO aeropuertoelegido;
    private AEROPUERTO aeropuertoactual;
    private Administracion admin;
    
    //Aerolinea
    public void actualizarAerolinea(String AEROPUERTO, String NOMBRE_AEROLINEA){
        if (AEROPUERTO!=null)
        listaAerolineas.add(new AEROLINEA(AEROPUERTO,NOMBRE_AEROLINEA) {});
        
    }
    /**
     * Creates new form AñadirAerolinea
     */
    public AñadirAerolinea() {
        initComponents();
        
                if (Aeropuerto!= null){
            //edición 
            this.AeropuertosCombobox1.setSelectedItem(Aeropuerto.getNOMBRE_AEROPUERTO());
            this.NombreAerolínea.setText("");
            
            //Obtener Fecha de Nacimiento
            }else {
                    this.AeropuertosCombobox1.setSelectedItem("");
                    this.NombreAerolínea.setText("");
       }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AeropuertosCombobox1 = new javax.swing.JComboBox(admin.getListaAeropuertos());
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NombreAerolínea = new javax.swing.JTextField();
        CrearVuelo = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AÑADIR AEROLINEA");

        jLabel2.setText("Aeropuerto Disponibles:");

        jLabel3.setText("Nombre Aerolínea:");

        CrearVuelo.setBackground(new java.awt.Color(153, 255, 153));
        CrearVuelo.setForeground(new java.awt.Color(0, 0, 0));
        CrearVuelo.setText("CREAR AEROLÍNEA");
        CrearVuelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearVueloMouseClicked(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 204, 255));
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("CARGAR DATOS");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AeropuertosCombobox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(CrearVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NombreAerolínea, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(AeropuertosCombobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(NombreAerolínea, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(CrearVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(63, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearVueloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearVueloMouseClicked
        // TODO add your handling code here:
        //Aeropuerto Destino
        aeropuertoelegido = (AEROPUERTO) AeropuertosCombobox1.getSelectedItem();

        //Añadir
        actualizarAerolinea(aeropuertoelegido.getNOMBRE_AEROPUERTO(),NombreAerolínea.getText());
        JOptionPane.showMessageDialog(null, "Aerolinea Agregada con exito con éxito");

        this.dispose();
    }//GEN-LAST:event_CrearVueloMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        new ImportExportAerolinea(this);
        this.hide();
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(AñadirAerolinea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AñadirAerolinea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AñadirAerolinea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AñadirAerolinea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AñadirAerolinea().setVisible(true);
            }
        });
    }

    public static Vector getListaAerolineas() {
        return listaAerolineas;
    }

    public static void setListaAerolineas(Vector listaAerolineas) {
        AñadirAerolinea.listaAerolineas = listaAerolineas;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AeropuertosCombobox1;
    private javax.swing.JButton CrearVuelo;
    private javax.swing.JTextField NombreAerolínea;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
