/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciondiscos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author Javier
 */
public class EscrituraFicheroSerializado {
    public static void escrituraSerializado(List<Disco> listaDiscos,String nombreArchivo){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try {
            
            fos = new FileOutputStream(nombreArchivo);
            oos = new ObjectOutputStream(fos);
            
            for(Disco disco : listaDiscos){
                oos.writeObject(disco);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(oos != null){
                    oos.close();
                }
                if(fos != null){
                    fos.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
