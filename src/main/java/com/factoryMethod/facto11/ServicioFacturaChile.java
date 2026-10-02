package com.factoryMethod.facto11;

public class ServicioFacturaChile extends ServicioFacturacion{
    @Override
    protected DocumentoFiscal creardocumentoFiscal() {
        return new FacturaChile();
    }
}
