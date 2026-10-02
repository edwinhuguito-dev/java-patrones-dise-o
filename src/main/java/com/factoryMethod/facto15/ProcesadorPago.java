package com.factoryMethod.facto15;

public abstract class ProcesadorPago {

    private DatosPago datospago;

    public ProcesadorPago(DatosPago datospago) {
        this.datospago = datospago;
    }

    public void procesar(DatosPago datosPago){
        if(datosPago.getIdentificador() == null
        || datosPago.getCliente() == null || datosPago.getMoneda() == null
        || datosPago.getMonto() <= 0 || datosPago.getReferencia() == null){
            throw new IllegalArgumentException("Los datos tienes errores");
        }



    }

    abstract void validar(DatosPago datosPago);


}
