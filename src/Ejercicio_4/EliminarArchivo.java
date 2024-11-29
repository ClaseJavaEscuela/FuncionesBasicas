package Ejercicio_4;

import java.io.File;

public class EliminarArchivo {
    public static void main(String[] args) {
        // Crea un objeto File que representa el archivo "miArchivo.txt"
        File archivo = new File("miArchivo.txt");

        // Intenta eliminar el archivo
        if (archivo.delete()) {
            // Si la eliminación es exitosa, informa al usuario
            System.out.println("El archivo fue eliminado: " + archivo.getName());
        } else {
            // Si no se pudo eliminar, informa al usuario
            System.out.println("No se pudo eliminar el archivo.");
        }
    }
}
