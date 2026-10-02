package com.factoryMethod.facto14;

public abstract class CreadorDocumento {
    protected abstract Documento crearDocumento(Plantilla plantilla);

    public Documento emitir(Plantilla plantilla){
        Documento documento = crearDocumento(plantilla);
        documento.validarDatosComunes(plantilla);
        documento.validarDatos(plantilla);
        return documento;
    }

}
