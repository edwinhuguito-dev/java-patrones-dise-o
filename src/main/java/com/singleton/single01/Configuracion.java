package com.singleton.single01;

public class Configuracion {

    private static Configuracion instancia;

    private Configuracion(){

    }

    public static Configuracion getInstancia(){
        if(instancia == null){
            instancia = new Configuracion();
        }
        return instancia;
    }

}
