package com.factoryMethod.facto10;

public class Mago implements Personaje{

    private String nombre;
    private int vida;
    private int dano;
    private int mana;
    private String elemento;
    private Habilidad habilidad; // dañoBase + mana /2

    public Mago(String nombre, int vida, int dano, int mana, String elemento, Habilidad habilidad) {
    this.nombre = nombre;
    this.vida = vida;
    this.dano = dano;
    this.mana = mana;
    this.elemento = elemento;
    this.habilidad = habilidad;
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
    public void usarHabilidad(Personaje objetivo) {
        habilidad.usar(this, objetivo);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Mago{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", dano=" + dano +
                ", mana=" + mana +
                ", elemento='" + elemento + '\'' +
                ", habilidad=" + habilidad.getNombre() +
                '}');
    }

    public int getDano() {
        return dano;
    }

    public int getMana() {
        return mana;
    }
}
