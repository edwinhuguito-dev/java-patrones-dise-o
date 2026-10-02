package com.factoryMethod.facto02;

public class CreadorAuto implements CreadorTra {

    @Override
    public Transporte crearTransporte() {
        return new Auto();
    }
}
