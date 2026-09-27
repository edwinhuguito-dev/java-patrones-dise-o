package com.singleton.single06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Logger {
    private static Logger instacia;
    private String info;
    private String error;
    private String warning;
    private boolean online;
    private Map<String, String> comentarios = new HashMap<>();
    private List<String> avisos = new ArrayList<>();

    private Logger(){
        settear();
    }

    public static Logger getInstance(){
        if(instacia == null){
            instacia = new Logger();
        }
        return instacia;
    }

    private void settear (){
        avisos.add("[INFO] Usuario inicio sesion correctamente");
        avisos.add("[Error] Contraseña incorrecta");
        avisos.add("[WARNING] Contraseña devil");
        avisos.add("[INFO] La sesion ya esta cerrada");
        avisos.add("[INFO] Sesion cerrada.");
        avisos.add("[INFO] La sesion ya esta iniciada");
    }

    public void registrarUsuario(String user, String contra){
        this.online = true;
        if(contra.length() < 8){
            System.out.println(avisos.get(2));
        }
        this.comentarios.put(user,contra);
        System.out.println(avisos.get(0));

    }

    public boolean logout(){
        if(!this.online){
            System.out.println(avisos.get(4));
            return this.online;
        }
        System.out.println(avisos.get(3));
        return this.online = false;
    }

    public void iniciarSesion(String user, String contra){
        if(this.online){
            System.out.println(avisos.get(5));
            return;
        }
        boolean match = false;
        for(Map.Entry<String, String> busca : comentarios.entrySet()){

            if((busca.getKey().equals(user)) && (busca.getValue().equals(contra))){
                match = true;
                online = true;
                System.out.println(avisos.get(0));
            }
        }
        if(!match){
            System.out.println(avisos.get(1));
        }

    }


}
