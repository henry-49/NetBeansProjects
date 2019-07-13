/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainfiguren;
import InterfaceFiguren.*;
/**
 *
 * @author henry
 */
public class MainFiguren {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double a = 8;
        double b = 9;
        double c = 27;
        double width = 5; 
        double length = 2;
        double radius = 5;
        
        Figuren rk = new Rechteck(width, length);
        System.out.println("Rechteck Area : " + rk.area() + 
                        "\n Rechteck Perimeter: " + rk.perimeter());
        
        
        Figuren drieeck = new Drieeck(a, b, c);
        System.out.println("Drieecke Area : " + drieeck.area() + 
                        "\n Drieeck Perimeter: " + drieeck.perimeter());
        
        
        Figuren kreis = new Kreis(radius);
        
        System.out.println("Kreis Area : " + kreis.area() + 
                        "\n Kreis Perimeter: " + kreis.perimeter());
    }
    
}
