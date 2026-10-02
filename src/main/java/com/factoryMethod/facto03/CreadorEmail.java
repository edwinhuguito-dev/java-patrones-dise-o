package com.factoryMethod.facto03;

public class CreadorEmail implements CreadorNotificacion{
    @Override
    public Notificacion crearNotificacion() {
        return new Email();
    }
}
