/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wrestlers;

/**
 *
 * @author henry
 */
public abstract class Wrestler {
    
    public void paymentForWork(int hours){
        System.out.println("The Wrestler will make $" + hours * 250.00 + " for to night's match");
    }
    
    public abstract void themeMusic();
    
    public abstract void finisher();
       
}
