package com.factoryMethod.facto12;

public interface DocumentoFiscal {

    void validar(Factura factura);
    DocumentoGenerado generar(Factura factura);
    String obtenerTipoContenido();

}
