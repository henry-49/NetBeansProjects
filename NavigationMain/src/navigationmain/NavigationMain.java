/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navigationmain;

import java.util.Scanner;

public class NavigationMain {


    public static void main(String[] args) {
        int userInput;
        Scanner input = new Scanner(System.in);
        // ein Object von User
        User user = new User();
        System.out.println("Haupt Menu");
        System.out.println("\t1- Login");
        System.out.println("\t2- Registrieren");
        System.out.println("\t3- Greeting");
        
        System.out.println("\t4- Beenden");
        System.out.print("bitte auswählen: ");

        userInput = input.nextInt();

        do {

            switch (userInput) {
                case 1:
                    if (user.getUsername() != null) {
                        System.out.print("Benutzername eingeben: ");
                        String username = input.next();

                        System.out.print("Password eingeben: ");
                        String password = input.next();

                        if (password == user.getPassword()
                                & username == user.getUsername()) {
                            System.out.println("Hallo " + username + ", Wilkommen");
                        } else {
                            System.out.println("username oder password falsch");
                        }

                    } else {
                        System.out.println("Bitte erstellen Sie ein neues Konto"
                                + ", bevor Sie sich anmelden");
                    }
                    break;
                case 2:
                    System.out.print("Benutzername eingeben: ");
                    user.setUsername(input.next());

                    System.out.print("Password eingeben: ");
                    user.setUsername(input.next());
                    System.out.println("Ihr Register war erfolgreich, ");
                    System.out.println("Geben Sie 1 zum Anmelden ein");
                    break;
                case 3:
                    int subMenuSelect;
                    System.out.println("Greeting Menu");
                    System.out.println("\t1- Hallo");
                    System.out.println("\t2- Jahr");
                    System.out.println("\t3- Learnfeld");
                    System.out.println("\t4- Author Info");
                    System.out.println("\t5- zurück");
                    System.out.print("bitte auswählen: ");
                    subMenuSelect = input.nextInt();
                    do {

                        if (subMenuSelect <= 0 || subMenuSelect > 4) {     
                            System.out.print("********************");
                            System.out.println("********************");
                            System.out.print("Ihre auswählen ist falsch,");
                            System.out.println("Probieren Sie nochmal");
                            System.out.print("********************");                           
                            System.out.println("********************");
                        } else {
                            switch (subMenuSelect) {
                                case 1:
                                    System.out.println("Hallo Benutzer ...");
                                    System.out.println("Click anykey zum zurück");
                                    String helloUser = input.next();
                                    break;
                                case 2:
                                    System.out.println("Wie sind im jahr 2018 ...");
                                    System.out.println("Click anykey zum zurück");
                                    int jahrUser = input.nextInt();

                                    break;
                                case 3:
                                    System.out.println("Wir Learning Java..");
                                    System.out.println("Click anykey zum zurück");
                                    String authorInfo = input.next();
                                    break;
                                case 4:
                                    int subMenuScoure;
                                    do {
                                        System.out.println("Greeting Menu");
                                        System.out.println("\tAutor Info:");
                                        System.out.println("Name:Henry \n"
                                                       +"Ort:Duesseldorf \n"
                                                       +"Jahr:2018... ");
                                        System.out.println("\t1- zurück");
                                        System.out.print("bitte auswählen: ");
                                        subMenuScoure = input.nextInt();
                                        if (subMenuScoure <= 0 || subMenuScoure > 1) {
                                            System.out.print("********************");
                                            System.out.println("********************");
                                            System.out.print("Ihre auswählen ist falsch,");
                                            System.out.println("Probieren Sie nochmal");
                                            System.out.print("********************");
                                            System.out.println("********************");

                                        }
                                    } while (subMenuScoure != 1);
                                    break;
                            }
                        }
                        System.out.println("Greetings Menu");
                        System.out.println("\t1- Hallo");
                        System.out.println("\t2- Jahr");
                        System.out.println("\t3- Learnfeld");
                        System.out.println("\t4- Author Info");
                        System.out.println("\t5- zurück");
                        System.out.print("bitte auswählen: ");
                        subMenuSelect = input.nextInt();
                    } while (subMenuSelect != 5
                            );

                    break;

            }
            System.out.println("Menu");
            System.out.println("\t1- Login");
            System.out.println("\t2- Registrieren");
            System.out.println("\t3- Greeting");
            System.out.println("\t4- Beenden");
            System.out.print("bitte auswählen: ");
            userInput = input.nextInt();
            if (userInput <= 0 || userInput > 4) {
                System.out.print("********************");
                System.out.println("********************");

                System.out.print("Ihre auswählen ist falsch,");
                System.out.println("Probieren Sie nochmal");
                System.out.print("********************");
                System.out.println("********************");
            }

        } while (userInput != 4);

    }
   
    }