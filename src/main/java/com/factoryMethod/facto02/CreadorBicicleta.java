package com.factoryMethod.facto02;

public class CreadorBicicleta implements CreadorTra{
    @Override
    public Transporte crearTransporte() {
        return new Bicicleta();
    }
}
