package com.mycompany.Objetos;
import java.time.LocalDate;
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
    private LocalDate FECHA_NACIMIENTO;
    private String NACIONALIDAD;
    private String ESTADO_CIVIL;
    private String NOMBRE;
    private String APELLIDOS;
    private String SEXO;
    private LocalDate FECHA_VENCIMIENTO;
    private LocalDate FECHA_EMISION;
    private String PAIS_ACTUAL;
    private Integer MILLAS_RECORRIDAS;

    //Declaro mi constructor

    public PASAPORTE(Integer NO_PASAPORTE, String CONTRASEÑA, LocalDate FECHA_NACIMIENTO, String NACIONALIDAD, String ESTADO_CIVIL, String NOMBRE, String APELLIDOS, String SEXO, LocalDate FECHA_VENCIMIENTO, LocalDate FECHA_EMISION, String PAIS_ACTUAL, Integer MILLAS_RECORRIDAS) {
        this.NO_PASAPORTE = NO_PASAPORTE;
        this.CONTRASEÑA = CONTRASEÑA;
        this.FECHA_NACIMIENTO = FECHA_NACIMIENTO;
        this.NACIONALIDAD = NACIONALIDAD;
        this.ESTADO_CIVIL = ESTADO_CIVIL;
        this.NOMBRE = NOMBRE;
        this.APELLIDOS = APELLIDOS;
        this.SEXO = SEXO;
        this.FECHA_VENCIMIENTO = FECHA_VENCIMIENTO;
        this.FECHA_EMISION = FECHA_EMISION;
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

    public LocalDate getFECHA_NACIMIENTO() {
        return FECHA_NACIMIENTO;
    }

    public void setFECHA_NACIMIENTO(LocalDate FECHA_NACIMIENTO) {
        this.FECHA_NACIMIENTO = FECHA_NACIMIENTO;
    }

    public String getNACIONALIDAD() {
        return NACIONALIDAD;
    }

    public void setNACIONALIDAD(String NACIONALIDAD) {
        this.NACIONALIDAD = NACIONALIDAD;
    }

    public String getESTADO_CIVIL() {
        return ESTADO_CIVIL;
    }

    public void setESTADO_CIVIL(String ESTADO_CIVIL) {
        this.ESTADO_CIVIL = ESTADO_CIVIL;
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

    public String getSEXO() {
        return SEXO;
    }

    public void setSEXO(String SEXO) {
        this.SEXO = SEXO;
    }

    public LocalDate getFECHA_VENCIMIENTO() {
        return FECHA_VENCIMIENTO;
    }

    public void setFECHA_VENCIMIENTO(LocalDate FECHA_VENCIMIENTO) {
        this.FECHA_VENCIMIENTO = FECHA_VENCIMIENTO;
    }

    public LocalDate getFECHA_EMISION() {
        return FECHA_EMISION;
    }

    public void setFECHA_EMISION(LocalDate FECHA_EMISION) {
        this.FECHA_EMISION = FECHA_EMISION;
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
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.NO_PASAPORTE);
        hash = 37 * hash + Objects.hashCode(this.CONTRASEÑA);
        hash = 37 * hash + Objects.hashCode(this.FECHA_NACIMIENTO);
        hash = 37 * hash + Objects.hashCode(this.NACIONALIDAD);
        hash = 37 * hash + Objects.hashCode(this.ESTADO_CIVIL);
        hash = 37 * hash + Objects.hashCode(this.NOMBRE);
        hash = 37 * hash + Objects.hashCode(this.APELLIDOS);
        hash = 37 * hash + Objects.hashCode(this.SEXO);
        hash = 37 * hash + Objects.hashCode(this.FECHA_VENCIMIENTO);
        hash = 37 * hash + Objects.hashCode(this.FECHA_EMISION);
        hash = 37 * hash + Objects.hashCode(this.PAIS_ACTUAL);
        hash = 37 * hash + Objects.hashCode(this.MILLAS_RECORRIDAS);
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
        if (!Objects.equals(this.NACIONALIDAD, other.NACIONALIDAD)) {
            return false;
        }
        if (!Objects.equals(this.ESTADO_CIVIL, other.ESTADO_CIVIL)) {
            return false;
        }
        if (!Objects.equals(this.NOMBRE, other.NOMBRE)) {
            return false;
        }
        if (!Objects.equals(this.APELLIDOS, other.APELLIDOS)) {
            return false;
        }
        if (!Objects.equals(this.SEXO, other.SEXO)) {
            return false;
        }
        if (!Objects.equals(this.PAIS_ACTUAL, other.PAIS_ACTUAL)) {
            return false;
        }
        if (!Objects.equals(this.NO_PASAPORTE, other.NO_PASAPORTE)) {
            return false;
        }
        if (!Objects.equals(this.FECHA_NACIMIENTO, other.FECHA_NACIMIENTO)) {
            return false;
        }
        if (!Objects.equals(this.FECHA_VENCIMIENTO, other.FECHA_VENCIMIENTO)) {
            return false;
        }
        if (!Objects.equals(this.FECHA_EMISION, other.FECHA_EMISION)) {
            return false;
        }
        if (!Objects.equals(this.MILLAS_RECORRIDAS, other.MILLAS_RECORRIDAS)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NO_PASAPORTE=" + NO_PASAPORTE + ", CONTRASEÑA=" + CONTRASEÑA + ", FECHA_NACIMIENTO=" + FECHA_NACIMIENTO + ", NACIONALIDAD=" + NACIONALIDAD + ", ESTADO_CIVIL=" + ESTADO_CIVIL + ", NOMBRE=" + NOMBRE + ", APELLIDOS=" + APELLIDOS + ", SEXO=" + SEXO + ", FECHA_VENCIMIENTO=" + FECHA_VENCIMIENTO + ", FECHA_EMISION=" + FECHA_EMISION + ", PAIS_ACTUAL=" + PAIS_ACTUAL + ", MILLAS_RECORRIDAS=" + MILLAS_RECORRIDAS + '}';
    }

    
   
    
}
