package com.factoryMethod.facto15;

public class MainPagos {
    public static void main(String[] args){

        DatosPago pagar = new DatosPago(Identificador.TARJETA_CREDITO, "Huguito", 350.03, "PEN", "Por una hora de servicia en las sirenitas VIP");

        Creador crear = new CreadorTarjetaCredito();



        crear.enviar(pagar);


    }
}
