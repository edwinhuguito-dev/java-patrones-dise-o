package com.factoryMethod.facto11;

public abstract class ServicioFacturacion {
    protected abstract DocumentoFiscal creardocumentoFiscal();

    public String emitir(Factura factura){
        DocumentoFiscal documento = creardocumentoFiscal();
        documento.validar(factura);
        return documento.generar(factura);
    }
}
