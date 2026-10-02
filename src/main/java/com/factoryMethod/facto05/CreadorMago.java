package com.factoryMethod.facto05;

public class CreadorMago implements CreadorPersonaje{
    @Override
    public Personaje crearPersonaje() {
        return new Mago("Huguito", 80, "Guantes magicos");
    }
}
