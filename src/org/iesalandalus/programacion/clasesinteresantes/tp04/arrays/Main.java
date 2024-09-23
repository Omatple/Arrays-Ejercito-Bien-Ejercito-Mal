package org.iesalandalus.programacion.clasesinteresantes.tp04.arrays;

import org.iesalandalus.programacion.clasesinteresantes.tp04.arrays.modelo.Batalla;
import org.iesalandalus.programacion.clasesinteresantes.tp04.arrays.vista.Consola;

public class Main {
    public static void main(String[] args) {
        Batalla batalla = new Batalla(Consola.leerNumeroIntegrantes());
        System.out.println(batalla);
    }
}