package com.factoryMethod.facto09;

public interface CreadorPersonaje<T> {
    Personaje crearPersonaje(String nombre, Rango rango,  T atributoEspecial, String equipamento);
}
