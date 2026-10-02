package com.factoryMethod.facto07;

public interface CreadorArma<T> {

     Arma creadorArma(String nombre, Nivel nivel, T atributoEspecial);
}
