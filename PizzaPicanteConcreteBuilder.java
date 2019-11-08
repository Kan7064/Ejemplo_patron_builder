/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author Nancy Mora León
 */

//CONCRETE BUILDER
public class PizzaPicanteConcreteBuilder extends PizzaBuilder{
    
    @Override
    public void buildMasa(){
        pizza.setMasa("cocida");
    }
    
    @Override
    public void buildSalsa(){
        pizza.setSalsa("picante");
    }
    
    @Override
    public void buildRelleno(){
        pizza.setRelleno("pimienta-salchichón");
    }
}
