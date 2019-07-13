/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainloginsystem;
import java.util.Scanner;
public class MainMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         System.out.println("Select Menu: \n "
                                   + "1- Login \n "
                                   + "2- Register \n "
                                   + "3- Beenden \n ");
         
         
         
           int userInput;
             
           Scanner sc = new Scanner(System.in);
           userInput = sc.nextInt();
    switch(userInput){
        case 1:
            LoginHandler login = new LoginHandler();
            login.loginUser();
            login.setMessage("Welcome to java tutorial!");
            System.out.println(login.getName()+" "+login.getMessage());
            break;
            
            case 2:
            RegisterationHandler user = new RegisterationHandler();
            user.resgisterUser();
            user.setMessage("Thank you for your Resgistration!");
            System.out.println(user.getName()+" "+user.getMessage());
            break;
}
    
      
    }
    
   
    
    
}
