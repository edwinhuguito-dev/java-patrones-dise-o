package com.factoryMethod.facto14;

public class CreadorBoleta extends CreadorDocumento{
    @Override
    protected Documento crearDocumento(Plantilla plantilla) {
        return new Boleta(plantilla);
    }
}
