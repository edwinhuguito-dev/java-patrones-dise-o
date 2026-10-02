package com.factoryMethod.facto06;

public class CreadorDragon implements CreadorEnemigo<String>{


    @Override
    public Enemigo crearEnemigo(String nombre, Dificultad dificultad, String especial) {
        return new Dragon(nombre, dificultad.getVida(), dificultad.getDano(), especial);
    }
}
