package com.factori;

public class PizzaVegetariana extends PizzaProducto{

    public PizzaVegetariana(){
         super();
         nombre = "Pizza vegetariana New York";
         masa = "Masa integral vegana";
         salsa = "Salsa de tomate";
         ingredientes.add("queso vegano");
         ingredientes.add("Tomate");
         ingredientes.add("Aceituna");
         ingredientes.add("Espinaca");
         ingredientes.add("Berenjenas");
    }



    @Override
    void cocinar() {
        System.out.println("Cocinando por 25 min. a 150 C");
    }

    @Override
    void cortar() {
        System.out.println("Cortando al pizza en rebanadas cuadradas");
    }
}
