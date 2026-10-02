package com.factoryMethod.facto02;

public class MainTransporte {
    public static void main(String[] args){

        CreadorTra nuevo = new CreadorAuto();
        Transporte movi = nuevo.crearTransporte();

        movi.mover();

        CreadorTra nuevo1 = new CreadorBicicleta();
        Transporte movi1 = nuevo1.crearTransporte();

        movi1.mover();

    }
}
