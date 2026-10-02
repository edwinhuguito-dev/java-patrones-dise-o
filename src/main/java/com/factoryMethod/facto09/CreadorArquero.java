package com.factoryMethod.facto09;

public class CreadorArquero implements CreadorPersonaje<Integer>{
    @Override
    public Personaje crearPersonaje(String nombre, Rango rango, Integer atributoEspecial, String equipamento) {

        int danoTotal = rango.getDanoBase() + ( atributoEspecial / 5);

        return new Arquero(nombre, rango.getVida(), danoTotal, atributoEspecial, equipamento);
    }
}
