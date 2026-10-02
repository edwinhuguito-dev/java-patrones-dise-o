package com.factoryMethod.facto07;

public class CreadorArco implements CreadorArma<Integer>{
    @Override
    public Arma creadorArma(String nombre, Nivel nivel, Integer atributoEspecial) {
        return new Arco(nombre, nivel.getDano(), atributoEspecial);
    }
}
