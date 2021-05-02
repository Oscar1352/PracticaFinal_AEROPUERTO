/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscritorBinario;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import com.mycompany.Abstracts.AEROPUERTO;

/**
 *
 * @author Oscar Luna
 */
public class BinariosAeropuertos {
       public static final File  FILE_VEHICULOS= new File("D:\\Documentos\\Cunoc\\Segundo año\\Progra\\PRACTICA FINAL\\OBJETOS GUARDADOS");
    
    public void guardarAeropuerto(ArrayList<AEROPUERTO> aeropuerto) throws IOException,FileNotFoundException{
        FileOutputStream fileOutput; 
        ObjectOutputStream salida;
        for (AEROPUERTO aeropuert : aeropuerto) {
            fileOutput = new FileOutputStream(FILE_VEHICULOS+"/"+aeropuert.getNOMBRE_AEROPUERTO());
            salida = new ObjectOutputStream(fileOutput);
            salida.writeObject(aeropuert);
            salida.close();
        }
    }
}
