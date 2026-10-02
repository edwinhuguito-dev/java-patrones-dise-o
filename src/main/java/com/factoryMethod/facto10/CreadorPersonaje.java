package com.factoryMethod.facto10;

public interface CreadorPersonaje<T> {
    Personaje creadorPersonaje(String nombre, Rango rango, T atributopersonaje, String arma, Habilidad habilidad);
}
