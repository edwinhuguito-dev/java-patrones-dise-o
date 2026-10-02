package com.factoryMethod.facto03;

public class MainNotificacion {
    public static void main(String[] args){

        CreadorNotificacion noti = new CreadorEmail();
        Notificacion fica = noti.crearNotificacion();
        fica.enviar();

    }
}
