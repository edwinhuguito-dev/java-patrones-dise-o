package com.factoryMethod.facto08;

public interface CreadorVehiculo<T> {
    Vehiculo creadorVehiculo(String nombre, Categoria categoria, T atributoEspecial);
}
