package com.factoryMethod.facto09;

public class MainHeros {
    public static void main(String[] args){

        CreadorPersonaje<Integer> obj1 = new CreadorGuerrero();
        Personaje guerrero1 = obj1.crearPersonaje("Huguito", Rango.NOVATO, 40, "mazo de Thor");
        System.out.println("");

        CreadorPersonaje<Integer> obj2 = new CreadorArquero();
        Personaje arquero1 = obj2.crearPersonaje("Robin", Rango.NOVATO, 50, "Flechas divinas");
        System.out.println("");

        CreadorPersonaje<Integer> obj3 = new CreadorMago();
        Personaje mago1 = obj3.crearPersonaje("Merlin", Rango.NOVATO, 80, "guantes magicos");
        System.out.println("==============================================");

        guerrero1.atacar(mago1);
        mago1.atacar(arquero1);
        arquero1.atacar(guerrero1);

        System.out.println("==============================================");

        guerrero1.mostrarInfo();
        mago1.mostrarInfo();
        arquero1.mostrarInfo();








    }
}
