package Ejercicio_7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopiarArchivos {
    public static void main(String[] args) {
        // Define la ruta del archivo de origen "miArchivo.txt"
        Path origen = Paths.get("miArchivo.txt");

        // Define la ruta del archivo de destino "copiaArchivo.txt"
        Path destino = Paths.get("copiaArchivo.txt");

        try {
            // Intenta copiar el archivo de origen al destino
            Files.copy(origen, destino);
            // Informa al usuario que el archivo ha sido copiado
            System.out.println("Archivo copiado a: " + destino);
        } catch (IOException e) {
            // Maneja cualquier error que ocurra durante la copia del archivo
            System.out.println("No se pudo copiar el archivo.");
            e.printStackTrace(); // Imprime la traza del error
        }
    }
}
