package com.factoryMethod.facto07;

public class Arco implements Arma{

    private String nombre;
    private int dano;
    private int alcance;

    public Arco(String nombre, int dano, int alcance) {
        this.nombre = nombre;
        this.dano = dano;
        this.alcance = alcance;
    }

    @Override
    public void usar() {
        System.out.println("El arco ataca a distancia");
    }

    @Override
    public void monstrarInfo() {
        System.out.println("Arco{" +
                "nombre='" + nombre + '\'' +
                ", dano=" + dano +
                ", alcance=" + alcance +
                '}');
    }



}
