package com.factoryMethod.facto14;

public abstract class Documento {
    private Plantilla plantilla;
    protected Documento(Plantilla plantilla) {
        this.plantilla = plantilla;
    }

    public void validarDatosComunes(Plantilla plantilla) {
        if (plantilla.getVendedor() == null
            || plantilla.getCliente() == null
            || plantilla.getTipoDocumento() == null
            || plantilla.getMonto() <= 0
            || plantilla.getDetalles() == null){

            throw new IllegalArgumentException("Los datos ingresados son errados");
        }
    }

    abstract void validarDatos(Plantilla plantilla);

    public void mostrarDatos (){
        System.out.println(plantilla.getVendedor()
        + " || " + plantilla.getCliente() + " || " + plantilla.getTipoDocumento()
        + " || " + plantilla.getMonto() + " || " + plantilla.getDetalles());
    }
}