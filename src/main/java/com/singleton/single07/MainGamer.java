package com.singleton.single07;

public class MainGamer {
    public static void main(String[] args){

       GamerManager2 player = GamerManager2.getInstancia();
       GamerManager2 player2 = GamerManager2.getInstancia();

       player.registrarUsuario("Huguito");
       player.registrarUsuario("Pedro");

       System.out.println("=================================================");

       player.registrarUsuario("Huguito");

       player.sumaPuntos("Pedro", 50);
        System.out.println("=================================================");

        player.inicarPartida();

        player.sumaPuntos("Huguito", 100);
        player.sumaPuntos("Pedro", 50);

        System.out.println("=================================================");

        player.inicarPartida();

        player.sumaPuntos("Juan", 50);

        System.out.println("=================================================");

        player.terminarPartida();



    }
}
