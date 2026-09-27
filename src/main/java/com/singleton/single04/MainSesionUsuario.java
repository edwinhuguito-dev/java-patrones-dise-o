package com.singleton.single04;

public class MainSesionUsuario {
    public static void main(String[] args){
        SesionUsuario sesion1 = SesionUsuario.getInstancia();
        sesion1.iniciarSesion("Huguito", "ADMIN");


        SesionUsuario sesion2 = SesionUsuario.getInstancia();
        System.out.println(sesion2.toString());
        System.out.println("==================================");
        sesion2.cerrarSesion();
        System.out.println("==================================");
        System.out.println(sesion1.toString());

        boolean igual = sesion1 == sesion2;

        System.out.println(igual);

    }
}
