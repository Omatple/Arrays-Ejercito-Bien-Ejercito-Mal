package org.iesalandalus.programacion.clasesinteresantes.tp04.arrays.modelo;

public enum RazaBondadosa {
    PELOSOS("Peloso", 1),
    SURENO_BUENO("Sureño bueno", 2),
    ENANO("Enanos", 3),
    NUMENOREANO("Numenóreano", 4),
    ELFO("Elfo", 5);

    private final String nombre;
    private final int valentia;

    RazaBondadosa(String nombre, int valentia) {
        this.nombre = nombre;
        this.valentia = valentia;
    }

    public int getValentia() {
        return valentia;
    }

    @Override
    public String toString() {
        return String.format("%s", this.nombre);
    }
}
