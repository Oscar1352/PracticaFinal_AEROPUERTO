/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Oscar Luna
 */
public class AVIONES {
     //Declaro mis atributos
    private String NOMBRE_AEROLINEA;
    private String NOMBRE_AEROPUERTO_ACTUAL;
    private int CODIGO_AVION;
    private int CANTIDAD_PASAJEROS;
    private int CAPACIADAD_GASOLINA;
    private int CONSUMO_POR_MILLA;

    //Declaro mi constructor
    public AVIONES(String NOMBRE_AEROLINEA, String NOMBRE_AEROPUERTO_ACTUAL, int CODIGO_AVION, int CANTIDAD_PASAJEROS, int CAPACIADAD_GASOLINA, int CONSUMO_POR_MILLA) {
        this.NOMBRE_AEROLINEA = NOMBRE_AEROLINEA;
        this.NOMBRE_AEROPUERTO_ACTUAL = NOMBRE_AEROPUERTO_ACTUAL;
        this.CODIGO_AVION = CODIGO_AVION;
        this.CANTIDAD_PASAJEROS = CANTIDAD_PASAJEROS;
        this.CAPACIADAD_GASOLINA = CAPACIADAD_GASOLINA;
        this.CONSUMO_POR_MILLA = CONSUMO_POR_MILLA;
    }

    
    //Declaro mis getters y setters
    public String getNOMBRE_AEROLINEA() {
        return NOMBRE_AEROLINEA;
    }

    public void setNOMBRE_AEROLINEA(String NOMBRE_AEROLINEA) {
        this.NOMBRE_AEROLINEA = NOMBRE_AEROLINEA;
    }

    public String getNOMBRE_AEROPUERTO_ACTUAL() {
        return NOMBRE_AEROPUERTO_ACTUAL;
    }

    public void setNOMBRE_AEROPUERTO_ACTUAL(String NOMBRE_AEROPUERTO_ACTUAL) {
        this.NOMBRE_AEROPUERTO_ACTUAL = NOMBRE_AEROPUERTO_ACTUAL;
    }

    public int getCODIGO_AVION() {
        return CODIGO_AVION;
    }

    public void setCODIGO_AVION(int CODIGO_AVION) {
        this.CODIGO_AVION = CODIGO_AVION;
    }

    public int getCANTIDAD_PASAJEROS() {
        return CANTIDAD_PASAJEROS;
    }

    public void setCANTIDAD_PASAJEROS(int CANTIDAD_PASAJEROS) {
        this.CANTIDAD_PASAJEROS = CANTIDAD_PASAJEROS;
    }

    public int getCAPACIADAD_GASOLINA() {
        return CAPACIADAD_GASOLINA;
    }

    public void setCAPACIADAD_GASOLINA(int CAPACIADAD_GASOLINA) {
        this.CAPACIADAD_GASOLINA = CAPACIADAD_GASOLINA;
    }

    public int getCONSUMO_POR_MILLA() {
        return CONSUMO_POR_MILLA;
    }

    public void setCONSUMO_POR_MILLA(int CONSUMO_POR_MILLA) {
        this.CONSUMO_POR_MILLA = CONSUMO_POR_MILLA;
    }
    
    
}
