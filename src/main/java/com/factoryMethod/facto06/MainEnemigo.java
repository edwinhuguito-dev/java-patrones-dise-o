package com.factoryMethod.facto06;

public class MainEnemigo {
    public static void main(String[] args){

       CreadorEnemigo<String> enemy1 = new CreadorDragon();
       Enemigo dragon1 = enemy1.crearEnemigo("Huguito", Dificultad.FACIL, "Aliento acido");

       CreadorEnemigo<Integer> enemy2 = new CreadorOrco();
       Enemigo orco1 = enemy2.crearEnemigo("Cholomon", Dificultad.NORMAL, 80);

       CreadorEnemigo<String> enemy3 = new CreadorEsqueleto();
       Enemigo esqueleto1 = enemy3.crearEnemigo("Putin", Dificultad.DIFICIL, "espada de fuego");









    }
}
