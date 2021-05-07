/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Objetos;

import com.mycompany.Abstracts.AEROPUERTO;

/**
 *
 * @author Oscar Luna
 */
public class AEROPUERTO_ORIGEN extends AEROPUERTO{

    //Declaro mi Constructor

    public AEROPUERTO_ORIGEN(String NOMBRE_AEROPUERTO, String CIUDAD, String PAIS) {    
        super(NOMBRE_AEROPUERTO, CIUDAD, PAIS); 
    }

    //Declaro mis getters y setters de mi clase abstracta

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCANTIDAD_DE_AVIONES(Integer CANTIDAD_DE_AVIONES) {
        super.setCANTIDAD_DE_AVIONES(CANTIDAD_DE_AVIONES); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer getCANTIDAD_DE_AVIONES() {
        return super.getCANTIDAD_DE_AVIONES(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPAIS(String PAIS) {
        super.setPAIS(PAIS); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPAIS() {
        return super.getPAIS(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCIUDAD(String CIUDAD) {
        super.setCIUDAD(CIUDAD); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCIUDAD() {
        return super.getCIUDAD(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNOMBRE_AEROPUERTO(String NOMBRE_AEROPUERTO) {
        super.setNOMBRE_AEROPUERTO(NOMBRE_AEROPUERTO); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNOMBRE_AEROPUERTO() {
        return super.getNOMBRE_AEROPUERTO(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RestaDeAviones(Integer CANTIDAD_DE_AVIONES) {
        super.RestaDeAviones(CANTIDAD_DE_AVIONES); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void SumadorDeAviones(Integer CANTIDAD_DE_AVIONES) {
        super.SumadorDeAviones(CANTIDAD_DE_AVIONES); //To change body of generated methods, choose Tools | Templates.
    }
   
    
    
}
