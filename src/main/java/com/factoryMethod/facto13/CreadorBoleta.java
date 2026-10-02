package com.factoryMethod.facto13;

public class CreadorBoleta extends DocumentoCreador{

    @Override
    protected DocumentoInterface crear() {
        return new Boleta();
    }
}
