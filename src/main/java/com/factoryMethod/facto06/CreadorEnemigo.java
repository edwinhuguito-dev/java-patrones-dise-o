package com.factoryMethod.facto06;

public interface CreadorEnemigo<T> {


    Enemigo crearEnemigo(String nombre, Dificultad dificultad,  T especial);
}
