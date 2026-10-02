package com.factoryMethod.facto14;

public class NotaCredito extends Documento{
    protected NotaCredito(Plantilla plantilla) {
        super(plantilla);
    }

    @Override
    void validarDatos(Plantilla plantilla) {
        if(plantilla.getTipoDocumento() != TipoDocumento.NOTA_CREDITO){
            throw new IllegalArgumentException("Error en el tipo de documento que se que quiere emitir");
        }
    }
}
