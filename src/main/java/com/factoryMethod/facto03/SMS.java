package com.factoryMethod.facto03;

public class SMS implements Notificacion{
    @Override
    public void enviar() {
        System.out.println("Enviando SMS");
    }
}
