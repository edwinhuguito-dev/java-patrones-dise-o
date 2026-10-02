package com.factoryMethod.facto11;

public class MainFactura {
    public static void main(String[] args){

        Factura factura = new Factura("Empresa A", "Huguito SAC", 50000.50);

        ServicioFacturacion servicio = new ServicioFacturacionPeru();
        String documentoGenerado = servicio.emitir(factura);

        System.out.println(documentoGenerado);

    }
}
