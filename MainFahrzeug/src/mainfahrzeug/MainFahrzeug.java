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
public class MainFahrzeug {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fahrzeug auto1 = new Fahrzeug();
        auto1.name = "BMW";
        auto1.farbe = "Schwaze";
        auto1.anzahlRaeder = 4;
        auto1.geschwindigkeit = 170;
        auto1.datenAusgeben();
    }
    
}
