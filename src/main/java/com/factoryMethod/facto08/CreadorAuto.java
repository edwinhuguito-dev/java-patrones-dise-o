package com.factoryMethod.facto08;

public class CreadorAuto implements CreadorVehiculo<String>{
    @Override
    public Vehiculo creadorVehiculo(String nombre, Categoria categoria, String atributoEspecial) {
        return new Auto(nombre, categoria.getVelocidad(), atributoEspecial);
    }
}
