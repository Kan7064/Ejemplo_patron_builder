/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author kan7064
 */

// DIRECTOR
public class Restaurante {
    private PizzaBuilder pizzaBuilder;
    
    public void setPizzaBuilder(PizzaBuilder Builder){
        pizzaBuilder = Builder;
    }
    
    public Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }
    
    public void construirPizza(){
        pizzaBuilder.crearNuevaPizza();
        pizzaBuilder.buildMasa();
        pizzaBuilder.buildRelleno();
        pizzaBuilder.buildSalsa();
    }
}
