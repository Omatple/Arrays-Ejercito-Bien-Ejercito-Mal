package org.iesalandalus.programacion.clasesinteresantes.tp04.arrays.modelo;

public enum RazaMalvada {
    ORCO("Orco", 2),
    SURENO_MALO("Sureño malo", 2),

    GOBLIN("Goblin", 2),
    HUARGO("Huargo", 3),
    TROLL("Troll", 5);

    private final String nombre;
    private final int valentia;

    RazaMalvada(String nombre, int valentia) {
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
