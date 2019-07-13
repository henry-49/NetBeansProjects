/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversenumber;

import java.util.Scanner;

/**
 *
 * @author henry
 */
public class ReverseNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // using scanner class
        Scanner sc = new Scanner(System.in);
        
         System.out.print("Enter Number to Reverse: ");
         int original = sc.nextInt(); // for user input
         int rev = 0;  // for the reverse number
         int remainder; // for remainder
         
         // using while loop
        while (original !=0) {
            
            remainder = original % 10;
            rev = rev * 10 + remainder;
            original = original / 10;
            
        }
        
        // print output to the screen
        System.out.println("Reverse  Number is : "+ rev); 
    }
    
}
