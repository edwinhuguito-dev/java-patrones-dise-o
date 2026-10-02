package com.factoryMethod.facto10;

public class MainWar {
    public static void main(String[] args){

        CreadorPersonaje<Integer> obj1 = new CreadorGuerrero();
        CreadorPersonaje<Integer> obj2 = new CreadorArquero();
        CreadorPersonaje<Integer> obj3 = new CreadorMago();

        System.out.println("*****************************************+");

        Habilidad habilidad1 = new GolpePoderoso();
        Habilidad habilidad2 = new DisparoPreciso();
        Habilidad habilidad3 = new BolaElemental();
        System.out.println("*****************************************+");

        Personaje guerrero1 = obj1.creadorPersonaje("Huguito", Rango.NOVATO, 30, "Mazo de Thor", habilidad1);
        Personaje arquero1 = obj2.creadorPersonaje("Robin", Rango.NOVATO, 35, "Arco ancestral", habilidad2);
        Personaje mago1 = obj3.creadorPersonaje("Merlin2", Rango.NOVATO, 34, "Guantes divinos", habilidad3);

        System.out.println("*****************************************+");
        guerrero1.mostrarInfo();
        mago1.mostrarInfo();
        arquero1.mostrarInfo();

        System.out.println("*****************************************+");

        guerrero1.atacar(mago1);
        mago1.atacar(arquero1);
        arquero1.atacar(guerrero1);

        System.out.println("*****************************************+");

        guerrero1.mostrarInfo();
        mago1.mostrarInfo();
        arquero1.mostrarInfo();

        System.out.println("*****************************************+");

        guerrero1.usarHabilidad(mago1);
        mago1.usarHabilidad(arquero1);
        arquero1.usarHabilidad(guerrero1);

        System.out.println("*****************************************+");

        guerrero1.mostrarInfo();
        mago1.mostrarInfo();
        arquero1.mostrarInfo();





    }
}
