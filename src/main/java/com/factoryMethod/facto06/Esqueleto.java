package com.factoryMethod.facto06;

public class Esqueleto implements Enemigo{

    private String nombre;
    private int vida;
    private int dano;
    private String tipoArma;

    public Esqueleto(String nombre, int vida, int dano, String tipoArma) {
        this.nombre = nombre;
        this.vida = vida;
        this.dano = dano;
        this.tipoArma = tipoArma;
    }

    @Override
    public void atacar(Enemigo objetivo) {
        this.dano += dano * 50 / 100;
        objetivo.recibirDano(this.dano);


    }

    @Override
    public void recibirDano(int dano) {
        vida -= dano;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Esqueleto{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", dano=" + dano +
                ", tipoArma=" + tipoArma +
                '}');
    }



}
