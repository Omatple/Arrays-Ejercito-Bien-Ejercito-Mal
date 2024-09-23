package org.iesalandalus.programacion.clasesinteresantes.tp04.arrays.modelo;

import java.util.Arrays;
import java.util.Random;

public class EjercitoBien {
    private final Random generador = new Random();
    private final RazaBondadosa[] razaBondadosa;

    public EjercitoBien(int numeroIntegrantes) {
        if (numeroIntegrantes < 1) {
            throw new IllegalArgumentException("ERROR: Numero de integrantes no valido.");
        }
        razaBondadosa = new RazaBondadosa[numeroIntegrantes];
        int numRandom;
        for (int i = 0; i < razaBondadosa.length; i++) {
            numRandom = generador.nextInt(RazaBondadosa.values().length);
            razaBondadosa[i] = RazaBondadosa.values()[numRandom];
        }
    }

    public int getValentia() {
        int sumaTotalValentia = 0;
        for (int i = 0; i < razaBondadosa.length; i++) {
            sumaTotalValentia += razaBondadosa[i].getValentia();
        }
        return sumaTotalValentia;
    }

    @Override
    public String toString() {
        return String.format("ejercitoBien=%s", Arrays.toString(this.razaBondadosa));
    }
}
