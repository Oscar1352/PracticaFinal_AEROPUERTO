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
public class DISTANCIA {

    private String NOMBRE_AEROPUERTO_ORIGEN;
    private String NOMBRE_AEROPUERTO_DESTINO;
    private Integer CANTIDAD_MILLAS;

    public DISTANCIA(String NOMBRE_AEROPUERTO_ORIGEN, String NOMBRE_AEROPUERTO_DESTINO, Integer CANTIDAD_MILLAS) {
        this.NOMBRE_AEROPUERTO_ORIGEN = NOMBRE_AEROPUERTO_ORIGEN;
        this.NOMBRE_AEROPUERTO_DESTINO = NOMBRE_AEROPUERTO_DESTINO;
        this.CANTIDAD_MILLAS = CANTIDAD_MILLAS;
    }

    public String getNOMBRE_AEROPUERTO_ORIGEN() {
        return NOMBRE_AEROPUERTO_ORIGEN;
    }

    public void setNOMBRE_AEROPUERTO_ORIGEN(String NOMBRE_AEROPUERTO_ORIGEN) {
        this.NOMBRE_AEROPUERTO_ORIGEN = NOMBRE_AEROPUERTO_ORIGEN;
    }

    public String getNOMBRE_AEROPUERTO_DESTINO() {
        return NOMBRE_AEROPUERTO_DESTINO;
    }

    public void setNOMBRE_AEROPUERTO_DESTINO(String NOMBRE_AEROPUERTO_DESTINO) {
        this.NOMBRE_AEROPUERTO_DESTINO = NOMBRE_AEROPUERTO_DESTINO;
    }

    public Integer getCANTIDAD_MILLAS() {
        return CANTIDAD_MILLAS;
    }

    public void setCANTIDAD_MILLAS(Integer CANTIDAD_MILLAS) {
        this.CANTIDAD_MILLAS = CANTIDAD_MILLAS;
    }

    @Override
    public String toString() {
        return "NOMBRE_AEROPUERTO_ORIGEN=" + NOMBRE_AEROPUERTO_ORIGEN + ", NOMBRE_AEROPUERTO_DESTINO=" + NOMBRE_AEROPUERTO_DESTINO + ", CANTIDAD_MILLAS=" + CANTIDAD_MILLAS;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.NOMBRE_AEROPUERTO_ORIGEN);
        hash = 43 * hash + Objects.hashCode(this.NOMBRE_AEROPUERTO_DESTINO);
        hash = 43 * hash + Objects.hashCode(this.CANTIDAD_MILLAS);
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
        final DISTANCIA other = (DISTANCIA) obj;
        if (!Objects.equals(this.NOMBRE_AEROPUERTO_ORIGEN, other.NOMBRE_AEROPUERTO_ORIGEN)) {
            return false;
        }
        if (!Objects.equals(this.NOMBRE_AEROPUERTO_DESTINO, other.NOMBRE_AEROPUERTO_DESTINO)) {
            return false;
        }
        if (!Objects.equals(this.CANTIDAD_MILLAS, other.CANTIDAD_MILLAS)) {
            return false;
        }
        return true;
    }
    
    
    //Declaro mis atributos
    
    /**
     * @param args the command line arguments
     */
}
