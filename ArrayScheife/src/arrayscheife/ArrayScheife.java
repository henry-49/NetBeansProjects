/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayscheife;

import java.util.Scanner;

/**
 *
 * @author henry
 */
public class ArrayScheife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int zahl, sum = 0;
        double average;
        
        Scanner feld = new Scanner(System.in);
        System.out.print("Enter number of elements you want in array:");
        zahl = feld.nextInt();
        int num[] = new int[zahl];
        System.out.println("Enter all the elements:");
        for( int i = 0; i < zahl; i++)
        {
            num[i] = feld.nextInt();
            sum = sum + num[i];
            
        }
        System.out.println("Sum:"+sum);
        System.out.println("*****************");
        System.out.print("Array Felder: "+"{");
        for (int i = 0;  i<zahl; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println("}");
        System.out.println("*****************");
        average = sum / num.length;
        System.out.println("Average is:"+average);
        
    }
    
}
