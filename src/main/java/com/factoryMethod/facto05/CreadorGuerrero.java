package com.factoryMethod.facto05;

public class CreadorGuerrero implements CreadorPersonaje{
    @Override
    public Personaje crearPersonaje() {
        return new Guerrero("Pedro", 90, "Mazo de Thor");
    }
}
