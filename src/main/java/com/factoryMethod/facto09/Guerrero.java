package com.factoryMethod.facto09;

public class Guerrero implements Personaje{

    private String nombre;
    private int vida;
    private int dano;
    private int fuerza;
    private String arma;

    public Guerrero(String nombre, int vida, int dano, int fuerza, String arma) {

        this.nombre = nombre;
        this.vida = vida;
        this.dano = dano;
        this.fuerza = fuerza;
        this.arma = arma;
    }

    @Override
    public void atacar(Personaje objetivo) {
        objetivo.recibirDano(dano);
    }

    @Override
    public void recibirDano(int dano) {
        vida -= dano;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Guerrero{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", dano=" + dano +
                ", fuerza=" + fuerza +
                ", arma='" + arma + '\'' +
                '}');
    }


}
