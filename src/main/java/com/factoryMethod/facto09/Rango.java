package com.factoryMethod.facto09;

public enum Rango {

    NOVATO(100, 20),
    VETERANO(200, 40),
    ELITE(350, 70);

    private final int vida;
    private final int danoBase;

    Rango(int vida, int danoBase) {
        this.vida = vida;
        this.danoBase = danoBase;
    }

    public int getVida() {
        return vida;
    }

    public int getDanoBase() {
        return danoBase;
    }
}
