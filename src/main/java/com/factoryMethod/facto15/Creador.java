package com.factoryMethod.facto15;

public abstract class Creador {

    protected abstract ProcesadorPago crear(DatosPago datosPago);

    public ProcesadorPago enviar(DatosPago datosPago){
        ProcesadorPago pago = crear(datosPago);
        pago.procesar(datosPago);
        pago.validar(datosPago);
        return pago;
    }



}
