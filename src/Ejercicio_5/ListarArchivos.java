package Ejercicio_5;

import java.io.File;

public class ListarArchivos {
    public static void main(String[] args) {
        // Crea un objeto File que representa el directorio actual (".")
        File directorio = new File(".");

        // Obtiene la lista de archivos y subdirectorios en el directorio actual
        String[] archivos = directorio.list();

        // Imprime un encabezado para la lista de archivos
        System.out.println("Archivos en el directorio actual:");

        // Recorre cada archivo en la lista y lo imprime
        for (String archivo : archivos) {
            System.out.println(archivo);
        }
    }
}