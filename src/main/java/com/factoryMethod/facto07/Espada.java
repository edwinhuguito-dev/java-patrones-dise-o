package com.factoryMethod.facto07;

public class Espada implements Arma{

    private String nombre;
    private int dano;
    private String tipoAcero;

    public Espada(String nombre, int dano, String tipoAcero) {
        this.nombre = nombre;
        this.dano = dano;
        this.tipoAcero = tipoAcero;
    }

    @Override
    public void usar() {
        System.out.println("La espada te da un gran poder");
    }

    @Override
    public void monstrarInfo() {
        System.out.println("Espada{" +
                "nombre='" + nombre + '\'' +
                ", dano=" + dano +
                ", tipoAcero='" + tipoAcero + '\'' +
                '}');
    }
}
