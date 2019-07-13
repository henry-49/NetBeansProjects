/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainfiguren;
import abstractfiguren.*;

/**
 *
 * @author henry
 */
public class MainFiguren {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double width = 5; 
        double length = 2;
        
        Figuren rk = new Rechteck(width, length);
        System.out.println("Rechteck Area : " + rk.area() + 
                            "\n Rechteck Perimeter: " + rk.perimeter());
    }
    
}
