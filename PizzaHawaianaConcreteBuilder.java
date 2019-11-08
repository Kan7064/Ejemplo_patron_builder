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
//CONCRETE BUILDER
public class PizzaHawaianaConcreteBuilder extends PizzaBuilder {
    
    @Override
    public void buildMasa(){
        pizza.setMasa("delgada");
    }
    
    @Override
    public void buildSalsa(){
        pizza.setSalsa("dulce");
    }
    
    @Override
    public void buildRelleno(){
        pizza.setRelleno("chorizo-queso-alcachofas");
    }
}
