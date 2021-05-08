/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AñadirObjetos;

import com.mycompany.Abstracts.AEROPUERTO;
import com.mycompany.InterfazGráfica.ModuloAdministración.Administracion;

/**
 *
 * @author Oscar Luna
 */
public class AñadirAeropuertos extends javax.swing.JFrame {

    
    private AEROPUERTO aeropuerto;
    private Administracion vent;
    /**
     * Creates new form AñadirAeropuertos
     */ 
    public AñadirAeropuertos(AEROPUERTO aeropuerto,Administracion vent) {
        initComponents();
        this.aeropuerto = aeropuerto;
        this.vent = vent;
        if (aeropuerto!= null){
            //edición 
            this.nombre.setText(aeropuerto.getNOMBRE_AEROPUERTO());
            this.ciudad.setText(aeropuerto.getCIUDAD()+"");
            this.pais.setText(aeropuerto.getPAIS());
            
        }
        else{
            this.nombre.setText("");
            this.ciudad.setText("");
            this.pais.setText("");
            //nuevo
        }
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ciudad = new javax.swing.JTextField();
        pais = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        guardarCambios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AÑADIR");

        jLabel1.setText("Nombre:");

        jLabel2.setText("Ciudad");

        jLabel3.setText("Pais:");

        guardarCambios.setText("Guardar Cambios");
        guardarCambios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarCambiosMouseClicked(evt);
            }
        });
        guardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(guardarCambios)))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3)))
                .addGap(55, 55, 55)
                .addComponent(guardarCambios)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarCambiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarCambiosMouseClicked
        
        /*int peliYear = 0;
        try{
            peliYear = Integer.valueOf(year.toString().trim());

        }
        catch(Exception e){
            //popup debe de ingresar un número
            System.out.println(year.getText());
            return;
        }*/
        vent.actualizarAeropuerto(nombre.getText(), ciudad.getText(), pais.getText());
        this.dispose();
    }//GEN-LAST:event_guardarCambiosMouseClicked

    private void guardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCambiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarCambiosActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ciudad;
    private javax.swing.JButton guardarCambios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField pais;
    // End of variables declaration//GEN-END:variables
}
