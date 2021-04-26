/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Abstracts;

/**
 *
 * @author Oscar Luna
 */
public abstract class AEROPUERTO {
    
    //Declaro mis atributos
    private String NOMBRE_AEROPUERTO;
    private String CIUDAD;
    private String PAIS;
    private int CANTIDAD_DE_AVIONES;

    //Declaro mi constructor
    public AEROPUERTO(String NOMBRE_AEROPUERTO, String CIUDAD, String PAIS, int CANTIDAD_DE_AVIONES) {
        this.NOMBRE_AEROPUERTO = NOMBRE_AEROPUERTO;
        this.CIUDAD = CIUDAD;
        this.PAIS = PAIS;
        this.CANTIDAD_DE_AVIONES = CANTIDAD_DE_AVIONES;
    }

    
    //Declaro mis getters y setters
    public String getNOMBRE_AEROPUERTO_DESTINO() {
        return NOMBRE_AEROPUERTO;
    }

    public void setNOMBRE_AEROPUERTO_DESTINO(String NOMBRE_AEROPUERTO_DESTINO) {
        this.NOMBRE_AEROPUERTO = NOMBRE_AEROPUERTO_DESTINO;
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

    public int getCANTIDAD_DE_AVIONES() {
        return CANTIDAD_DE_AVIONES;
    }

    public void setCANTIDAD_DE_AVIONES(int CANTIDAD_DE_AVIONES) {
        this.CANTIDAD_DE_AVIONES = CANTIDAD_DE_AVIONES;
    }
    
    
}
