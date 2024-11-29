package Ejercicio_3;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {
    public static void main(String[] args) {
        // Intenta abrir un FileWriter para escribir en "miArchivo.txt"
        try {
            FileWriter escritor = new FileWriter("miArchivo.txt");

            // Escribe contenido en el archivo, incluyendo un salto de línea
            escritor.write("Este es el contenido del archivo.\nOtra línea de texto.");

            escritor.close(); // Cierra el FileWriter para liberar recursos
            System.out.println("Se escribió correctamente en el archivo."); // Mensaje de éxito
        } catch (IOException e) {
            // Maneja cualquier error que ocurra durante la escritura del archivo
            System.out.println("Ocurrió un error al escribir.");
            e.printStackTrace(); // Imprime la traza del error
        }
    }
}
