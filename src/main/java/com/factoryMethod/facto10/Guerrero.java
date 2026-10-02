package com.factoryMethod.facto10;

public class Guerrero implements Personaje{

    private String nombre;
    private int vida;
    private int dano;
    private int fuerza;
    private String arma;
    private Habilidad habilidad;  // daño es dañoBase + fuerza

    public Guerrero(String nombre, int vida, int dano, int fuerza, String arma, Habilidad habilidad) {
        this.nombre = nombre;
        this.vida = vida;
        this.dano = dano;
        this.fuerza = fuerza;
        this.arma = arma;
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
        habilidad.usar(this,objetivo);

    }

    @Override
    public void mostrarInfo() {
        System.out.println("Guerrero{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", dano=" + dano +
                ", fuerza= " + fuerza +
                ", arma='" + arma + '\'' +
                ", habilidad= " + habilidad.getNombre() +
                '}');
    }

    public int getDano() {
        return dano;
    }

    public int getFuerza() {
        return fuerza;
    }
}
