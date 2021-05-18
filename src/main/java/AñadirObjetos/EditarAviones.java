/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AñadirObjetos;

import ManejadoresDeDatos.ImportExportAerolinea;
import ManejadoresDeDatos.ImportExportAviones;
import com.mycompany.Abstracts.AEROPUERTO;
import com.mycompany.InterfazGráfica.ModuloAdministración.Administracion;
import com.mycompany.Objetos.AEROLINEA;
import com.mycompany.Objetos.AVION;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar Luna
 */
public class EditarAviones extends javax.swing.JFrame {
//Aeropuerto
    private static Vector listaAerolineas = new Vector();
    private Vector NombreAeropuertos = new Vector();
    private AEROPUERTO Aeropuerto;
    private AEROLINEA aerolineaelegida;
    private AEROPUERTO aeropuertoelegido;
    private Administracion admin;
    private AñadirAerolinea añadirAerolinea;
    
    //Aerolinea
    public void actualizarAerolinea(String AEROPUERTO, String NOMBRE_AEROLINEA){
        if (AEROPUERTO!=null)
        listaAerolineas.add(new AEROLINEA(AEROPUERTO,NOMBRE_AEROLINEA) {});
        
    }
    /**
     * Creates new form AñadirAerolinea
     */
    public EditarAviones(AVION aviones, Administracion vent) {
        initComponents();
        
                if (aviones!= null){
            //edición 
            this.NombreAerolinea.setText(aviones.getNOMBRE_AEROLINEA());
            this.AerpuertoActual.setText(aviones.getNOMBRE_AEROPUERTO_ACTUAL());
            this.CodigoAvion.setText(String.valueOf(aviones.getCODIGO_AVION()));
            this.CantidadPasajeros.setText(String.valueOf(aviones.getCANTIDAD_PASAJEROS()));
            this.CapacidadGasolina.setText(String.valueOf(aviones.getCAPACIADAD_GASOLINA()));
            this.ConsumoPorMilla.setText(String.valueOf(aviones.getCONSUMO_POR_MILLA()));
            
            //Obtener Fecha de Nacimiento
            }else {
                    this.NombreAerolinea.setText("");
            this.AerpuertoActual.setText("");
            this.CodigoAvion.setText("");
            this.CantidadPasajeros.setText("");
            this.CapacidadGasolina.setText("");
            this.ConsumoPorMilla.setText("");
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

        CrearVuelo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CodigoAvion = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        CantidadPasajeros = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        CapacidadGasolina = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        ConsumoPorMilla = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        NombreAerolinea = new javax.swing.JTextField();
        AerpuertoActual = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AÑADIR AEROLINEA");

        CrearVuelo.setBackground(new java.awt.Color(153, 204, 255));
        CrearVuelo.setForeground(new java.awt.Color(0, 0, 0));
        CrearVuelo.setText("GUARDAR CAMBIOS");
        CrearVuelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearVueloMouseClicked(evt);
            }
        });

        jLabel1.setText("Nombre Aerolinea:");

        jLabel2.setText("Aeropuerto Actual:");

        jLabel3.setText("Codigo Avion:");

        CodigoAvion.setEditable(false);
        CodigoAvion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel4.setText("Cantidad Pasajeros");

        CantidadPasajeros.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel5.setText("Capacidad Gasolina:");

        CapacidadGasolina.setEditable(false);
        CapacidadGasolina.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel6.setText("Consumo Por Milla");

        ConsumoPorMilla.setEditable(false);
        ConsumoPorMilla.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("EDITAR AVIONES");

        NombreAerolinea.setEditable(false);

        AerpuertoActual.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(578, 578, 578))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CrearVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(239, 239, 239))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(265, 265, 265))))
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CodigoAvion, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                    .addComponent(CantidadPasajeros, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                    .addComponent(ConsumoPorMilla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CapacidadGasolina, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                    .addComponent(NombreAerolinea)
                    .addComponent(AerpuertoActual))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(NombreAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(CodigoAvion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CantidadPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(CapacidadGasolina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ConsumoPorMilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(CrearVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AerpuertoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearVueloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearVueloMouseClicked
        // TODO add your handling code here:
        //Añadir
        Administracion.actualizarAvion(NombreAerolinea.getText(), AerpuertoActual.getText(), Long.valueOf(CodigoAvion.getText()), Integer.valueOf(CantidadPasajeros.getText()), Integer.valueOf(CapacidadGasolina.getText()), Integer.valueOf(ConsumoPorMilla.getText()));
        JOptionPane.showMessageDialog(null, "Avion Agregada con exito con éxito");

        this.dispose();
    }//GEN-LAST:event_CrearVueloMouseClicked

    /**
     * @param args the command line arguments
     */
   

    public static Vector getListaAerolineas() {
        return listaAerolineas;
    }

    public static void setListaAerolineas(Vector listaAerolineas) {
        EditarAviones.listaAerolineas = listaAerolineas;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AerpuertoActual;
    private javax.swing.JFormattedTextField CantidadPasajeros;
    private javax.swing.JFormattedTextField CapacidadGasolina;
    private javax.swing.JFormattedTextField CodigoAvion;
    private javax.swing.JFormattedTextField ConsumoPorMilla;
    private javax.swing.JButton CrearVuelo;
    private javax.swing.JTextField NombreAerolinea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
