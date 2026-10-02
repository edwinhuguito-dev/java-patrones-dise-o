package com.factoryMethod.facto14;

public class Plantilla {

    private String vendedor;
    private String cliente;
    private TipoDocumento tipoDocumento;
    private double monto;
    private String detalles;

    public Plantilla(String vendedor, String cliente, TipoDocumento tipoDocumento, double monto, String detalles) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.tipoDocumento = tipoDocumento;
        this.monto = monto;
        this.detalles = detalles;
    }

    public String getVendedor() {
        return vendedor;
    }

    public String getCliente() {
        return cliente;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public double getMonto() {
        return monto;
    }

    public String getDetalles() {
        return detalles;
    }
}
