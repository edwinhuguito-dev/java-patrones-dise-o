package com.factoryMethod.facto10;

public enum Rango {

    NOVATO(100, 20, 1),
    VETERANO(200, 40, 2),
    ELITE(350, 70, 3),
    LEGENDARIO(500, 100, 4);

    private final int vida;
    private final int dano;
    private final int habilidad;

    Rango(int vida, int dano, int habilidad) {
        this.vida = vida;
        this.dano = dano;
        this.habilidad = habilidad;
    }

    public int getVida() {
        return vida;
    }

    public int getDano() {
        return dano;
    }

    public int getHabilidad() {
        return habilidad;
    }
}
