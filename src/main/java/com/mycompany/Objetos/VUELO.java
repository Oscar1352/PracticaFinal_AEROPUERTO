/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Objetos;
import com.mycompany.Enums.ESTADO_DE_VUELO;
import java.util.Objects;

/**
 *
 * @author Oscar Luna
 */
public class VUELO {
    
    //Declaro mis atributos
    private Integer CODIGO_VUELO;
    private Integer CODIGO_AVION;
    private String NOMBRE_AEROPUERTO_ORIGEN;
    private String NOMBRE_AEROPUERTO_DESTINO;
    private Integer PRECIO_BOLETO;
    private String FECHA_SALIDA;
    private static ESTADO_DE_VUELO estado_de_vuelo= ESTADO_DE_VUELO.EN_ESPERA;

    //Declaro mi constructor
    public VUELO(Integer CODIGO_VUELO, Integer CODIGO_AVION, String NOMBRE_AEROPUERTO_ORIGEN, String NOMBRE_AEROPUERTO_DESTINO, Integer PRECIO_BOLETO, String FECHA_SALIDA) {
        this.CODIGO_VUELO = CODIGO_VUELO;
        this.CODIGO_AVION = CODIGO_AVION;
        this.NOMBRE_AEROPUERTO_ORIGEN = NOMBRE_AEROPUERTO_ORIGEN;
        this.NOMBRE_AEROPUERTO_DESTINO = NOMBRE_AEROPUERTO_DESTINO;
        this.PRECIO_BOLETO = PRECIO_BOLETO;
        this.FECHA_SALIDA = FECHA_SALIDA;
    }
    

    public Integer getCODIGO_VUELO() {
        return CODIGO_VUELO;
    }

    public void setCODIGO_VUELO(Integer CODIGO_VUELO) {
        this.CODIGO_VUELO = CODIGO_VUELO;
    }

    public Integer getCODIGO_AVION() {
        return CODIGO_AVION;
    }

    public void setCODIGO_AVION(Integer CODIGO_AVION) {
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

    public Integer getPRECIO_BOLETO() {
        return PRECIO_BOLETO;
    }

    public void setPRECIO_BOLETO(Integer PRECIO_BOLETO) {
        this.PRECIO_BOLETO = PRECIO_BOLETO;
    }

    public String getFECHA_SALIDAD() {
        return FECHA_SALIDA;
    }

    public void setFECHA_SALIDAD(String FECHA_SALIDAD) {
        this.FECHA_SALIDA = FECHA_SALIDAD;
    }

    public static ESTADO_DE_VUELO getEstado_de_vuelo() {
        return estado_de_vuelo;
    }

    //Declaro mis getters y setters
    public static void setEstado_de_vuelo(ESTADO_DE_VUELO estado_de_vuelo) {    
        VUELO.estado_de_vuelo = estado_de_vuelo;
    }

    @Override
    public String toString() {
        return "CODIGO_VUELO=" + CODIGO_VUELO + ", CODIGO_AVION=" + CODIGO_AVION + ", NOMBRE_AEROPUERTO_ORIGEN=" + NOMBRE_AEROPUERTO_ORIGEN + ", NOMBRE_AEROPUERTO_DESTINO=" + NOMBRE_AEROPUERTO_DESTINO + ", PRECIO_BOLETO=" + PRECIO_BOLETO + ", FECHA_SALIDAD=" + FECHA_SALIDA + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final VUELO other = (VUELO) obj;
        if (this.CODIGO_VUELO != other.CODIGO_VUELO) {
            return false;
        }
        if (this.CODIGO_AVION != other.CODIGO_AVION) {
            return false;
        }
        if (this.PRECIO_BOLETO != other.PRECIO_BOLETO) {
            return false;
        }
        if (!Objects.equals(this.NOMBRE_AEROPUERTO_ORIGEN, other.NOMBRE_AEROPUERTO_ORIGEN)) {
            return false;
        }
        if (!Objects.equals(this.NOMBRE_AEROPUERTO_DESTINO, other.NOMBRE_AEROPUERTO_DESTINO)) {
            return false;
        }
        if (!Objects.equals(this.FECHA_SALIDA, other.FECHA_SALIDA)) {
            return false;
        }
        return true;
    }
    
    
}
