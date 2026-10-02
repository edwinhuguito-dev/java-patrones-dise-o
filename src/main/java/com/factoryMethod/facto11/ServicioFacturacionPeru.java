package com.factoryMethod.facto11;

public class ServicioFacturacionPeru extends ServicioFacturacion{
    @Override
    protected DocumentoFiscal creardocumentoFiscal() {
        return new FacturaPeru();
    }
}
