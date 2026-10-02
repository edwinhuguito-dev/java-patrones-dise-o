package com.factoryMethod.facto07;

public enum Nivel {

    BASICO(20),
    AVANZADO(50),
    LEGENDARIO(100);

    private final int dano;

    Nivel(int dano) {
        this.dano = dano;
    }

    public int getDano() {
        return dano;
    }
}
