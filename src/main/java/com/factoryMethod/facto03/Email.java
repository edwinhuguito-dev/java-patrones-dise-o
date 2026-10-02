package com.factoryMethod.facto03;

public class Email implements Notificacion{
    @Override
    public void enviar() {
        System.out.println("Enviando Email");
    }
}
