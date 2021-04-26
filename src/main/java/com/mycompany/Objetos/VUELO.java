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
public class VUELO {
    
    //Declaro mis atributos
    private int CODIGO_VUELO;
    private int CODIGO_AVION;
    private String NOMBRE_AEROPUERTO_ORIGEN;
    private String NOMBRE_AEROPUERTO_DESTINO;
    private int PRECIO_BOLETO;
    private int FECHA_SALIDAD;

    //Declaro mi constructor
    public VUELO(int CODIGO_VUELO, int CODIGO_AVION, String NOMBRE_AEROPUERTO_ORIGEN, String NOMBRE_AEROPUERTO_DESTINO, int PRECIO_BOLETO, int FECHA_SALIDAD) {
        this.CODIGO_VUELO = CODIGO_VUELO;
        this.CODIGO_AVION = CODIGO_AVION;
        this.NOMBRE_AEROPUERTO_ORIGEN = NOMBRE_AEROPUERTO_ORIGEN;
        this.NOMBRE_AEROPUERTO_DESTINO = NOMBRE_AEROPUERTO_DESTINO;
        this.PRECIO_BOLETO = PRECIO_BOLETO;
        this.FECHA_SALIDAD = FECHA_SALIDAD;
    }

    
    //Declaro mis getters y setters
    public int getCODIGO_VUELO() {
        return CODIGO_VUELO;
    }

    public void setCODIGO_VUELO(int CODIGO_VUELO) {
        this.CODIGO_VUELO = CODIGO_VUELO;
    }

    public int getCODIGO_AVION() {
        return CODIGO_AVION;
    }

    public void setCODIGO_AVION(int CODIGO_AVION) {
        this.CODIGO_AVION = CODIGO_AVION;
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

    public int getPRECIO_BOLETO() {
        return PRECIO_BOLETO;
    }

    public void setPRECIO_BOLETO(int PRECIO_BOLETO) {
        this.PRECIO_BOLETO = PRECIO_BOLETO;
    }

    public int getFECHA_SALIDAD() {
        return FECHA_SALIDAD;
    }

    public void setFECHA_SALIDAD(int FECHA_SALIDAD) {
        this.FECHA_SALIDAD = FECHA_SALIDAD;
    }
    
}
