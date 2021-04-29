package com.mycompany.Objetos;
import java.util.Objects;
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
    private Integer NO_PASAPORTE;
    private String CONTRASEÑA;
    private String Nacionalidad;
    private String estado_civil;
    private String NOMBRE;
    private String APELLIDOS;
    private String sexo;
    private String PAIS_ACTUAL;
    private Integer MILLAS_RECORRIDAS;

    //Declaro mi constructor

    public PASAPORTE(Integer NO_PASAPORTE, String CONTRASEÑA, String Nacionalidad, String estado_civil, String NOMBRE, String APELLIDOS, String sexo, String PAIS_ACTUAL, Integer MILLAS_RECORRIDAS) {
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

    public Integer getNO_PASAPORTE() {
        return NO_PASAPORTE;
    }

    public void setNO_PASAPORTE(Integer NO_PASAPORTE) {
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

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPAIS_ACTUAL() {
        return PAIS_ACTUAL;
    }

    public void setPAIS_ACTUAL(String PAIS_ACTUAL) {
        this.PAIS_ACTUAL = PAIS_ACTUAL;
    }

    public Integer getMILLAS_RECORRIDAS() {
        return MILLAS_RECORRIDAS;
    }

    public void setMILLAS_RECORRIDAS(Integer MILLAS_RECORRIDAS) {
        this.MILLAS_RECORRIDAS = MILLAS_RECORRIDAS;
    }

    @Override
    public String toString() {
        return "NO_PASAPORTE:" + NO_PASAPORTE + ", CONTRASEÑA:" + CONTRASEÑA + ", Nacionalidad:" + Nacionalidad + ", estado_civil:" + estado_civil + ", NOMBRE:" + NOMBRE + ", APELLIDOS:" + APELLIDOS + ", sexo:" + sexo + ", PAIS_ACTUAL:" + PAIS_ACTUAL + ", MILLAS_RECORRIDAS:" + MILLAS_RECORRIDAS + '}';
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.NO_PASAPORTE);
        hash = 97 * hash + Objects.hashCode(this.CONTRASEÑA);
        hash = 97 * hash + Objects.hashCode(this.Nacionalidad);
        hash = 97 * hash + Objects.hashCode(this.estado_civil);
        hash = 97 * hash + Objects.hashCode(this.NOMBRE);
        hash = 97 * hash + Objects.hashCode(this.APELLIDOS);
        hash = 97 * hash + Objects.hashCode(this.sexo);
        hash = 97 * hash + Objects.hashCode(this.PAIS_ACTUAL);
        hash = 97 * hash + Objects.hashCode(this.MILLAS_RECORRIDAS);
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
        final PASAPORTE other = (PASAPORTE) obj;
        if (!Objects.equals(this.CONTRASEÑA, other.CONTRASEÑA)) {
            return false;
        }
        if (!Objects.equals(this.Nacionalidad, other.Nacionalidad)) {
            return false;
        }
        if (!Objects.equals(this.NOMBRE, other.NOMBRE)) {
            return false;
        }
        if (!Objects.equals(this.APELLIDOS, other.APELLIDOS)) {
            return false;
        }
        if (!Objects.equals(this.PAIS_ACTUAL, other.PAIS_ACTUAL)) {
            return false;
        }
        if (!Objects.equals(this.NO_PASAPORTE, other.NO_PASAPORTE)) {
            return false;
        }
        if (this.estado_civil != other.estado_civil) {
            return false;
        }
        if (this.sexo != other.sexo) {
            return false;
        }
        if (!Objects.equals(this.MILLAS_RECORRIDAS, other.MILLAS_RECORRIDAS)) {
            return false;
        }
        return true;
    }
   
    
}
