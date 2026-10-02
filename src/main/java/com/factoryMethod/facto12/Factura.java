package com.factoryMethod.facto12;

import java.math.BigDecimal;

public class Factura {

    private final String emisor;
    private final String cliente;
    private final BigDecimal monto;

    public Factura(String emisor, String cliente, BigDecimal monto) {
        this.emisor = emisor;
        this.cliente = cliente;
        this.monto = monto;
    }

    public String getEmisor() {
        return emisor;
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getMonto() {
        return monto;
    }
}
