/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zahlenerraten;

import java.util.*;
/**
 *
 * @author henry
 */
public class ZahlenErraten {

    /**
     * @param args the command line arguments
     */
   public static void main (String[] args) 
	{
		// using Scanner class to read input
                // instantiating an object for scanner class 
		Scanner sc = new Scanner(System.in);
                
                // displays test to the user
		System.out.println("Please Enter a number");
                
                // reads input from the keyboard 
		int num = sc.nextInt();
		System.out.println("Your number is: "+ num);
		
                // instantiating an object for Random class 
		Random meinZahl = new Random();
		int zahl = meinZahl.nextInt(100);
		
                // checking if the given number is equal to the guess number
		if(zahl == num){
			System.out.println("Woo!! You guess it right!");
			System.out.println("Your number is: "+ zahl);
			
		}else{
			
			System.out.println("Sorry no match number found!!");
			System.out.println("The Correct number is: "+ zahl);
		}
		

	}
    
}
