/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainperson;

/**
 *
 * @author henry
 */
public class MainPerson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Person p1 = new Person();
       
      Arbeit a1 = new Arbeit("Faher", "Smith", "Witmann", 29, "smith@web.de", 
                                22242254, "Engerstr", 19, 40235, "Dusseldorf");
       
     Supermart s1 = new Supermart("Lidi", "Jane", "Hoffman", 32, "jane@web.de", 
                                2583024, "Hoffeldstr", 46,40235, "Dusseldorf");
       
     // p1 is an object from Person Class
      p1.vorname = "John";
      p1.nachname = "Willson";
      p1.alter = 23;
      p1.emial = "john@web.de";
      p1.telefon = 52314823;
      p1.strasse = "Amschien";
      p1.hausnummer = 97;
      p1.postleitzahl = 40470;
      p1.ort = "Dusseldorf";
      p1.identiefizieren();
      p1.datenAusgeben();
      System.out.println("***********************");
      // a1 is an object from Arbeit Class
       a1.identiefizieren();
       a1.datenAusgeben();
       System.out.println("***********************");
       // s1 is an object from Supermart Class
       s1.identiefizieren();
       s1.datenAusgeben();
    }
    
}
