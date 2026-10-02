package com.factoryMethod.facto10;

public class CreadorMago implements CreadorPersonaje<Integer>{
    @Override
    public Personaje creadorPersonaje(String nombre, Rango rango, Integer atributopersonaje, String arma, Habilidad habilidad) {
        return new Mago(nombre, rango.getVida(), rango.getDano(), atributopersonaje, arma, habilidad);
    }
}
