package com.factoryMethod.facto14;

public class Factura extends Documento{
    protected Factura(Plantilla plantilla) {
        super(plantilla);
    }

    @Override
    void validarDatos(Plantilla plantilla) {
        if(plantilla.getTipoDocumento() != TipoDocumento.FACTURA){
            throw new IllegalArgumentException("Error en el tipo de documento que se que quiere emitir");
        }
    }
}
