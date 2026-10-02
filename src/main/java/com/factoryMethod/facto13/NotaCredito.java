package com.factoryMethod.facto13;

public class NotaCredito implements DocumentoInterface{
    @Override
    public void validadPlantilla(Plantilla plantilla) {
        if(plantilla == null
                || plantilla.getEmisor() == null || plantilla.getEmisor().isBlank()
                || plantilla.getCliente() == null || plantilla.getCliente().isBlank()
                || plantilla.getMonto() <= 0){
            throw new IllegalArgumentException("La Nota de Credito tiene datos incorrectos");
        }
    }

    @Override
    public PlantillaDocumento generar(Plantilla plantilla) {
        validadPlantilla(plantilla);

        String contenido = """ 
                NOTA DE CREDITO
                Emisor: %s
                Cliente: %s
                Monto: %s                                
                """.formatted(plantilla.getEmisor(), plantilla.getCliente(), plantilla.getMonto());

        return new PlantillaDocumento("Credito001", "NOTA DE CREDITO", contenido);
    }

    @Override
    public String mostrarContenido() {
        return "text/plain";
    }
}
