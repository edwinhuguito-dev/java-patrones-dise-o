package com.factoryMethod.facto06;

public class CreadorEsqueleto implements CreadorEnemigo<String>{


    @Override
    public Enemigo crearEnemigo(String nombre, Dificultad dificultad, String tipoArma) {
        return new Esqueleto(nombre, dificultad.getVida(), dificultad.getDano(), tipoArma);
    }
}
