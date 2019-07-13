/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;
import java.util.*;
/**
 *
 * @author henry
 */
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // for sorting user input
        String userInput;
       // for sorting reverse string
        String rev = "";
        
        System.out.println("Enter String to Reverse: ");
        // using scanner class
        Scanner sc = new Scanner(System.in);
        
        // Read input from the keyboad
        userInput = sc.nextLine();
        
        int len = userInput.length();
        
        // for loop
        for(int i = len -1; i >=0; i--){
            rev = rev + userInput.charAt(i);
           
        }
        // print output to the screen
        System.out.println("Original String is : "+ userInput);
        System.out.println("Reverse  String is : "+ rev); 
    }
    
}
