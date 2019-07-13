/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package name
package zahlenvergleichen;

// Import
import java.util.Scanner;

/**
 * Program to compare and display the highest given number
 * @author henry
 * @date 15.05.2018
 */
public class ZahlenVergleichen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variable declearation
       int a=0, b=0, c=0, grosse=0;
       
       // Defining a Scanner Object to read an input
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Bitte sie gibe zahl fur a ein:");
       a = sc.nextInt(); // read input from the keyboard 
       
       System.out.println("Bitte sie gibe zahl fur b ein:");
       b = sc.nextInt(); // read input from the keyboard 
       
       System.out.println("Bitte sie gibe zahl fur c ein:");
       c = sc.nextInt(); // read input from the keyboard 
       
       // Using if statement to compare variable a, b and c 
        if (a>b && a>c) {
            
            grosse = a;
            
        }else if (b>c && b>a) {
            
            grosse = b;
            
        }else if (c>a && c>b) {
            grosse = c;
        }else{
            System.out.println("Die Zahlen sind Gleich.");
        }
        // display the highest number
        System.out.println("Grosse ist = "+ grosse);
    }
    
}
