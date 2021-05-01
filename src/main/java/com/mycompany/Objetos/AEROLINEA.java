/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Objetos;

import com.mycompany.Abstracts.AEROPUERTO;
import java.util.Objects;

/**
 *
 * @author Oscar Luna
 */
public class AEROLINEA {
    private AEROPUERTO aeropuerto;
    private String NOMBRE_AEROLINEA;

    public AEROLINEA(AEROPUERTO aeropuerto, String NOMBRE_AEROLINEA) {
        this.aeropuerto = aeropuerto;
        this.NOMBRE_AEROLINEA = NOMBRE_AEROLINEA;
    }

    public AEROPUERTO getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(AEROPUERTO aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public String getNOMBRE_AEROLINEA() {
        return NOMBRE_AEROLINEA;
    }

    public void setNOMBRE_AEROLINEA(String NOMBRE_AEROLINEA) {
        this.NOMBRE_AEROLINEA = NOMBRE_AEROLINEA;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.aeropuerto);
        hash = 59 * hash + Objects.hashCode(this.NOMBRE_AEROLINEA);
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
        final AEROLINEA other = (AEROLINEA) obj;
        if (!Objects.equals(this.NOMBRE_AEROLINEA, other.NOMBRE_AEROLINEA)) {
            return false;
        }
        if (!Objects.equals(this.aeropuerto, other.aeropuerto)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Aeropuerto=" + aeropuerto + ", NOMBRE_AEROLINEA=" + NOMBRE_AEROLINEA + '}';
    }
    
    
    
}
