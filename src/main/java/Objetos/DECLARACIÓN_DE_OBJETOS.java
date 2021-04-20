/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import Enums.ESTADO_CIVIL;
import Enums.SEXO;


/**
 *
 * @author Oscar Luna
 */
public class DECLARACIÓN_DE_OBJETOS {
  public static AEROPUERTO_DESTINO aeropuerto_destino= new AEROPUERTO_DESTINO("","","",5);
  public static AEROPUERTO_ORIGEN aeropuerto_origen= new AEROPUERTO_ORIGEN("","","",5);
  public static PASAPORTE pasaporte= new PASAPORTE(0,"","",ESTADO_CIVIL.SOLTERO,"","",SEXO.MASCULINO,"",0);
}
