package com.factoryMethod.facto10;

public class Arquero implements Personaje{

    private String nombre;
    private int vida;
    private int dano;
    private int precision;
    private String tipoFlecha;
    private Habilidad habilidad; //dañoBase + mana/2

    public Arquero(String nombre, int vida, int dano, int precision, String tipoFlecha, Habilidad habilidad) {
        this.nombre = nombre;
        this.vida = vida;
        this.dano = dano;
        this.precision = precision;
        this.tipoFlecha = tipoFlecha;
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
        System.out.println("Arquero{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", dano=" + dano +
                ", precision=" + precision +
                ", tipoFlecha='" + tipoFlecha + '\'' +
                ", habilidad=" + habilidad.getNombre() +
                '}');
    }

    public int getDano() {
        return dano;
    }

    public int getPrecision() {
        return precision;
    }
}
