package com.factoryMethod.facto09;

public class Arquero implements Personaje{

    private String nombre;
    private int vida;
    private int dano;
    private int precision;
    private String tipoFlecha;

    public Arquero(String nombre, int vida, int dano, int precision, String tipoFlecha) {
        this.nombre = nombre;
        this.vida = vida;
        this.dano = dano;
        this.precision = precision;
        this.tipoFlecha = tipoFlecha;
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
        System.out.println("Arquero{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", dano=" + dano +
                ", precision=" + precision +
                ", tipoFlecha='" + tipoFlecha + '\'' +
                '}');
    }


}
