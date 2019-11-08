/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author Nancy Mora Leon
 */

//PRODUCTO
public class Pizza {
    private String masa;
    private String salsa;
    private String relleno;
    
    public void setMasa(String pMasa){
        masa = pMasa;
    }
    
    public void setSalsa(String pSalsa){
        salsa = pSalsa;
    }
    
    public void setRelleno(String pRelleno){
        relleno = pRelleno;
    }

    public String getMasa() {
        return masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public String getRelleno() {
        return relleno;
    }
    
    
}
