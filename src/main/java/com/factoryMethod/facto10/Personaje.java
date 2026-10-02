package com.factoryMethod.facto10;

public interface Personaje {
    void atacar(Personaje objetivo);
    void recibirDano(int dano);
    void usarHabilidad(Personaje objetivo);
    void mostrarInfo();

}
