package com.factoryMethod.facto06;

public class Dragon implements Enemigo{

    private String nombre;
    private int vida;
    private int dano;
    private String elemento;

    public Dragon(String nombre, int vida, int dano, String  elemento) {
        this.nombre = nombre;
        this.vida = vida;
        this.dano = dano;
        this.elemento = elemento;
    }

    @Override
    public void atacar(Enemigo objetivo) {
        vida += dano/5;
        objetivo.recibirDano(this.dano);

    }

    @Override
    public void recibirDano(int dano) {
        vida -= dano;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Dragon{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", dano=" + dano +
                ", elemento=" + elemento +
                '}');
    }



}
