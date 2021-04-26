/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Objetos;

/**
 *
 * @author Oscar Luna
 */
public class TARJETA {

    //Declaro mis variables
    private int NO_TARJETA;
    private int NO_PASAPORTE; 
    private int DINERO_ACTUAL;
    private int CODIGO_CVC;

    /**
     * @param args the command line arguments
     */
    
    //Declaro mi constructor
        public TARJETA(int NO_TARJETA, int NO_PASAPORTE, int DINERO_ACTUAL, int CODIGO_CVC) {
        this.NO_TARJETA = NO_TARJETA;
        this.NO_PASAPORTE = NO_PASAPORTE;
        this.DINERO_ACTUAL = DINERO_ACTUAL;
        this.CODIGO_CVC = CODIGO_CVC;
    }

        
    //Declaro mis getters y setters
    public int getNO_TARJETA() {
        return NO_TARJETA;
    }

    public void setNO_TARJETA(int NO_TARJETA) {
        this.NO_TARJETA = NO_TARJETA;
    }

    public int getNO_PASAPORTE() {
        return NO_PASAPORTE;
    }

    public void setNO_PASAPORTE(int NO_PASAPORTE) {
        this.NO_PASAPORTE = NO_PASAPORTE;
    }

    public int getDINERO_ACTUAL() {
        return DINERO_ACTUAL;
    }

    public void setDINERO_ACTUAL(int DINERO_ACTUAL) {
        this.DINERO_ACTUAL = DINERO_ACTUAL;
    }

    public int getCODIGO_CVC() {
        return CODIGO_CVC;
    }

    public void setCODIGO_CVC(int CODIGO_CVC) {
        this.CODIGO_CVC = CODIGO_CVC;
    }
        
}
