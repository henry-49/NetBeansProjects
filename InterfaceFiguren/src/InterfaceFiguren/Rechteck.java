/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceFiguren;

/**
 *
 * @author henry
 */
public class Rechteck implements Figuren{
 private final double width, length; // sides
 
 // constructors
 public Rechteck(){
     this(1,1);
 }
 
 public Rechteck(double width, double length){
     this.width = width;
     this.length = length;
 }
    @Override
    public double area() {
        // A = w * l
        return width * length;
    }

    @Override
    public double perimeter() {
        // P = 2(w + l)
        return 2 * (width + length);
    }
    
}
