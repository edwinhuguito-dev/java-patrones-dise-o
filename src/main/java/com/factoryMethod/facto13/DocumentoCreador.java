package com.factoryMethod.facto13;

public abstract class DocumentoCreador {

    protected abstract DocumentoInterface crear();

    public PlantillaDocumento emitir(Plantilla plantilla){
        DocumentoInterface documento  = crear();
        documento.validadPlantilla(plantilla);
        return documento.generar(plantilla);
    }

}
