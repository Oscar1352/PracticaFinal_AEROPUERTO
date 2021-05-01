/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Objetos;

import java.time.LocalDate;

/**
 *
 * @author Oscar Luna
 */
public class PERSONA extends PASAPORTE{
    private boolean PoseePasaporte=false;

    public PERSONA(Integer NO_PASAPORTE, String CONTRASEÑA, LocalDate FECHA_NACIMIENTO, String NACIONALIDAD, String ESTADO_CIVIL, String NOMBRE, String APELLIDOS, String SEXO, LocalDate FECHA_VENCIMIENTO, LocalDate FECHA_EMISION, String PAIS_ACTUAL, Integer MILLAS_RECORRIDAS) {
        super(NO_PASAPORTE, CONTRASEÑA, FECHA_NACIMIENTO, NACIONALIDAD, ESTADO_CIVIL, NOMBRE, APELLIDOS, SEXO, FECHA_VENCIMIENTO, FECHA_EMISION, PAIS_ACTUAL, MILLAS_RECORRIDAS);
    }

    public boolean isPoseePasaporte() {
        return PoseePasaporte;
    }

    public void setPoseePasaporte(boolean PoseePasaporte) {
        this.PoseePasaporte = PoseePasaporte;
    }
    
    
    
}
