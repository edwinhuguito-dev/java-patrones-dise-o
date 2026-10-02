package com.factoryMethod.facto06;

public class CreadorOrco implements CreadorEnemigo<Integer>{


    @Override
    public Enemigo crearEnemigo(String nombre, Dificultad dificultad, Integer especial) {
        return new Orco(nombre, dificultad.getVida(), dificultad.getDano(), especial);
    }
}
