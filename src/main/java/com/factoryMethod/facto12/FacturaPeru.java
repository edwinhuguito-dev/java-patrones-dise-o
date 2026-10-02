package com.factoryMethod.facto12;

import java.util.UUID;

public class FacturaPeru implements DocumentoFiscal{
    @Override
    public void validar(Factura factura) {
        if(factura == null
                || factura.getEmisor() == null || factura.getEmisor().isBlank()
                || factura.getCliente() == null || factura.getCliente().isBlank()
                || factura.getMonto() == null || factura.getMonto().signum() <= 0){
            throw new IllegalArgumentException("Datos invalidos para la factura Peru");
        }
    }

    @Override
    public DocumentoGenerado generar(Factura factura) {
        validar(factura);

        String contenido = """
                FACTURA PERU
                Emisor: %s
                Cliente: %s
                Monto: %s
                """.formatted(
                factura.getEmisor(),
                factura.getCliente(),
                factura.getMonto()
        );


        return new DocumentoGenerado(UUID.randomUUID().toString(), "PE", obtenerTipoContenido(), contenido
        );
    }

    @Override
    public String obtenerTipoContenido() {
        return "text/plain";
    }
}
