package com.singleton;


public class ConexionDBSingleton {

    private static ConexionDBSingleton instancia;

    private ConexionDBSingleton(){

        System.out.println("Conectandose a algun motor de DB");
    }

    public static ConexionDBSingleton getInstance(){
        if(instancia == null){
            instancia = new ConexionDBSingleton();
        }

        return instancia;
    }

}
