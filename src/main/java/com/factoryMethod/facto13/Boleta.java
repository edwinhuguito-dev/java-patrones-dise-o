package com.factoryMethod.facto13;

public class Boleta implements DocumentoInterface{
    @Override
    public void validadPlantilla(Plantilla plantilla) {
        if(plantilla == null
        || plantilla.getEmisor() == null || plantilla.getEmisor().isBlank()
        || plantilla.getCliente() == null || plantilla.getCliente().isBlank()
        || plantilla.getMonto() <= 0){
            throw new IllegalArgumentException("La boleta tiene datos incorrectos");
        }
    }

    @Override
    public PlantillaDocumento generar(Plantilla plantilla) {
        validadPlantilla(plantilla);
        String contenido = """ 
                BOLETA
                Emisor: %s
                Cliente: %s
                Monto: %s                                
                """.formatted(plantilla.getEmisor(), plantilla.getCliente(), plantilla.getMonto());


        return new PlantillaDocumento("Boleta001", "BOLETA", contenido);
    }

    @Override
    public String mostrarContenido() {
        return "text/plain";
    }
}
