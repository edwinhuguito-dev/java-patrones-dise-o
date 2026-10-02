package com.factoryMethod.facto08;

public enum Categoria {

    URBANO(100),
    DEPORTIVO(220),
    TRABAJO(80);

    private final int velocidad;

    Categoria(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
