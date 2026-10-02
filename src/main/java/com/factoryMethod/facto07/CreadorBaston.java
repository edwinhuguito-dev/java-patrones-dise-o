package com.factoryMethod.facto07;

public class CreadorBaston implements CreadorArma<String>{
    @Override
    public Arma creadorArma(String nombre, Nivel nivel, String atributoEspecial) {
        return new Baston(nombre, nivel.getDano(), atributoEspecial);
    }
}
