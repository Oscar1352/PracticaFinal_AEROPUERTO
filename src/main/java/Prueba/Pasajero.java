package Prueba;

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
public class Pasajero
{
private int cedula;
private String nombre;

    public Pasajero(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }
public int darCedula(){
        return cedula;
    }

    public String darNombre(){
        return nombre;
    }
    public boolean igualA(Pasajero otroPasajero){
        if(cedula==otroPasajero.darCedula())
            return true;
        else return false;
    }
    
    


}
