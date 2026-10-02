package com.factoryMethod.facto01;

public class MainAnimal {
    public static void main(String[] args){

        Creador creador = new CreadorPerro();

        Animal animal = creador.crearAnimal();

        animal.hacerSonido();
    }
}
