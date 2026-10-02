package com.factoryMethod.facto14;

public class CreadorNotaCredito extends CreadorDocumento{
    @Override
    protected Documento crearDocumento(Plantilla plantilla) {
        return new NotaCredito(plantilla);
    }
}
