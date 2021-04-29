/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oliver
 */
public class ManejoArchivos {
    
    
    public static List<String> getLinesTextFile(String path){
        List<String> response = new ArrayList<>();
        
        Charset utf8 = Charset.forName("UTF-8");
        try (
                BufferedReader in = new BufferedReader(new InputStreamReader( new FileInputStream(path),utf8));
                ){
            String line =null;
            while((line = in.readLine())!= null){
                response.add(line);
            }
        }
        catch(IOException e){
            System.out.println(e);
            response = new ArrayList<>();
        }
        
        return response;
    }
    
    
}
