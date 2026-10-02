package com.factoryMethod.facto15;

public class DatosPago {


    private Identificador identificador;
    private String cliente;
    private double monto;
    private String moneda;
    private String referencia;

    public DatosPago(Identificador identificador, String cliente, double monto, String moneda, String referencia) {
        this.identificador = identificador;
        this.cliente = cliente;
        this.monto = monto;
        this.moneda = moneda;
        this.referencia = referencia;
    }


    public Identificador getIdentificador() {
        return identificador;
    }

    public String getCliente() {
        return cliente;
    }

    public double getMonto() {
        return monto;
    }

    public String getMoneda() {
        return moneda;
    }

    public String getReferencia() {
        return referencia;
    }

    public void mostrarDatos(){}
}
