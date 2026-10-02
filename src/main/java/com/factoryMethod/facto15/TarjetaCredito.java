package com.factoryMethod.facto15;

public class TarjetaCredito extends ProcesadorPago{
    public TarjetaCredito(DatosPago datospago) {
        super(datospago);
    }

    @Override
    void validar(DatosPago datosPago) {
        if(datosPago.getIdentificador() != Identificador.TARJETA_CREDITO){
            throw new IllegalArgumentException("Verificar los datos");
        }
    }


}
