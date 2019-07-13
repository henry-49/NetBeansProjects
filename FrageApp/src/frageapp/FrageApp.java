/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frageapp;

import java.util.Scanner;

/**
 *
 * @author henry
 */
public class FrageApp {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Wie Heisst du?
    // Wie alt bist du?
    // Wo Wohnst du?
    // beenden
    
    // Variables 
         String name="";
         String stadt="";
        int alt =0;
        
        // Using Scanner object
       Scanner sc = new Scanner(System.in);
       int auswahl;     
            
        do {   
            System.out.println("1- Wie Heist du?: ");
            System.out.println("2- Wie alt bist du?: ");
            System.out.println("3- Wo wohst du?: ");

            System.out.println("4. beende das program");
             auswahl = sc.nextInt();
             
        switch(auswahl){
            
            case 1:
                System.out.println("Name ein geben: ");
                 name= sc.next();
                break;
                
                case 2:
                    System.out.println("Alt ein geben: ");
                 alt = sc.nextInt();
                break;
                
                 case 3:
                     System.out.println("Stadt ein geben: ");
                  stadt = sc.next();
                break;
                
        }
         } while(auswahl != 4);
        System.out.println("name: " + name);
        System.out.println("name: " + alt);
        System.out.println("name: " + stadt);

    }
    
}
