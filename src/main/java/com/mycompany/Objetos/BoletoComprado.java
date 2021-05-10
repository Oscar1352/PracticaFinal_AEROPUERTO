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
public class BoletoComprado {
    private String CiudadOrigen;
    private String CiudadDestino;
    private Integer CantidadDeBoletos;
    private String FechaVuelo;
    private String Aerolinea;

    public BoletoComprado(String CiudadOrigen, String CiudadDestino, Integer CantidadDeBoletos, String FechaVuelo, String Aerolinea) {
        this.CiudadOrigen = CiudadOrigen;
        this.CiudadDestino = CiudadDestino;
        this.CantidadDeBoletos = CantidadDeBoletos;
        this.FechaVuelo = FechaVuelo;
        this.Aerolinea = Aerolinea;
    }

    public String getCiudadOrigen() {
        return CiudadOrigen;
    }

    public void setCiudadOrigen(String CiudadOrigen) {
        this.CiudadOrigen = CiudadOrigen;
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

    public String getFechaVuelo() {
        return FechaVuelo;
    }

    public void setFechaVuelo(String FechaVuelo) {
        this.FechaVuelo = FechaVuelo;
    }

    public String getAerolinea() {
        return Aerolinea;
    }

    public void setAerolinea(String Aerolinea) {
        this.Aerolinea = Aerolinea;
    }

    @Override
    public String toString() {
        return "CiudadOrigen=" + CiudadOrigen + ", CiudadDestino=" + CiudadDestino + ", CantidadDeBoletos=" + CantidadDeBoletos + ", FechaVuelo=" + FechaVuelo + ", Aerolinea=" + Aerolinea + '}';
    }
    
    
    
}
