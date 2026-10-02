package com.factoryMethod.facto14;

public class CreadorFactura extends CreadorDocumento{
    @Override
    protected Documento crearDocumento(Plantilla plantilla) {
        return new Factura(plantilla);
    }
}
