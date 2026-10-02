package com.factoryMethod.facto08;

public class CreadorCamion implements CreadorVehiculo<Integer>{
    @Override
    public Vehiculo creadorVehiculo(String nombre, Categoria categoria, Integer atributoEspecial) {
        int capacidadKG = atributoEspecial * 1000;

        return new Camion(nombre, categoria.getVelocidad(), capacidadKG);
    }
}
