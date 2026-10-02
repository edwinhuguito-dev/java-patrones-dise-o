package com.factoryMethod.facto07;

public class Baston implements Arma{

    private String nombre;
    private int dano;
    private String elemento;

    public Baston(String nombre, int dano, String elemento) {
        this.nombre = nombre;
        this.dano = dano;
        this.elemento = elemento;
    }

    @Override
    public void usar() {
        System.out.println("El baston se usa para golpear");
    }

    @Override
    public void monstrarInfo() {
        System.out.println("Baston{" +
                "nombre='" + nombre + '\'' +
                ", dano=" + dano +
                ", elemento='" + elemento + '\'' +
                '}');
    }


}
