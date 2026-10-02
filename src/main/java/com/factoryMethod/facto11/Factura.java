package com.factoryMethod.facto11;

public class Factura {

    private final String emisor;
    private final String cliente;
    private final double monto;

    public Factura(String emisor, String cliente, double monto) {
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

    public double getMonto() {
        return monto;
    }
}
