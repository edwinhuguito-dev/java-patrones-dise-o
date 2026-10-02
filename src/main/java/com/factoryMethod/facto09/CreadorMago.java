package com.factoryMethod.facto09;

public class CreadorMago implements CreadorPersonaje<Integer>{
    @Override
    public Personaje crearPersonaje(String nombre, Rango rango, Integer atributoEspecial, String equipamento) {

        int danoTotal = rango.getDanoBase() + (atributoEspecial / 4);

        return new Mago(nombre, rango.getVida(), danoTotal, atributoEspecial, equipamento);
    }
}
