package navigation_menu;

import java.util.Scanner;

/**
 *
 * @author majdothman
 */
public class Navigation_Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        // ein Object von User
        User user = new User();
        System.out.println("Haupt Menu");
        System.out.println("\t1- Login");
        System.out.println("\t2- Registrieren");
        System.out.println("\t3- Spielen");
        System.out.println("\t4- Beenden");
        System.out.print("bitte auswählen: ");

        x = input.nextInt();

        do {

            switch (x) {
                case 1:
                    if (user.getUsername() != null) {
                        System.out.print("Benutzername eingeben: ");
                        String username = input.next();

                        System.out.print("Password eingeben: ");
                        String password = input.next();

                        if (password == user.getPassword()
                                & username == user.getUsername()) {
                            System.out.println("Hey " + username + ", Wilkommen");
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
                    System.out.println("Spielen Menu");
                    System.out.println("\t1- Mario");
                    System.out.println("\t2- FIFA 2018");
                    System.out.println("\t3- Buzzel");
                    System.out.println("\t4- Ihre Scoure Sehen (Sub menu)");
                    System.out.println("\t5- zurück");
                    System.out.print("bitte auswählen: ");
                    subMenuSelect = input.nextInt();
                    do {

                        if (subMenuSelect <= 0 || subMenuSelect > 4) {
                            System.out.print("----------------");
                            System.out.print("----------------");
                            System.out.println("----------------");
                            System.out.print("Ihre auswählen ist falsch,");
                            System.out.println("Probieren Sie nochmal");
                            System.out.print("----------------");
                            System.out.print("----------------");
                            System.out.println("----------------");
                        } else {
                            switch (subMenuSelect) {
                                case 1:
                                    System.out.println("Mario comming soon ... ");
                                    System.out.println("Click anykey zum zurück");
                                    String waitSoon = input.next();
                                    break;
                                case 2:
                                    System.out.println("FIFA comming soon ... ");
                                    System.out.println("Click anykey zum zurück");
                                    String waitSoon2 = input.next();

                                    break;
                                case 3:
                                    System.out.println("Buzzel comming soon ... ");
                                    System.out.println("Click anykey zum zurück");
                                    String waitSoon3 = input.next();

                                    break;
                                case 4:
                                    int subMenuScoure;
                                    do {
                                        System.out.println("Spielen Menu");
                                        System.out.println("\tIhre Scoure: 0");
                                        System.out.println("\t1- zurück");
                                        System.out.print("bitte auswählen: ");
                                        subMenuScoure = input.nextInt();
                                        if (subMenuScoure <= 0 || subMenuScoure > 1) {
                                            System.out.print("----------------");
                                            System.out.print("----------------");
                                            System.out.println("----------------");
                                            System.out.print("Ihre auswählen ist falsch,");
                                            System.out.println("Probieren Sie nochmal");
                                            System.out.print("----------------");
                                            System.out.print("----------------");
                                            System.out.println("----------------");

                                        }
                                    } while (subMenuScoure != 1);
                                    break;
                            }
                        }
                        System.out.println("Spielen Menu");
                        System.out.println("\t1- Mario");
                        System.out.println("\t2- FIFA 2018");
                        System.out.println("\t3- Buzzel");
                        System.out.println("\t4- Ihre Scoure Sehen (Sub menu)");
                        System.out.println("\t5- zurück");
                        System.out.print("bitte auswählen: ");
                        subMenuSelect = input.nextInt();
                    } while (subMenuSelect != 5);

                    break;

            }
            System.out.println("Menu");
            System.out.println("\t1- Login");
            System.out.println("\t2- Registrieren");
            System.out.println("\t3- Spielen");
            System.out.println("\t4- Beenden");
            System.out.print("bitte auswählen: ");
            x = input.nextInt();
            if (x <= 0 || x > 4) {
                System.out.print("----------------");
                System.out.print("----------------");
                System.out.println("----------------");

                System.out.print("Ihre auswählen ist falsch,");
                System.out.println("Probieren Sie nochmal");
                System.out.print("----------------");
                System.out.print("----------------");
                System.out.println("-----------------");
            }

        } while (x != 4);

    }

}
