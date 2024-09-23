package org.iesalandalus.programacion.clasesinteresantes.tp04.arrays.modelo;

import java.util.Arrays;
import java.util.Random;

public class EjercitoMal {
    private final Random generador = new Random();
    private final RazaMalvada[] razaMalvada;

    public EjercitoMal(int numeroIntegrantes) {
        if (numeroIntegrantes < 1) {
            throw new IllegalArgumentException("ERROR: Numero de integrantes no valido.");
        }
        razaMalvada = new RazaMalvada[numeroIntegrantes];
        int numRandom;
        for (int i = 0; i < razaMalvada.length; i++) {
            numRandom = generador.nextInt(RazaMalvada.values().length);
            razaMalvada[i] = RazaMalvada.values()[numRandom];
        }
    }

    public int getValentia() {
        int sumaTotalValentia = 0;
        for (int i = 0; i < razaMalvada.length; i++) {
            sumaTotalValentia += razaMalvada[i].getValentia();
        }
        return sumaTotalValentia;
    }

    @Override
    public String toString() {
        return String.format("ejercitoMal=%s", Arrays.toString(this.razaMalvada));
    }
}
