package com.factoryMethod.facto05;

public class Guerrero implements Personaje{

    private String nombre;
    private int vida;
    private String arma;


    public Guerrero(String nombre, int vida, String arma) {
        this.nombre = nombre;
        this.vida = vida;
        this.arma = arma;
    }

    @Override
    public void atacar() {
        System.out.println("Kratos ataca con espada");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Atributos de Guerrero " + nombre + " | " + vida + " | " + arma);
    }
}
