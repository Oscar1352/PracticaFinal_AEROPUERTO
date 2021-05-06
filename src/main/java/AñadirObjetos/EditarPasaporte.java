/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AñadirObjetos;

import com.mycompany.Abstracts.AEROPUERTO;
import com.mycompany.InterfazGráfica.ModuloAdministración.Administracion;
import com.mycompany.InterfazGráfica.ModuloUsuario.Principal;
import com.mycompany.Objetos.PASAPORTE;
import com.mycompany.Objetos.TARJETA;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oscar Luna
 */
public class EditarPasaporte extends javax.swing.JFrame {

    
    private PASAPORTE pasaporte;
    private Principal vent;
    /**
     * Creates new form AñadirAeropuertos
     */
    public EditarPasaporte(PASAPORTE pasaporte,Principal vent) {
        initComponents();
        this.pasaporte = pasaporte;
        this.vent = vent;
        if (pasaporte!= null){
            //edición 
            this.NOPasaprte.setText(String.valueOf(pasaporte.getNO_PASAPORTE()));
            this.Contraseña.setText(pasaporte.getCONTRASEÑA());
            
               try {
      String fecha =pasaporte.getFECHA_NACIMIENTOPrueba();
      SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
      Date fechaDate = formato.parse(fecha);
      this.FechaNacimiento.setDate(fechaDate);
      } catch (ParseException ex) {
        Logger.getLogger(EditarPasaporte.class.getName()).log(Level.SEVERE, null, ex);
      }   
            
            this.Nacionalidad.setText(pasaporte.getNACIONALIDAD());
            this.EstadoCivil.setText(pasaporte.getESTADO_CIVIL());
            this.Nombre.setText(pasaporte.getNOMBRE());
            this.Apellido1.setText(pasaporte.getAPELLIDOS());
            this.Sexo.setText(pasaporte.getAPELLIDOS());
            this.FechaVencimiento.setDateFormatString(pasaporte.getFECHA_VENCIMIENTO()+"");
            this.FechaEmisión.setDateFormatString(pasaporte.getFECHA_EMISION()+"");
            this.PaisActual.setText(pasaporte.getPAIS_ACTUAL());
            this.Millas.setText(String.valueOf(pasaporte.getMILLAS_RECORRIDAS()));
        }
        else{
            this.NOPasaprte.setText("");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        GuardarjButton1 = new javax.swing.JButton();
        Nombre = new javax.swing.JTextField();
        Sexo = new javax.swing.JTextField();
        EstadoCivil = new javax.swing.JTextField();
        PaisActual = new javax.swing.JTextField();
        Millas = new javax.swing.JLabel();
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        FechaVencimiento = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        FechaEmisión = new com.toedter.calendar.JDateChooser();
        Nacionalidad = new javax.swing.JTextField();
        Contraseña = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NOPasaprte = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Apellido1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AÑADIR");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setText("Renovación De Pasaporte");

        GuardarjButton1.setText("GUARDAR");
        GuardarjButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuardarjButton1MouseClicked(evt);
            }
        });
        GuardarjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarjButton1ActionPerformed(evt);
            }
        });

        Nombre.setEditable(false);

        Sexo.setEditable(false);

        EstadoCivil.setEditable(false);

        PaisActual.setEditable(false);

        Millas.setText("-");

        jLabel8.setText("NOMBRE:");

        jLabel9.setText("APELLIDO:");

        jLabel10.setText("SEXO:");

        jLabel11.setText("NUEVA FECHA DE VENCIMIENTO:");

        jLabel12.setText("FECHA DE EMISIÓN:");

        jLabel5.setText("FECHA NACIMIENTO:");

        jLabel13.setText("PAIS ACTUAL:");

        jLabel14.setText("MILLAS RECORRIDAS:");

        Nacionalidad.setEditable(false);

        Contraseña.setEditable(false);
        Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaActionPerformed(evt);
            }
        });

        jLabel4.setText("NO.PASAPORTE:");

        jLabel6.setText("NACIONALIDAD:");

        NOPasaprte.setEditable(false);
        try {
            NOPasaprte.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        NOPasaprte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOPasaprteActionPerformed(evt);
            }
        });

        jLabel7.setText("ESTADO CIVIL:");

        jLabel16.setText("CONTRASEÑA:");

        Apellido1.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel16)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GuardarjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Nacionalidad)
                                .addComponent(Nombre)
                                .addComponent(Sexo)
                                .addComponent(PaisActual)
                                .addComponent(Millas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FechaVencimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FechaEmisión, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NOPasaprte)
                                .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(EstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Apellido1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel22)))
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(NOPasaprte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(EstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(FechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(FechaEmisión, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(PaisActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(Millas))
                .addGap(18, 18, 18)
                .addComponent(GuardarjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarjButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GuardarjButton1ActionPerformed

    private void GuardarjButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarjButton1MouseClicked
        // TODO add your handling code here:
        vent.actualizarPasaporte(Integer.valueOf(NOPasaprte.getText()),darFormatoAFecha(FechaNacimiento.getDateFormatString()),Nacionalidad.getText(),EstadoCivil.getText(),Nombre.getText(),Apellido1.getText(),Sexo.getText(),darFormatoAFecha(FechaVencimiento.getDateFormatString()),darFormatoAFecha(FechaEmisión.getDateFormatString()),PaisActual.getText(),Integer.valueOf(Millas.getText()));
        this.dispose();
    }//GEN-LAST:event_GuardarjButton1MouseClicked

    private void ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñaActionPerformed

    private void NOPasaprteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOPasaprteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NOPasaprteActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static LocalDate darFormatoAFecha(String fechaCadena){
        String[] fechaDividida=fechaCadena.split("/");
        int dia = Integer.valueOf(fechaDividida[0]);
        int mes = Integer.valueOf(fechaDividida[1]);
        int anio = Integer.valueOf(fechaDividida[2]);
        return LocalDate.of(anio, mes, dia);
    }
    public void ObtenerFechaEmsión(PASAPORTE pasaporte){
        pasaporte.getFECHA_EMISION();
        System.out.println(pasaporte.getFECHA_EMISION());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido1;
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JTextField EstadoCivil;
    private com.toedter.calendar.JDateChooser FechaEmisión;
    private com.toedter.calendar.JDateChooser FechaNacimiento;
    private com.toedter.calendar.JDateChooser FechaVencimiento;
    private javax.swing.JButton GuardarjButton1;
    private javax.swing.JLabel Millas;
    private javax.swing.JFormattedTextField NOPasaprte;
    private javax.swing.JTextField Nacionalidad;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField PaisActual;
    private javax.swing.JTextField Sexo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
