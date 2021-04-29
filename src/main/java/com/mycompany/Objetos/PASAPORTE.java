package com.mycompany.Objetos;
import com.mycompany.Enums.ESTADO_CIVIL;
import com.mycompany.Enums.SEXO;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar Luna
 */
public class PASAPORTE {
    
    //Defino mis atributos
    private static int NO_PASAPORTE;
    private String CONTRASEÑA;
    private String Nacionalidad;
    private ESTADO_CIVIL estado_civil;
    private String NOMBRE;
    private String APELLIDOS;
    private SEXO sexo;
    private String PAIS_ACTUAL;
    private int MILLAS_RECORRIDAS;

    //Declaro mi constructor
    public PASAPORTE(int NO_PASAPORTE, String CONTRASEÑA, String Nacionalidad, ESTADO_CIVIL estado_civil, String NOMBRE, String APELLIDOS, SEXO sexo, String PAIS_ACTUAL, int MILLAS_RECORRIDAS) {
        this.NO_PASAPORTE = NO_PASAPORTE;
        this.CONTRASEÑA = CONTRASEÑA;
        this.Nacionalidad = Nacionalidad;
        this.estado_civil = estado_civil;
        this.NOMBRE = NOMBRE;
        this.APELLIDOS = APELLIDOS;
        this.sexo = sexo;
        this.PAIS_ACTUAL = PAIS_ACTUAL;
        this.MILLAS_RECORRIDAS = MILLAS_RECORRIDAS;
    }

    //Declaro mis getters y setters
    public int getNO_PASAPORTE() {
        return NO_PASAPORTE;
    }

    public void setNO_PASAPORTE(int NO_PASAPORTE) {
        this.NO_PASAPORTE = NO_PASAPORTE;
    }

    public String getCONTRASEÑA() {
        return CONTRASEÑA;
    }

    public void setCONTRASEÑA(String CONTRASEÑA) {
        this.CONTRASEÑA = CONTRASEÑA;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public ESTADO_CIVIL getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(ESTADO_CIVIL estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDOS() {
        return APELLIDOS;
    }

    public void setAPELLIDOS(String APELLIDOS) {
        this.APELLIDOS = APELLIDOS;
    }

    public SEXO getSexo() {
        return sexo;
    }

    public void setSexo(SEXO sexo) {
        this.sexo = sexo;
    }

    public String getPAIS_ACTUAL() {
        return PAIS_ACTUAL;
    }

    public void setPAIS_ACTUAL(String PAIS_ACTUAL) {
        this.PAIS_ACTUAL = PAIS_ACTUAL;
    }

    public int getMILLAS_RECORRIDAS() {
        return MILLAS_RECORRIDAS;
    }

    public void setMILLAS_RECORRIDAS(int MILLAS_RECORRIDAS) {
        this.MILLAS_RECORRIDAS = MILLAS_RECORRIDAS;
    } 
}
