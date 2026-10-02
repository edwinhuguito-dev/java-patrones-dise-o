package com.factoryMethod.facto09;

public class Mago implements Personaje{


    private String nombre;
    private int vida;
    private int dano;
    private int mana;
    private String elemento;

    public Mago(String nombre, int vida, int dano, int mana, String elemento) {
        this.nombre = nombre;
        this.vida = vida;
        this.dano = dano;
        this.mana = mana;
        this.elemento = elemento;
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
        System.out.println("Mago{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", dano=" + dano +
                ", mana=" + mana +
                ", elemento='" + elemento + '\'' +
                '}');
    }


}
