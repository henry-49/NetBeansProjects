/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zahlentauschen;

/**
 * Program to swap two numbers
 * @author henry
 * @date 15.05.2018
 */
public class ZahlenTauschen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variable declearation
        int a =5;
        int b =6;
        int sume;
        
        // Value before Swap
        System.out.println("Bevor Tauschen : a = "+a +" b = "+ b);
        
        // Swap Logic
        sume = a;
        a = b;
        b = sume;
        
        // Value after swap
        System.out.println("Nach Tauschen : a = "+a +" b = "+ b);
        
        
    }
    
}
