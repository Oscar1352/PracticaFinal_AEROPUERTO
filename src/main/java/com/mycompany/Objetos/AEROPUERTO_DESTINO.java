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
public class AEROPUERTO_DESTINO extends AEROPUERTO{

    //Declaro mi Constructor
    public AEROPUERTO_DESTINO(String NOMBRE_AEROPUERTO_DESTINO, String CIUDAD, String PAIS, int CANTIDAD_DE_AVIONES) {
        super(NOMBRE_AEROPUERTO_DESTINO, CIUDAD, PAIS, CANTIDAD_DE_AVIONES);
    }
    
    
//Declaro mis getters y setters de mi clase abstracta
    @Override
    public void setCANTIDAD_DE_AVIONES(int CANTIDAD_DE_AVIONES) {
        super.setCANTIDAD_DE_AVIONES(CANTIDAD_DE_AVIONES); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCANTIDAD_DE_AVIONES() {
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
    public void setNOMBRE_AEROPUERTO_DESTINO(String NOMBRE_AEROPUERTO_DESTINO) {
        super.setNOMBRE_AEROPUERTO_DESTINO(NOMBRE_AEROPUERTO_DESTINO); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNOMBRE_AEROPUERTO_DESTINO() {
        return super.getNOMBRE_AEROPUERTO_DESTINO(); //To change body of generated methods, choose Tools | Templates.
    }
}