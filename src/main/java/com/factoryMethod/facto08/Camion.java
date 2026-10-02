package com.factoryMethod.facto08;

public class Camion implements Vehiculo{

    private String nombre;
    private int velocidad;
    private int capacidadCarga;

    public Camion(String nombre, int velocidad, int capacidadCarga) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void conducir() {
        System.out.println("El camion tiene una capacidad de carga de " + capacidadCarga + " kg");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Camion{" +
                "nombre='" + nombre + '\'' +
                ", velocidad=" + velocidad +
                ", capacidadCarga=" + capacidadCarga + " kg" +
                '}');
    }


}
