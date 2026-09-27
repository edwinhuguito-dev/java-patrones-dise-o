package com.singleton.single03;

public class MainConexionDB {
    public static void main(String[] args){


        ConexionDB conexion1 = ConexionDB.getInstancia();
        conexion1.setServidor("localhost");
        conexion1.setBaseDatos("tienda");
        conexion1.setUsuario("admin");


        ConexionDB conexion2 = ConexionDB.getInstancia();


        System.out.println(conexion2.getServidor() + " | " + conexion2.getBaseDatos() + " | " + conexion2.getUsuario());


        boolean igual = (conexion1 == conexion2);
        System.out.println(igual);




    }



}
