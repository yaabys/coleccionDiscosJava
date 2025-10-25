/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciondiscos;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author Javier
 */
public class EscrituraFicheroCSV {
    public static void escrituraCsv(List<Disco> listaDiscos,String nombreArchivo){
        FileWriter archivoEscritura = null;
        PrintWriter escritor = null;
        
        try {
            archivoEscritura = new FileWriter(nombreArchivo, false);
            escritor = new PrintWriter(archivoEscritura);
             do {

                for (int i = 0; i < listaDiscos.size(); i++) {
                    escritor.write(listaDiscos.get(i).getTitulo() + ";");
                    escritor.write(listaDiscos.get(i).getArtista() + ";");
                    escritor.write(listaDiscos.get(i).getAnio() + ";");
                    escritor.write(listaDiscos.get(i).getGenero() + ";");
                    escritor.write("\n");
                }

                break;

            } while (true);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(escritor != null){
                    escritor.close();
                }
                if(archivoEscritura != null){
                    archivoEscritura.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
}
