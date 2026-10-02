package com.factoryMethod.facto05;

public class MainPerso {
    public static void main(String[] args){

        CreadorPersonaje perso = new CreadorGuerrero();
        Personaje per = perso.crearPersonaje();
        per.atacar();
        per.mostrarInfo();

        System.out.println("****************************");

        CreadorPersonaje perso1 = new CreadorMago();
        Personaje per1 = perso1.crearPersonaje();
        per1.atacar();
        per1.mostrarInfo();


    }
}
