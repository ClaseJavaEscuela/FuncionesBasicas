package Ejercicio_1;

import java.io.File;
import java.io.IOException;

public class CrearArchivo {
    public static void main(String[] args) {
        // Crea un objeto File que representa el archivo "miArchivo.txt"
        File archivo = new File("miArchivo.txt");

        try {
            // Intenta crear el archivo
            if (archivo.createNewFile()) {
                // Si se crea exitosamente, informa al usuario
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                // Si el archivo ya existe, informa al usuario
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            // Maneja cualquier error que ocurra durante la creación del archivo
            System.out.println("Ocurrió un error.");
            e.printStackTrace(); // Imprime la traza del error
        }
    }
}