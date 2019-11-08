/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 * @author kan7064
 */

// ABSTRACT BUILDER
public abstract class PizzaBuilder {
    //el builder se caracteriza por tener como atributo un objeto del tipo PRODUCTO
    protected Pizza pizza; 
    
    //debe tener métodos cocretos concretos y abstractos por ser abstracta
    public Pizza getPizza(){
        return pizza;
    }
    
    public void crearNuevaPizza(){
        pizza = new Pizza();
    }
    
    public abstract void buildMasa();
  
    public abstract void buildSalsa();
    
    public abstract void buildRelleno();
}
