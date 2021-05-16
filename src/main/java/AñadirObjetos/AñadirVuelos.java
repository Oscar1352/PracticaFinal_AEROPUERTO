/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AñadirObjetos;

import com.mycompany.Abstracts.AEROPUERTO;
import com.mycompany.InterfazGráfica.ModuloAdministración.Administracion;
import com.mycompany.InterfazGráfica.ModuloAdministración.Operador;
import com.mycompany.InterfazGráfica.ModuloUsuario.Principal;
import com.mycompany.Objetos.AEROPUERTO_DESTINO;
import com.mycompany.Objetos.AEROPUERTO_ORIGEN;
import com.mycompany.Objetos.AVION;
import com.mycompany.Objetos.PASAPORTE;
import com.mycompany.Objetos.VUELO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar Luna
 */
public class AñadirVuelos extends javax.swing.JFrame implements ActionListener {
    //Aeropuerto
    private static Vector listaAeropuertos;
    private Vector NombreAeropuertos;
    private static AEROPUERTO AeropuertoOrigen;
    private static AEROPUERTO AeropuertoDestino;
    private Administracion admin;
    private VUELO vuelo;
    private Operador vent;
    
     @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox comboBox = (JComboBox) e.getSource();
        AeropuertoOrigen = (AEROPUERTO) comboBox.getSelectedItem();
        System.out.println(AeropuertoOrigen.getNOMBRE_AEROPUERTO());
    }
    

    /**
     * Creates new form AñadirPasaporte
     */
    public AñadirVuelos(VUELO vuelo, Operador vent) {
        initComponents();
        this.vuelo = vuelo;
        this.vent = vent;
        if (vuelo!= null){
            //edición 
            this.PrecioBoleto.setText(String.valueOf(vuelo.getCODIGO_VUELO()));
            this.PrecioBoleto.setText(String.valueOf(vuelo.getCODIGO_AVION()));
            this.AeropuertosOrigenCombobox.setSelectedItem(vuelo.getNOMBRE_AEROPUERTO_ORIGEN());
            this.AeropuertosDestinoCombobox.setSelectedItem(vuelo.getNOMBRE_AEROPUERTO_DESTINO());
            this.PrecioBoleto.setText(String.valueOf(vuelo.getPRECIO_BOLETO()));
            
            //Obtener Fecha de Nacimiento
              try {
      String fecha =vuelo.getFECHA_SALIDAD();
      SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
      Date fechaDate = formato.parse(fecha);
      this.FechaSalida.setDate(fechaDate);
      } catch (ParseException ex) {
        Logger.getLogger(AñadirVuelos.class.getName()).log(Level.SEVERE, null, ex);
      }
              
        }
        else{
            this.PrecioBoleto.setText("");
            this.PrecioBoleto.setText("");
            this.AeropuertosOrigenCombobox.setSelectedItem("");
            this.AeropuertosDestinoCombobox.setSelectedItem("");
            this.PrecioBoleto.setText("");

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

        jLabel15 = new javax.swing.JLabel();
        FechaSalida = new com.toedter.calendar.JDateChooser();
        AeropuertosOrigenCombobox = new javax.swing.JComboBox(admin.getListaAeropuertos());
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CrearVuelo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        AeropuertosDestinoCombobox = new javax.swing.JComboBox(admin.getListaAeropuertos());
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PrecioBoleto = new javax.swing.JFormattedTextField();
        CodigoVuelo = new javax.swing.JFormattedTextField();
        CodigoAvion = new javax.swing.JComboBox<>(admin.getCodigosAviones());

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel15.setText("Nombre Aeropuerto Origen:");

        AeropuertosOrigenCombobox.addActionListener( this );
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
        AeropuertosOrigenCombobox.putClientProperty("JComboBox.isTableCellEditor", Boolean.TRUE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("BIENVENIDO AL MENÚ DE CREACIÓN DE VUELOS");

        jLabel2.setText("Codigo Vuelo");

        CrearVuelo.setBackground(new java.awt.Color(153, 204, 255));
        CrearVuelo.setForeground(new java.awt.Color(0, 0, 0));
        CrearVuelo.setText("CREAR VUELO");
        CrearVuelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearVueloMouseClicked(evt);
            }
        });

        jLabel5.setText("Nombre Aeropuerto Destino:");

        jLabel6.setText("Precio Boleto:");

        jLabel3.setText("Codigo Avion");

        jLabel7.setText("Fecha De Salida:");

        PrecioBoleto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        CodigoVuelo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(58, 58, 58)
                                    .addComponent(jLabel3)
                                    .addGap(49, 49, 49))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel2)
                                .addGap(50, 50, 50)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AeropuertosDestinoCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FechaSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PrecioBoleto)
                            .addComponent(AeropuertosOrigenCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CodigoAvion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CodigoVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(216, 216, 216))
            .addGroup(layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(CrearVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CodigoVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CodigoAvion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AeropuertosOrigenCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AeropuertosDestinoCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(CrearVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearVueloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearVueloMouseClicked
        // TODO add your handling code here:
           //Aeropuerto Origen
        AeropuertoOrigen = (AEROPUERTO) AeropuertosOrigenCombobox.getSelectedItem();
        //Aeropuerto Destino
        AeropuertoDestino = (AEROPUERTO) AeropuertosDestinoCombobox.getSelectedItem();
        
        
        if(AeropuertoOrigen.equals(AeropuertoDestino)){
            JOptionPane.showMessageDialog(null, "El vuelo no se puede relizar Origen y Destino Iguales");
        }else{
        //Añadir          }
        try {
            
Date date = FechaSalida.getDate();
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
vent.actualizarVuelo(Long.valueOf(CodigoVuelo.getText()),Long.valueOf(CodigoVuelo.getText()),AeropuertoOrigen.getNOMBRE_AEROPUERTO(),AeropuertoDestino.getNOMBRE_AEROPUERTO(),Integer.valueOf(PrecioBoleto.getText()),String.valueOf(sdf.format(date)));
JOptionPane.showMessageDialog(null, "Vuelo Planificado con éxito");
this.dispose();

} catch (Exception e) {
JOptionPane.showMessageDialog(null, "Al menos elija FECHAS VALIDAS ", "Error..!!", JOptionPane.ERROR_MESSAGE);

}
       }
    }//GEN-LAST:event_CrearVueloMouseClicked

    
    
    public static LocalDate darFormatoAFecha(String fechaCadena){
        String[] fechaDividida=fechaCadena.split("/");
        int dia = Integer.valueOf(fechaDividida[0]);
        int mes = Integer.valueOf(fechaDividida[1]);
        int anio = Integer.valueOf(fechaDividida[2]);
        return LocalDate.of(anio, mes, dia);
    }
    /**
     * @param args the command line arguments
     */

    public static AEROPUERTO getAeropuertoOrigen() {
        return AeropuertoOrigen;
    }

    public static void setAeropuertoOrigen(AEROPUERTO AeropuertoOrigen) {
        AñadirVuelos.AeropuertoOrigen = AeropuertoOrigen;
    }

    public static AEROPUERTO getAeropuertoDestino() {
        return AeropuertoDestino;
    }

    /**
     * @param args the command line arguments
     */
    public static void setAeropuertoDestino(AEROPUERTO AeropuertoDestino) {
        AñadirVuelos.AeropuertoDestino = AeropuertoDestino;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AeropuertosDestinoCombobox;
    private javax.swing.JComboBox<String> AeropuertosOrigenCombobox;
    private javax.swing.JComboBox<String> CodigoAvion;
    private javax.swing.JFormattedTextField CodigoVuelo;
    private javax.swing.JButton CrearVuelo;
    private com.toedter.calendar.JDateChooser FechaSalida;
    private javax.swing.JFormattedTextField PrecioBoleto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
