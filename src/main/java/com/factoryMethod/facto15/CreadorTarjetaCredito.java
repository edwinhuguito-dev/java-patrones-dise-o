package com.factoryMethod.facto15;

public class CreadorTarjetaCredito extends Creador{
    @Override
    protected ProcesadorPago crear(DatosPago datosPago) {
        return new TarjetaCredito(datosPago);
    }
}
