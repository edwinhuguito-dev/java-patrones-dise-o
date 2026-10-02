package com.factoryMethod.facto13;

public interface DocumentoInterface {

    void validadPlantilla(Plantilla plantilla);
    PlantillaDocumento generar(Plantilla plantilla);
    String mostrarContenido();
}
