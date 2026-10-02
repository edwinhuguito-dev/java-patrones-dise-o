package com.factoryMethod.facto11;

public class FacturaChile implements DocumentoFiscal{
    @Override
    public void validar(Factura factura) {
        if(factura == null
                || factura.getEmisor() == null || factura.getEmisor().isBlank()
                || factura.getCliente() == null || factura.getCliente().isBlank()
                || factura.getMonto() < 0){
            throw new IllegalArgumentException("La factura chilene datos invalidos");
        }
    }

    @Override
    public String generar(Factura factura) {
        validar(factura);
        return "Factura de chile: emosor=" + factura.getEmisor()
                + ", cliente=" + factura.getCliente()
                + ", monto=" + factura.getMonto();
    }

    @Override
    public String obtenerTipoContenido() {
        return "text/plain";
    }
}
