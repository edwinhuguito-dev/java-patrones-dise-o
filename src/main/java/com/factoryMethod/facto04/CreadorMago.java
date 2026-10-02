package com.factoryMethod.facto04;

public class CreadorMago implements CreadorPersonaje{
    @Override
    public Personaje crearPersonaje() {
        return new Mago();
    }
}
