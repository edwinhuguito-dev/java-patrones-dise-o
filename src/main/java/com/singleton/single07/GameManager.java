package com.singleton.single07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameManager {

    private static GameManager instancia;
    private Map<String, Integer> agregarPuntos = new HashMap<>();
    private List<String> eventos = new ArrayList<>();
    private boolean estadoPartida = false;


    private GameManager() {

    }


    public static GameManager getInstancs() {
        if (instancia == null) {
            instancia = new GameManager();
        }
        return instancia;
    }

    private void setter(String aviso) {
        eventos.add(aviso);
    }

    public void registrarUsuario(String nombre){
        int puntos = 0;
        String aviso = "";
        if(nombre == null || nombre.isBlank()){
            aviso = "[INFO] El nombre no puede estar vacio";
            System.out.println(aviso);
            setter(aviso);
            return;
        }

            if(agregarPuntos.containsKey(nombre)){
                aviso = "[INFO] Usuario ya esta registrado";
                System.out.println(aviso);
                setter(aviso);
                return;
            }



        agregarPuntos.put(nombre, puntos);
        aviso = "[INFO] Usuario registrado correctamente";
        System.out.println(aviso);
        setter(aviso);

    }

    public boolean iniciarPartida(){
        String aviso = "";
        if(estadoPartida){
           aviso = "[WARNING] La partida ya tiene una sesion iniciada";
           System.out.println(aviso);
           setter(aviso);
           return true;
        }
        estadoPartida = true;
        aviso = "[INFO] Partida iniciada correctamente";
        System.out.println(aviso);
        setter(aviso);
        return true;
    }

    public void sumaPuntos(String nombre, Integer punto){
        String aviso = "";
        if(estadoPartida) {
            if (nombre == null || nombre.isBlank()) {
                aviso = "[INFO] El nombre no puede estar vacio";
                System.out.println(aviso);
                setter(aviso);
                return;
            }
            if (!(punto > 0)) {
                aviso = "[INFO] Los puntos a agregar tienen que se mayor a 0";
                System.out.println(aviso);
                setter(aviso);
                return;
            }

            if(!agregarPuntos.containsKey(nombre)){
                aviso = "[INFO] El usuario no esta registrado, registrar primero";
                System.out.println(aviso);
                setter(aviso);
                return;
            }

            for(Map.Entry<String, Integer> r : agregarPuntos.entrySet()){
                String nom = r.getKey();
                int num = r.getValue() + punto;
                if(nom.equals(nombre)){
                    agregarPuntos.put(nom, num);
                    aviso = "[INFO] Se agrego: " + punto  + " puntos, total " + num + " puntos al jugador: " + nom;
                    System.out.println(aviso);
                    setter(aviso);
                    return;
                }

            }


        }else{
            aviso = "[WARNING] Inicie partida primero para agregar puntos";
            System.out.println(aviso);
            setter(aviso);
        }
    }


    public void terminarPartida(){
        String aviso = "";
        if(estadoPartida){
            estadoPartida = false;
            aviso = "[INFO] Sesion de partida cerrada";
            System.out.println(aviso);
            setter(aviso);
            return;
        }
        aviso = "[WARNING] Sesion YA ESTA cerrada";
        System.out.println(aviso);
        setter(aviso);
    }

    public void mostrarInfo(){
        for(String r : eventos){
            System.out.println(r);
        }
    }

    public void mostrarPuntaje(){
        for(Map.Entry<String, Integer> r : agregarPuntos.entrySet()){
            String nom = r.getKey();
            int num = r.getValue();

            System.out.println(nom + " || " + num);
        }

    }


}