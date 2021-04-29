/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Objetos;

import java.util.Objects;

/**
 *
 * @author Oscar Luna
 */
public class TARJETA {

    //Declaro mis variables
    private Integer NO_TARJETA;
    private Integer NO_PASAPORTE; 
    private Integer DINERO_ACTUAL;
    private Integer CODIGO_CVC;

    

    /**
     * @param args the command line arguments
     */
    
    //Declaro mi constructor
public TARJETA(Integer NO_TARJETA, Integer NO_PASAPORTE, Integer DINERO_ACTUAL, Integer CODIGO_CVC) {
        this.NO_TARJETA = NO_TARJETA;
        this.NO_PASAPORTE = NO_PASAPORTE;
        this.DINERO_ACTUAL = DINERO_ACTUAL;
        this.CODIGO_CVC = CODIGO_CVC;
    }

        
    //Declaro mis getters y setters

    public Integer getNO_TARJETA() {
        return NO_TARJETA;
    }

    public void setNO_TARJETA(Integer NO_TARJETA) {
        this.NO_TARJETA = NO_TARJETA;
    }

    public Integer getNO_PASAPORTE() {
        return NO_PASAPORTE;
    }

    public void setNO_PASAPORTE(Integer NO_PASAPORTE) {
        this.NO_PASAPORTE = NO_PASAPORTE;
    }

    public Integer getDINERO_ACTUAL() {
        return DINERO_ACTUAL;
    }

    public void setDINERO_ACTUAL(Integer DINERO_ACTUAL) {
        this.DINERO_ACTUAL = DINERO_ACTUAL;
    }

    public Integer getCODIGO_CVC() {
        return CODIGO_CVC;
    }

    public void setCODIGO_CVC(Integer CODIGO_CVC) {
        this.CODIGO_CVC = CODIGO_CVC;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.NO_TARJETA);
        hash = 13 * hash + Objects.hashCode(this.NO_PASAPORTE);
        hash = 13 * hash + Objects.hashCode(this.DINERO_ACTUAL);
        hash = 13 * hash + Objects.hashCode(this.CODIGO_CVC);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TARJETA other = (TARJETA) obj;
        if (!Objects.equals(this.NO_TARJETA, other.NO_TARJETA)) {
            return false;
        }
        if (!Objects.equals(this.NO_PASAPORTE, other.NO_PASAPORTE)) {
            return false;
        }
        if (!Objects.equals(this.DINERO_ACTUAL, other.DINERO_ACTUAL)) {
            return false;
        }
        if (!Objects.equals(this.CODIGO_CVC, other.CODIGO_CVC)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NO_TARJETA=" + NO_TARJETA + ", NO_PASAPORTE=" + NO_PASAPORTE + ", DINERO_ACTUAL=" + DINERO_ACTUAL + ", CODIGO_CVC=" + CODIGO_CVC + '}';
    }
  
    
        
}
