package com.factoryMethod.facto14;

public class Boleta extends Documento{

    protected Boleta(Plantilla plantilla) {
        super(plantilla);
    }

    @Override
    void validarDatos(Plantilla plantilla) {
        if(plantilla.getTipoDocumento() != TipoDocumento.BOLETA){
            throw new IllegalArgumentException("Error en el tipo de documento que se que quiere emitir");
        }
    }


}
