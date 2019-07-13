/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geradezahl;
import java.util.*;

/**
 *
 * @author henry
 */
public class GeradeZahl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                // using Scanner class to read input
                // instantiating an object for scanner class 
		Scanner sc = new Scanner(System.in);
                
                // displays test to the user
		System.out.println("Please Enter a number");
                
                // reads input from the keyboard 
		int num = sc.nextInt();
		
		if(num %2 == 0 && num >= 0){
                    
                    System.out.println(num+ " ist ein greade zahl ");
                    
                }else if(num < 0){
                    
                    System.out.println(num+ " is kleiner als 0");
                    System.out.println(" bitte giben zahl grosser als 0");
                    
                }else{
                    
                    System.out.println(num+ " ist ein ungreade zahl");
                }
    }
    
}
