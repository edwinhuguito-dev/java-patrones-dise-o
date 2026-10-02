package com.factoryMethod.facto05;

public class Mago implements Personaje{

     private String nombre;
     private int vida;
     private String arma;

    public Mago(String nombre, int vida, String arma) {
        this.nombre = nombre;
        this.vida = vida;
        this.arma = arma;
    }

    @Override
    public void atacar() {
        System.out.println("Gandalf lanza bola de fuego");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Atributos de Mago " + nombre + " | " + vida + " | " + arma);
    }
}
