/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainfahrzeug;

/**
 *
 * @author henry
 */
public class Fahrzeug {
    // Attribute
   public String name;
   public  String farbe;
   public int anzahlRaeder;
   public int geschwindigkeit;
    
    // Konstruktoren
   public Fahrzeug(){
       
   }
    public Fahrzeug(String name, String farbe, int anzahlRaedre){
        this.name = name;
        this.farbe = farbe;
        this.anzahlRaeder = anzahlRaedre;
    }
    
    // Method
    public void datenAusgeben(){
        System.out.println("Name :"+name+"\n");
        System.out.println("Farbe :"+farbe+"\n");
        System.out.println("AnzahlRaeder :"+anzahlRaeder+"\n");
//        System.out.println("Geschwindigkeit :"+geschwindigkeit+"\n");
    }
    
    public void fahren(){
        System.out.println("Ihre Geschwindigkeit is"+geschwindigkeit+"Km/h");
    }
    
    public void bremsen(){
         if (geschwindigkeit <=0) {
            System.out.println("Bitte nicht bremsen");
        } else {
             geschwindigkeit -= 1;

        }
    }
}
