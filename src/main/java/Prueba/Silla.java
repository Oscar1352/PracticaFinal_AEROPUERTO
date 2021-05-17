package Prueba;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar Luna
 */
public class Silla
{
public final static int CLASE_ECONOMICA=1;
public final static int VENTANA=1;
public final static int CENTRAL=2;
public final static int PASILLO=3;

//Atributos
private int numero;
private int clase;
private int ubicacion;
private Pasajero pasajero;

    public Silla(int numero, int clase, int unaubicacion) {
        this.numero = numero;
        this.clase = clase;
        this.ubicacion = unaubicacion;
        this.pasajero = null;
    }

    public void asignarPasajero(Pasajero p){
        pasajero=p;
    }
  
public void desasignarPasajero(Pasajero p){
        pasajero=null;
    }

public boolean sillaAsignada(){
    if(pasajero==null){
        return false;
        
    }else{
        return true;
    }
}

public void desasignarSilla(){
    pasajero=null;
}

public boolean sillaAsignadaPasajero(Pasajero p){
    if(null==pasajero)
        return false;
        else if(pasajero.igualA(p))
            return false;
    else
            return false;
}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getClase() {
        return clase;
    }

    public void setClase(int clase) {
        this.clase = clase;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }
    
    public int darClase(){
        return clase;
    }
    
    public int darNumero(){
        return numero;
    }
    public int darUbicacion(){
        return ubicacion;
    }
    public Pasajero darPasajero(){
        return pasajero;
    }

}
