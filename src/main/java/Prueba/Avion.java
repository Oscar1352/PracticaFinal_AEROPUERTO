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
import Prueba.Silla;

public class Avion
{
    static int x=50;
    public static final int SILLAS_ECONOMICAS=50;
    
    //Atributos
    
   private Silla[] sillasEconomicas;
   
   public Avion(){
       sillasEconomicas = new Silla[SILLAS_ECONOMICAS];
       sillasEconomicas[0]= new Silla(1, Silla.CLASE_ECONOMICA, Silla.VENTANA);
       
       int ubicacion;
       for(int numSilla=1,j=0; j<SILLAS_ECONOMICAS;numSilla++,j++){
           if(j%6==0 || j%6==5)
               ubicacion=Silla.VENTANA;
           else if(j%6==1 || j%6==4)
               ubicacion=Silla.CENTRAL;
           else
               ubicacion=Silla.PASILLO;
           
           sillasEconomicas[j]=new Silla(numSilla,Silla.CLASE_ECONOMICA,ubicacion);
       }
   }
   public Silla AsignarSilla(int clase, int ubicacion,Pasajero pasajero){
           Silla silla=null;
           if(clase== Silla.CLASE_ECONOMICA){
               silla= buscarSillaEconomicaLibre(ubicacion);
           }
           if(silla!=null){
               silla.asignarPasajero(pasajero);
           }
           return silla;
       }
   
   public Silla buscarSillaEconomicaLibre(int ubicacion){
       Silla silla=null;
       for(int i=0; i<SILLAS_ECONOMICAS;i++){
           silla=sillasEconomicas[i];
           if(silla.sillaAsignada()==false && silla.darUbicacion()==ubicacion){
               return silla;
           }
       }
       return null;
   }
   public Silla buscarPasajeroEconomico (Pasajero pasajero){
       boolean encontrado = false;
       Silla silla=null;
       for(int i=0; i<SILLAS_ECONOMICAS && !encontrado;i++){
           silla=sillasEconomicas[i];
           if(silla.sillaAsignada()==true && silla.darPasajero().igualA(pasajero)){
               encontrado=true;
           }
       }
       if(encontrado==true)
           return silla;
       else return null;
   }
   
   public boolean desasignarSilla(Pasajero pasajero){
       Silla silla = buscarPasajeroEconomico(pasajero);
       if (silla!=null){
           silla.desasignarSilla();
           return true;
       }else 
           return false;
   }
   public int contarSillasEconomicasOcupadas(){
       int contador=0;
       for (int i = 0; i < SILLAS_ECONOMICAS; i++) {
           if (sillasEconomicas[i].sillaAsignada()==true) {
               contador++;
           }
       }
       return contador;
   }
   
}

