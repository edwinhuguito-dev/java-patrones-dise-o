package com.factoryMethod.facto06;

public enum Dificultad {

    FACIL(80, 20),
    NORMAL(120, 35),
    DIFICIL(180, 50);

    private final int vida;
    private final int dano;

    Dificultad(int vida, int dano) {
        this.vida = vida;
        this.dano = dano;
    }

    public int getVida() {
        return vida;
    }

    public int getDano() {
        return dano;
    }
}
