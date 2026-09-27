package com.singleton.single02;

import com.singleton.single01.Configuracion;

public class ConfiguracionJuego {

    private static ConfiguracionJuego instancia;
    private int volumen;
    private String dificultad;

    private ConfiguracionJuego(){

    }

    public static ConfiguracionJuego getInstancia() {
        if(instancia == null){
            instancia = new ConfiguracionJuego();
        }
        return instancia;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }
}
