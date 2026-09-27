package com.factori;

abstract class PizzeriaZonaAbstract {

    public PizzaProducto ordenarPizza(String tipoPizza){
        PizzaProducto pizza = crearPizza(tipoPizza);
        System.out.println("----- Fabricando la pizza " + pizza.getNombre() + "----");
        pizza.preparar();
        pizza.cocinar();
        pizza.cortar();
        pizza.empaquetar();

        return pizza;

    }

    abstract PizzaProducto crearPizza(String tipo);

}
