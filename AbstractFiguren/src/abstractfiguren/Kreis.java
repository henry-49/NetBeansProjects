/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfiguren;

/**
 *
 * @author henry
 */
public class Kreis extends Figuren{
    private final double radius;
    final double  pi = Math.PI;
    
    // constructors
    public Kreis(){
        this(1);
    }
    
    public Kreis(double radius){
        this.radius = radius;
    }
    
    @Override
    public double area() {
        // A = pi * r^2
        return pi * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        // P = 2* pi * r
        return 2 * pi * radius;
    }
    
}
