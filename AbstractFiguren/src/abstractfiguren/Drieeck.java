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
public class Drieeck extends Figuren{
    private final  double a, b, c;
    
    // constructors
    
    public Drieeck(){
        this(1,1,1);
    }
    
    public Drieeck(double a, double  b, double  c){
        
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    
    @Override
    public double area() {
        
        // A = SquareRoot(s * (s - a) * (s - b) * (s - c)
        // where s = (a + b + c) / 2 or 1/2 of the perimeter of the triangle
        double s = (a + b + c) / 2;
        return  Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        // P = a + b + c
        return  a + b + c;
    }
    
}
