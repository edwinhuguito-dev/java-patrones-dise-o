package com.factoryMethod.facto10;

public class GolpePoderoso implements Habilidad{
    @Override
    public void usar(Personaje usuario, Personaje objetivo) {

        Guerrero guerrero = (Guerrero) usuario;

        int danofinal = guerrero.getDano() + (guerrero.getFuerza() / 2);
        objetivo.recibirDano(danofinal);

    }

    @Override
    public String getNombre() {
        return "Golpe poderoso";
    }
}
