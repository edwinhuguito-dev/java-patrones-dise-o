package com.factoryMethod.facto10;

public class DisparoPreciso implements Habilidad{
    @Override
    public void usar(Personaje usuario, Personaje objetivo) {
        Arquero arquero  = (Arquero)usuario;
        int danofinal = arquero.getDano() + (arquero.getPrecision()/2);

        objetivo.recibirDano(danofinal);

    }

    @Override
    public String getNombre() {
        return "Disparo rapido";
    }
}
