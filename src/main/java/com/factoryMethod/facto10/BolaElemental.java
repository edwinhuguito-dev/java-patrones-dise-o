package com.factoryMethod.facto10;

public class BolaElemental implements Habilidad{
    @Override
    public void usar(Personaje usuario, Personaje objetivo) {

        Mago mago = (Mago) usuario;
        int danofinal = mago.getDano() + (mago.getMana()/2);

        objetivo.recibirDano(danofinal);
    }

    @Override
    public String getNombre() {
        return "Bola de fuego";
    }
}
