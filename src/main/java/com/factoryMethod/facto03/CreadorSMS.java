package com.factoryMethod.facto03;

public class CreadorSMS implements CreadorNotificacion{
    @Override
    public Notificacion crearNotificacion() {
        return new SMS();
    }
}
