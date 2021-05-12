/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Objetos;

import java.util.Objects;

/**
 *
 * @author Oscar Luna
 */
public class BOLETO {
    private String Pasaporte;
    private String CiudadDeOrigen;
    private String CiudadDestino;
    private Integer CantidadDeBoletos;
    private String FechaDeVuelo;
    private String Aerolinea;

    public BOLETO(String Pasaporte, String CiudadDeOrigen, String CiudadDestino, Integer CantidadDeBoletos, String FechaDeVuelo, String Aerolinea) {
        this.Pasaporte = Pasaporte;
        this.CiudadDeOrigen = CiudadDeOrigen;
        this.CiudadDestino = CiudadDestino;
        this.CantidadDeBoletos = CantidadDeBoletos;
        this.FechaDeVuelo = FechaDeVuelo;
        this.Aerolinea = Aerolinea;
    }
    

    public String getPasaporte() {
        return Pasaporte;
    }

    public void setPasaporte(String Pasaporte) {
        this.Pasaporte = Pasaporte;
    }

    public String getCiudadDeOrigen() {
        return CiudadDeOrigen;
    }

    public void setCiudadDeOrigen(String CiudadDeOrigen) {
        this.CiudadDeOrigen = CiudadDeOrigen;
    }

    public String getCiudadDestino() {
        return CiudadDestino;
    }

    public void setCiudadDestino(String CiudadDestino) {
        this.CiudadDestino = CiudadDestino;
    }

    public Integer getCantidadDeBoletos() {
        return CantidadDeBoletos;
    }

    public void setCantidadDeBoletos(Integer CantidadDeBoletos) {
        this.CantidadDeBoletos = CantidadDeBoletos;
    }

    public String getFechaDeVuelo() {
        return FechaDeVuelo;
    }

    public void setFechaDeVuelo(String FechaDeVuelo) {
        this.FechaDeVuelo = FechaDeVuelo;
    }

    public String getAerolinea() {
        return Aerolinea;
    }

    public void setAerolinea(String Aerolinea) {
        this.Aerolinea = Aerolinea;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.Pasaporte);
        hash = 59 * hash + Objects.hashCode(this.CiudadDeOrigen);
        hash = 59 * hash + Objects.hashCode(this.CiudadDestino);
        hash = 59 * hash + Objects.hashCode(this.CantidadDeBoletos);
        hash = 59 * hash + Objects.hashCode(this.FechaDeVuelo);
        hash = 59 * hash + Objects.hashCode(this.Aerolinea);
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
        final BOLETO other = (BOLETO) obj;
        if (!Objects.equals(this.Pasaporte, other.Pasaporte)) {
            return false;
        }
        if (!Objects.equals(this.CiudadDeOrigen, other.CiudadDeOrigen)) {
            return false;
        }
        if (!Objects.equals(this.CiudadDestino, other.CiudadDestino)) {
            return false;
        }
        if (!Objects.equals(this.FechaDeVuelo, other.FechaDeVuelo)) {
            return false;
        }
        if (!Objects.equals(this.Aerolinea, other.Aerolinea)) {
            return false;
        }
        if (!Objects.equals(this.CantidadDeBoletos, other.CantidadDeBoletos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pasaporte=" + Pasaporte + ", CiudadDeOrigen=" + CiudadDeOrigen + ", CiudadDestino=" + CiudadDestino + ", CantidadDeBoletos=" + CantidadDeBoletos + ", FechaDeVuelo=" + FechaDeVuelo + ", Aerolinea=" + Aerolinea;
    }
    
    
}
