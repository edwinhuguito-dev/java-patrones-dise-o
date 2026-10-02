package com.factoryMethod.facto08;

public class CreadorMoto implements CreadorVehiculo<Integer>{
    @Override
    public Vehiculo creadorVehiculo(String nombre, Categoria categoria, Integer atributoEspecial) {
        return new Moto(nombre, categoria.getVelocidad(), atributoEspecial);
    }
}
