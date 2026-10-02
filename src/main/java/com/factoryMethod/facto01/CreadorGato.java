package com.factoryMethod.facto01;

public class CreadorGato extends Creador{
    @Override
    public Animal crearAnimal() {
        return new Gato();
    }
}
