/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaufgabe;

import java.util.Scanner;

/**
 *
 * @author henry
 */
public class LogicAufgabe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("6 12 18 24 30 36");
        System.out.println("Please Enter a number");
        int num = sc.nextInt();
        for (int i=1; i <6; i++) {
            System.out.print(" "+num * i+"\t");
        
            if (num % 6 =0) {
                
            } else {
            }
         
        }
    }
    
}
