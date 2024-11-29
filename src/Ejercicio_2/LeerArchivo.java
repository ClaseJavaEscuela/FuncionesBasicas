package Ejercicio_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerArchivo {
    public static void main(String[] args) {
        try {
            // Crea un objeto File que representa el archivo "miArchivo.txt"
            File archivo = new File("miArchivo.txt");
            // Crea un Scanner para leer el contenido del archivo
            Scanner lector = new Scanner(archivo);

            // Lee el archivo línea por línea mientras haya más líneas
            while (lector.hasNextLine()) {
                String linea = lector.nextLine(); // Lee la siguiente línea
                System.out.println(linea); // Imprime la línea leída
            }

            lector.close(); // Cierra el Scanner para liberar recursos
        } catch (FileNotFoundException e) {
            // Maneja el caso en que el archivo no se encuentra
            System.out.println("Archivo no encontrado.");
            e.printStackTrace(); // Imprime la traza del error
        }
    }
}