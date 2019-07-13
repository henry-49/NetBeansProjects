/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainmenuwhile;

import java.util.Scanner;

public class Menu {
      // Attribute
    private String name;
    private String email;
    private String password;
    
    public void Menu(){
        
       
         
    }
    
    public void userService(){
         int input =0;
        do {   
            System.out.println("Please select a number:");
            System.out.println("Select Menu: \n "
                                   + "1- Login \n "
                                   + "2- Register \n "
                                   + "3- Beenden \n ");
          Scanner sc = new Scanner(System.in);
           input = sc.nextInt();
          switch(input){
              case 1: // login
              Scanner nameIn = new Scanner(System.in);
              Scanner passIn = new Scanner(System.in);
              System.out.println("Enter your name: ");
              name = nameIn.nextLine();
              System.out.println("Enter your password: ");
              password = passIn.nextLine();
              System.out.println("Welcome "+name);
               System.out.println("*********************");
                  break;
                  
                  case 2: // Register
                    Scanner nameI= new Scanner(System.in);
                    Scanner emailI = new Scanner(System.in);
                    Scanner passI = new Scanner(System.in);
                    System.out.println("Enter your name: ");
                    String name = nameI.nextLine();
                    System.out.println("Enter your email: ");
                    String email = emailI.nextLine();
                    System.out.println("Enter your password: ");
                    String password = passI.nextLine();
                    System.out.println(name+" Thank you for your registration");
                      System.out.println("*********************");
                  break;
                 case 3: // Beenden 
                     break;
                  
          }
        }while (input !=3);
    }

    
}
