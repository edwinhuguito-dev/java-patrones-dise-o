package com.singleton.single05;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private static Inventario instancia;
    private List<String>items = new ArrayList<>();

    private Inventario(){

    }

    public static Inventario getInstancia(){
        if(instancia == null){
            instancia = new Inventario();
        }
        return instancia;
    }

    private boolean tieneItem(String item){
        for(String r : items){
            if(r.equals(item)){
                return true;
            }
        }
        return false;
    }


    public void agregarItem(String item){
        if(tieneItem(item)){
            System.out.println("Ya tienes este item: " + item);
            return;
        }
        items.add(item);
        System.out.println("Item agregado");
    }

    public void eliminarItem(String item){
        if(tieneItem(item)){
            items.remove(item);
            System.out.println("Item eliminado: " + item);
        }else{
            System.out.println("No encontro ese item para eliminar, no tinees es item");
        }
    }

    public void buscarItem(String item){
        if(tieneItem(item)){
            System.out.println("Si tienes el item: " + item);
            return;
        }

        System.out.println("No tienes el item: " + item);
    }


    public void mostrarItem(){
        if(items.isEmpty()){
            System.out.println("No hay items que mostrar, lista esta vacia");
            return;
        }
        for(String r : items){
            System.out.println("item: " + r);
        }
    }
}
