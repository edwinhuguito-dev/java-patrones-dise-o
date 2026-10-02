package com.factoryMethod.facto08;

public class MainVehiculo {
    public static void main(String[] args){

        CreadorVehiculo<String> obje1 = new CreadorAuto();
        Vehiculo auto1 = obje1.creadorVehiculo("Totota", Categoria.TRABAJO, "Gasolina 90");
        auto1.conducir();
        auto1.mostrarInfo();

        System.out.println("******************************************+");

        CreadorVehiculo<Integer> obje2 = new CreadorCamion();
        Vehiculo camion1 = obje2.creadorVehiculo("Caterpilla", Categoria.URBANO, 5);
        camion1.conducir();
        camion1.mostrarInfo();

        System.out.println("******************************************+");

        CreadorVehiculo<Integer> obje3 = new CreadorMoto();
        Vehiculo moto1 = obje3.creadorVehiculo("Zusuki", Categoria.DEPORTIVO, 600);
        moto1.conducir();
        moto1.mostrarInfo();


    }
}
