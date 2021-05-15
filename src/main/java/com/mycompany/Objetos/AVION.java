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
public class AVION {
     //Declaro mis atributos
    private String NOMBRE_AEROLINEA;
    private String NOMBRE_AEROPUERTO_ACTUAL;
    private Long CODIGO_AVION;
    private Integer CANTIDAD_PASAJEROS;
    private Integer CAPACIADAD_GASOLINA;
    private Integer CONSUMO_POR_MILLA;

    //Declaro mi constructor

    public AVION(String NOMBRE_AEROLINEA, String NOMBRE_AEROPUERTO_ACTUAL, Long CODIGO_AVION, Integer CANTIDAD_PASAJEROS, Integer CAPACIADAD_GASOLINA, Integer CONSUMO_POR_MILLA) {
        this.NOMBRE_AEROLINEA = NOMBRE_AEROLINEA;
        this.NOMBRE_AEROPUERTO_ACTUAL = NOMBRE_AEROPUERTO_ACTUAL;
        this.CODIGO_AVION = CODIGO_AVION;
        this.CANTIDAD_PASAJEROS = CANTIDAD_PASAJEROS;
        this.CAPACIADAD_GASOLINA = CAPACIADAD_GASOLINA;
        this.CONSUMO_POR_MILLA = CONSUMO_POR_MILLA;
    }
    

    
    //Declaro mis getters y setters

    public String getNOMBRE_AEROLINEA() {
        return NOMBRE_AEROLINEA;
    }

    public void setNOMBRE_AEROLINEA(String NOMBRE_AEROLINEA) {
        this.NOMBRE_AEROLINEA = NOMBRE_AEROLINEA;
    }

    public String getNOMBRE_AEROPUERTO_ACTUAL() {
        return NOMBRE_AEROPUERTO_ACTUAL;
    }

    public void setNOMBRE_AEROPUERTO_ACTUAL(String NOMBRE_AEROPUERTO_ACTUAL) {
        this.NOMBRE_AEROPUERTO_ACTUAL = NOMBRE_AEROPUERTO_ACTUAL;
    }

    public Long getCODIGO_AVION() {
        return CODIGO_AVION;
    }

    public void setCODIGO_AVION(Long CODIGO_AVION) {
        this.CODIGO_AVION = CODIGO_AVION;
    }

    public Integer getCANTIDAD_PASAJEROS() {
        return CANTIDAD_PASAJEROS;
    }

    public void setCANTIDAD_PASAJEROS(Integer CANTIDAD_PASAJEROS) {
        this.CANTIDAD_PASAJEROS = CANTIDAD_PASAJEROS;
    }

    public Integer getCAPACIADAD_GASOLINA() {
        return CAPACIADAD_GASOLINA;
    }

    public void setCAPACIADAD_GASOLINA(Integer CAPACIADAD_GASOLINA) {
        this.CAPACIADAD_GASOLINA = CAPACIADAD_GASOLINA;
    }

    public Integer getCONSUMO_POR_MILLA() {
        return CONSUMO_POR_MILLA;
    }

    public void setCONSUMO_POR_MILLA(Integer CONSUMO_POR_MILLA) {
        this.CONSUMO_POR_MILLA = CONSUMO_POR_MILLA;
    }

    @Override
    public String toString() {
        return "NOMBRE_AEROLINEA=" + NOMBRE_AEROLINEA + ", NOMBRE_AEROPUERTO_ACTUAL=" + NOMBRE_AEROPUERTO_ACTUAL + ", CODIGO_AVION=" + CODIGO_AVION + ", CANTIDAD_PASAJEROS=" + CANTIDAD_PASAJEROS + ", CAPACIADAD_GASOLINA=" + CAPACIADAD_GASOLINA + ", CONSUMO_POR_MILLA=" + CONSUMO_POR_MILLA;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.NOMBRE_AEROLINEA);
        hash = 71 * hash + Objects.hashCode(this.NOMBRE_AEROPUERTO_ACTUAL);
        hash = 71 * hash + Objects.hashCode(this.CODIGO_AVION);
        hash = 71 * hash + Objects.hashCode(this.CANTIDAD_PASAJEROS);
        hash = 71 * hash + Objects.hashCode(this.CAPACIADAD_GASOLINA);
        hash = 71 * hash + Objects.hashCode(this.CONSUMO_POR_MILLA);
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
        final AVION other = (AVION) obj;
        if (!Objects.equals(this.NOMBRE_AEROLINEA, other.NOMBRE_AEROLINEA)) {
            return false;
        }
        if (!Objects.equals(this.NOMBRE_AEROPUERTO_ACTUAL, other.NOMBRE_AEROPUERTO_ACTUAL)) {
            return false;
        }
        if (!Objects.equals(this.CODIGO_AVION, other.CODIGO_AVION)) {
            return false;
        }
        if (!Objects.equals(this.CANTIDAD_PASAJEROS, other.CANTIDAD_PASAJEROS)) {
            return false;
        }
        if (!Objects.equals(this.CAPACIADAD_GASOLINA, other.CAPACIADAD_GASOLINA)) {
            return false;
        }
        if (!Objects.equals(this.CONSUMO_POR_MILLA, other.CONSUMO_POR_MILLA)) {
            return false;
        }
        return true;
    }
    
    
    
}
