package com.factoryMethod.facto08;

public class Auto implements Vehiculo{

    private String nombre;
    private int velocidad;
    private String combustible;

    public Auto(String nombre, int velocidad, String combustible) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.combustible = combustible;
    }

    @Override
    public void conducir() {
        System.out.println("El carro usa "+ combustible + " octanos");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Auto{" +
                "nombre='" + nombre + '\'' +
                ", velocidad=" + velocidad +
                ", combustible='" + combustible + '\'' + " octanos " +
                '}');
    }


}
