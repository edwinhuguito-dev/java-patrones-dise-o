package com.singleton.single05;

public class MainInventario {
    public static void main(String[] args){

        Inventario inventario1 = Inventario.getInstancia();

        inventario1.agregarItem("espada");
        inventario1.agregarItem("pocion");
        inventario1.agregarItem("escudo");

        System.out.println("======== INVENTARIO 2 =============");
        Inventario inventario2 = Inventario.getInstancia();
        inventario2.agregarItem("arco");

        inventario1.mostrarItem();
        inventario2.eliminarItem("espada");
        inventario1.mostrarItem();
        inventario1.buscarItem("pocion");


        boolean igual = inventario1 == inventario2;

        System.out.println(igual);

    }
}
