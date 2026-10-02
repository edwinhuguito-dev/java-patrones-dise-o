package com.factoryMethod.facto04;

public class MainPersonaje {
    public static void main(String[] args){

        CreadorPersonaje perso = new CreadorGuerrero();
        Personaje per = perso.crearPersonaje();
        per.atacar();



        CreadorPersonaje perso1 = new CreadorMago();
        Personaje per1 = perso1.crearPersonaje();
        per1.atacar();

    }
}
