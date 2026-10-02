package com.factoryMethod.facto12;

public abstract class ServicioFacturacion {

    protected abstract DocumentoFiscal crearDocumentoFiscal();

    public DocumentoGenerado emiti(Factura factura){
        DocumentoFiscal documento = crearDocumentoFiscal();
        documento.validar(factura);
        return documento.generar(factura);
    }

}
