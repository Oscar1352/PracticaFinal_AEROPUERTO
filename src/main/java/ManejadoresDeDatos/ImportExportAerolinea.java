/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejadoresDeDatos;

import AñadirObjetos.AñadirAerolinea;
import com.mycompany.Abstracts.AEROPUERTO;
import com.mycompany.InterfazGráfica.ModuloAdministración.Administracion;
import com.mycompany.InterfazGráfica.ModuloUsuario.Principal;
import com.mycompany.Objetos.AEROLINEA;
import com.mycompany.Objetos.PASAPORTE;
import data.ManejoArchivos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;

/**
 *
 * @author Oscar
 */
public class ImportExportAerolinea extends javax.swing.JFrame {

    private AñadirAerolinea vent;
    

    /**
     * Creates new form ImportExport
     */
    public ImportExportAerolinea(AñadirAerolinea vent) {

        this.vent = vent;
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        buttonArchivoEntradaCargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Importar y exportar GENERALES");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cargar Archivo de entrada"));

        buttonArchivoEntradaCargar.setText("Cargar Archivo de entrada");
        buttonArchivoEntradaCargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonArchivoEntradaCargarMouseClicked(evt);
            }
        });
        buttonArchivoEntradaCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonArchivoEntradaCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(buttonArchivoEntradaCargar)
                .addContainerGap(514, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(buttonArchivoEntradaCargar)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonArchivoEntradaCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonArchivoEntradaCargarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonArchivoEntradaCargarActionPerformed

    private void buttonArchivoEntradaCargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonArchivoEntradaCargarMouseClicked
        // TODO add your handling code here:-
        AEROLINEA aerolineaactual=null;
        JFileChooser fileChooser = new JFileChooser("Seleccione archivo de texto");
        fileChooser.showOpenDialog(null);
        System.out.println(fileChooser.getSelectedFile().getPath());

        List<String> listaEntrada = ManejoArchivos.getLinesTextFile(fileChooser.getSelectedFile().getPath());

        /*for(int i = 0; i< listaEntrada.size();i++){
            System.out.println(listaEntrada.get(i));
        }*/
        
        //Lectura de los Aeropuertos
        for (String line : listaEntrada) {
            //System.out.println(line);
            try {

                String[] partes = line.split("\\(");
                String[] parte2 = partes[1].split("\\)");
                String[] data = parte2[0].split(",");

                if ((partes[0].equalsIgnoreCase("Aerolinea")) && (data.length == 2)) {
                    vent.actualizarAerolinea(data[0],data[1]);
                } else {
                    System.out.println(" la linea x no tiene un formato adecuado" + line + data.length);
                }
            } catch (Exception e) {
                System.out.println(" la linea x no tiene un formato adecuado exception" + line);
                System.out.println(e);
            }

        }
    }//GEN-LAST:event_buttonArchivoEntradaCargarMouseClicked
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonArchivoEntradaCargar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
