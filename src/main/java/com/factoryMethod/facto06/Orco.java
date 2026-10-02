package com.factoryMethod.facto06;

public class Orco implements Enemigo{

    private String nombre;
    private int vida;
    private int dano;
    private int fuerza;

    public Orco(String nombre, int vida, int dano, int fuerza) {
        this.nombre = nombre;
        this.vida = vida;
        this.dano = dano;
        this.fuerza = fuerza;
    }

    @Override
    public void atacar(Enemigo objetivo) {
        objetivo.recibirDano(this.dano);
    }

    @Override
    public void recibirDano(int dano) {
        vida -= dano - (fuerza / 10);


    }

    @Override
    public void mostrarInfo() {
        System.out.println("Orco{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", dano=" + dano +
                ", fuerza=" + fuerza +
                '}');
    }



}
