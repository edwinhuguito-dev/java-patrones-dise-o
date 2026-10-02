package com.factoryMethod.facto04;

public class CreadorGuerrero implements CreadorPersonaje{
    @Override
    public Personaje crearPersonaje() {
        return new Guerrero();
    }
}
