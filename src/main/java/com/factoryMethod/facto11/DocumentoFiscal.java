package com.factoryMethod.facto11;

public interface DocumentoFiscal {
    void validar(Factura factura);
    String generar(Factura factura);
    String obtenerTipoContenido();
}
