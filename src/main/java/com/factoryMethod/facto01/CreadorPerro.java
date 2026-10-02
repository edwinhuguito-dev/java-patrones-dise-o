package com.factoryMethod.facto01;

public class CreadorPerro extends Creador{
    @Override
    public Animal crearAnimal() {
        return new Perro();
    }
}
