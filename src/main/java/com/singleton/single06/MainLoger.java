package com.singleton.single06;

public class MainLoger {
    public static void main(String[] args){



        Logger login1 = Logger.getInstance();



        login1.registrarUsuario("Huguito", "123456");

        login1.iniciarSesion("Huguito", "123456");

        login1.logout();

        login1.iniciarSesion("uguito", "123456");


    }
}
