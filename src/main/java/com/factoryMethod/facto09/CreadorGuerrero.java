package com.factoryMethod.facto09;

public class CreadorGuerrero implements CreadorPersonaje<Integer>{


    @Override
    public Personaje crearPersonaje(String nombre, Rango rango, Integer atributoEspecial, String equipamento) {

        int danoTotal = rango.getDanoBase() + (atributoEspecial / 2);

        return new Guerrero(nombre, rango.getVida(), danoTotal, atributoEspecial, equipamento);
    }
}
