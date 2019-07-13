
package mainloginsystem;
import java.util.Scanner;

public class User {
    // Attribute
    private String name;
    private String email;
    private String password;
    private String message;
   
     // Konstruktoren
    public User() {
    }
    
    public User(String name, String email, String password ) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    //Methode
   public void loginUser(){
       Scanner nameIn = new Scanner(System.in);
       Scanner passIn = new Scanner(System.in);
       System.out.println("Enter your name: ");
       name = nameIn.nextLine();
       System.out.println("Enter your password: ");
       password = passIn.nextLine();
       
   }
   
      public void resgisterUser(){
       Scanner nameIn= new Scanner(System.in);
       Scanner emailIn = new Scanner(System.in);
       Scanner passIn = new Scanner(System.in);
       System.out.println("Enter your name: ");
       name = nameIn.nextLine();
       System.out.println("Enter your email: ");
       email = emailIn.nextLine();
       System.out.println("Enter your password: ");
       password = passIn.nextLine();
       
   }
   
    public String getName() {
        return name;
    }
    
    public void setName(String name){
        this.name = name ;
    }
    
     public String getEmail() {
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
     public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
