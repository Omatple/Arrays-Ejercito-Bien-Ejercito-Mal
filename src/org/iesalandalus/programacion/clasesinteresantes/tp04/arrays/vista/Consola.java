package org.iesalandalus.programacion.clasesinteresantes.tp04.arrays.vista;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
    private Consola() {
    }

    public static int leerNumeroIntegrantes() {
        int numeroIntegrantes;
        System.out.print("Introduce el número de integrantes: ");
        numeroIntegrantes = Entrada.entero();
        while(numeroIntegrantes < 1) {
            System.out.println(" ERROR: Numero de integrantes no valido. Intentalo de nuevo.");
            System.out.print("Introduce el número de integrantes: ");
            numeroIntegrantes = Entrada.entero();
        }
        return numeroIntegrantes;
    }
}
