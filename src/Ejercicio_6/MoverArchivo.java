package Ejercicio_6;

import java.io.File;

public class MoverArchivo {
    public static void main(String[] args) {
        // Crea un objeto File que representa el archivo original "miArchivo.txt"
        File archivo = new File("miArchivo.txt");

        // Crea un objeto File que representa el nuevo nombre del archivo "nuevoNombre.txt"
        File nuevoArchivo = new File("nuevoNombre.txt");

        // Intenta renombrar el archivo original al nuevo nombre
        if (archivo.renameTo(nuevoArchivo)) {
            // Si el renombrado es exitoso, informa al usuario
            System.out.println("Archivo renombrado a: " + nuevoArchivo.getName());
        } else {
            // Si no se pudo renombrar, informa al usuario
            System.out.println("No se pudo renombrar el archivo.");
        }
    }
}