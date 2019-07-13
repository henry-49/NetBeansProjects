/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramid;

import java.util.Scanner;

/**
 *
 * @author henry
 */
public class Pyramid {

    public Pyramid(){
        // declear variable
        int i, j, k, number;
        
        // using Scanner class to read input
        // instantiating an object for scanner class 
        Scanner user_input = new Scanner(System.in);
        
        System.out.println("Pelase enter number of layers for pyramid: ");
        
       // reads data from the keyboard
        number = user_input.nextInt();
        
        
        for (i = 1; i<=number; i++) {
            
            for (j =i; j< number; j++) 
                System.out.print(" ");
            
            for (k =1; k<(i*2); k++) 
                System.out.print("*");
                System.out.print("\n");
            
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // instantiating an object of the Pyramid class
        Pyramid pyramid = new Pyramid();
    }
    
}
