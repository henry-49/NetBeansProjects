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
public class Drieeck implements Figuren{
    private final  double a, b, c;
    private double h;
    
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
        
        // where s = (a + b + c) / 2 or 1/2 of the perimeter of the triangle
        double s = a * h / 2;
        return  Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        double umfang = a + b + c;
        return  umfang;
    }
    
}
