package com.singleton.single07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GamerManager2 {

    private static GamerManager2 instancia;
    private final Map<String, Integer> agregarPuntos = new HashMap<>();
    private final List<String> eventos = new ArrayList<>();
    private boolean estadoPartida = false;

    private GamerManager2(){

    }

    public static GamerManager2 getInstancia(){
        if(instancia == null){
            instancia = new GamerManager2();
        }
        return instancia;
    }

    private void registrarAviso(String aviso){
        System.out.println(aviso);
        eventos.add(aviso);
    }

    public void registrarUsuario(String nombre){
        if(nombre == null || nombre.isBlank()){
            registrarAviso("[INFO] El nombre no puede estar vacio");
            return;
        }

        if(agregarPuntos.containsKey(nombre)){
            registrarAviso("[INFO] Usuario ya registrado");
        }

        agregarPuntos.put(nombre, 0);
        registrarAviso("[INFO] Usuario registrado correctamente");
    }

    public boolean inicarPartida(){
        if(estadoPartida){
            registrarAviso("[WARNING] La partida ya tiene una sesion iniciada");
            return true;
        }
        estadoPartida = true;
        registrarAviso("[INFO] Partida inciada correctamente");
        return true;
    }

    public void sumaPuntos(String nombre, Integer punto){
        if(!estadoPartida){
            registrarAviso("[WARNING] Inicie una partida primero para agregar puntos");
            return;
        }

        if(nombre == null || nombre.isBlank()){
            registrarAviso("[INFO] El nombre no puede estar vacio");
            return;
        }

        if(punto == null || punto <= 0){
            registrarAviso("[INFO] Los puntos no pueden estar vacio");
            return;
        }

        if(!agregarPuntos.containsKey(nombre)){
            registrarAviso("[INFO] El usuario no esta registrado, registrar primero");
            return;
        }

        int puntosTotal = agregarPuntos.get(nombre) + punto;
        agregarPuntos.put(nombre, puntosTotal);
        registrarAviso("[INFO] Se agrego: " + punto + " puntos, total " + puntosTotal + " puntos al jugador: " + nombre);

    }

    public void terminarPartida(){
        if(estadoPartida){
            estadoPartida = false;
            registrarAviso("[INTO] Sesion de partida cerrada");
            return;
        }
        registrarAviso("[WARNING] Sesion ya esta cerrada");
    }

    public void mostrarInfo(){
        for(String evento : eventos){
            System.out.println(evento);
        }
    }

    public void mostrarPuntaje(){
        for(Map.Entry<String, Integer> entry : agregarPuntos.entrySet()){
            System.out.println(entry.getKey() + " || " + entry.getValue());
        }
    }
}
