package com.factoryMethod.facto07;

public class CreadorEspada implements CreadorArma<String>{


    @Override
    public Arma creadorArma(String nombre, Nivel nivel, String atributoEspecial) {
        return new Espada(nombre, nivel.getDano(), atributoEspecial);
    }
}
