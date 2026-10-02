package com.factoryMethod.facto08;

import jdk.swing.interop.SwingInterOpUtils;

public class Moto implements Vehiculo{

    private String nombre;
    private int velocidad;
    private int cilindrada;

    public Moto(String nombre, int velocidad, int cilindrada) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    @Override
    public void conducir() {
        System.out.println("La moto va a una velocidad de " + velocidad + " Km/H");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Moto{" +
                "nombre='" + nombre + '\'' +
                ", velocidad=" + velocidad + " Km/H "+
                ", cilindrada=" + cilindrada +
                '}');
    }


}
