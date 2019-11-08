/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author Heyler Sojo Aguilar
 */
public class Ejemplo_patron_builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        PizzaBuilder hawaiana_pizzabuilder = new PizzaHawaianaConcreteBuilder();
        PizzaBuilder picante_pizzabuilder = new PizzaPicanteConcreteBuilder();
        
        restaurante.setPizzaBuilder(picante_pizzabuilder);
        restaurante.construirPizza();
        
        Pizza pizza = restaurante.getPizza();
        System.out.println("Características: "+"masa "+pizza.getMasa()+", relleno "+pizza.getRelleno()+" y salsa "+pizza.getSalsa());
    }
    
}
