package com.factoryMethod.facto13;

public class MainPlantilla {
    public static void main(String[] args){

        Plantilla plantilla = new Plantilla("Huguito SAC", "Las Sirenitas VIP", 300.56);
        DocumentoCreador creado  = new CreadorBoleta();
        creado.emitir(plantilla);


    }
}
