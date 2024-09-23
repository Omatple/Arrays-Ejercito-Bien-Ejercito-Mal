package org.iesalandalus.programacion.clasesinteresantes.tp04.arrays.modelo;

public class Batalla {
    private final EjercitoBien ejercitoBien;
    private final EjercitoMal ejercitoMal;

    public Batalla(int numeroIntegrantes) {
        if (numeroIntegrantes < 1) {
            throw new IllegalArgumentException("ERROR: Numero de integrantes no valido.");
        }
        ejercitoBien = new EjercitoBien(numeroIntegrantes);
        ejercitoMal = new EjercitoMal(numeroIntegrantes);
    }

    public String getResultado() {
        String cadenaResultado;
        if (ejercitoBien.getValentia() == ejercitoMal.getValentia()) {
            cadenaResultado = "Ha habido un empate entre el bien y el mal";
        } else if (ejercitoBien.getValentia() > ejercitoMal.getValentia()) {
            cadenaResultado = "Gana el bien";
        } else {
            cadenaResultado = "Gana el mal";
        }
        return cadenaResultado;
    }

    @Override
    public String toString() {
        return String.format("El resultado de la batalla es: %s\n%s\n%s", getResultado(), this.ejercitoBien, this.ejercitoMal);
    }
}
