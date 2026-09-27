package com.singleton.single02;

public class MainJuego {


    public static void main(String[] args){
        ConfiguracionJuego config1 = ConfiguracionJuego.getInstancia();

        ConfiguracionJuego config2 = ConfiguracionJuego.getInstancia();

        config1.setVolumen(80);



        boolean igualar;

        igualar = (config1 == config2);


        System.out.println(config2.getVolumen() + " || " + igualar);


    }



}
