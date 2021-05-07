/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Abstracts;

import java.util.Objects;

/**
 *
 * @author Oscar Luna
 */
public abstract class AEROPUERTO {
    
    //Declaro mis atributos
    private String NOMBRE_AEROPUERTO;
    private String CIUDAD;
    private String PAIS;
    private Integer CANTIDAD_DE_AVIONES;

    //Declaro mi constructor
    public AEROPUERTO(String NOMBRE_AEROPUERTO, String CIUDAD, String PAIS) {
        this.NOMBRE_AEROPUERTO = NOMBRE_AEROPUERTO;
        this.CIUDAD = CIUDAD;
        this.PAIS = PAIS;
    }
    

    public String getNOMBRE_AEROPUERTO() {
        return NOMBRE_AEROPUERTO;
    }

    public void setNOMBRE_AEROPUERTO(String NOMBRE_AEROPUERTO) {
        this.NOMBRE_AEROPUERTO = NOMBRE_AEROPUERTO;
    }

    public String getCIUDAD() {
        return CIUDAD;
    }

    public void setCIUDAD(String CIUDAD) {
        this.CIUDAD = CIUDAD;
    }

    public String getPAIS() {
        return PAIS;
    }

    public void setPAIS(String PAIS) {
        this.PAIS = PAIS;
    }

    public Integer getCANTIDAD_DE_AVIONES() {
        return CANTIDAD_DE_AVIONES;
    }

    //Declaro mis getters y setters
    public void setCANTIDAD_DE_AVIONES(Integer CANTIDAD_DE_AVIONES) {    
        this.CANTIDAD_DE_AVIONES = CANTIDAD_DE_AVIONES;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.NOMBRE_AEROPUERTO);
        hash = 71 * hash + Objects.hashCode(this.CIUDAD);
        hash = 71 * hash + Objects.hashCode(this.PAIS);
        hash = 71 * hash + Objects.hashCode(this.CANTIDAD_DE_AVIONES);
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
        final AEROPUERTO other = (AEROPUERTO) obj;
        if (!Objects.equals(this.NOMBRE_AEROPUERTO, other.NOMBRE_AEROPUERTO)) {
            return false;
        }
        if (!Objects.equals(this.CIUDAD, other.CIUDAD)) {
            return false;
        }
        if (!Objects.equals(this.PAIS, other.PAIS)) {
            return false;
        }
        if (!Objects.equals(this.CANTIDAD_DE_AVIONES, other.CANTIDAD_DE_AVIONES)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NOMBRE_AEROPUERTO=").append(NOMBRE_AEROPUERTO);
        sb.append(", CIUDAD=").append(CIUDAD);
        sb.append(", PAIS=").append(PAIS);
        sb.append(", CANTIDAD_DE_AVIONES=").append(CANTIDAD_DE_AVIONES);
        sb.append('}');
        return sb.toString();
    }
    
    public void SumadorDeAviones(Integer CANTIDAD_DE_AVIONES){
        this.CANTIDAD_DE_AVIONES=CANTIDAD_DE_AVIONES;
        CANTIDAD_DE_AVIONES=CANTIDAD_DE_AVIONES+1;
    }
    
    public void RestaDeAviones(Integer CANTIDAD_DE_AVIONES){
        this.CANTIDAD_DE_AVIONES=CANTIDAD_DE_AVIONES;
        CANTIDAD_DE_AVIONES=CANTIDAD_DE_AVIONES-1;
    }
    
}
