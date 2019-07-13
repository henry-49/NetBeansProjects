/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletondemo;

/**
 *
 * @author henry
 */
public class Singleton {
    
    private static Singleton singleton = new Singleton();
    
    private Singleton(){
        
    }
    
    public static Singleton getInstance(){
        return singleton;
    }
    
    protected static void demoMethod(){
        System.out.println("demoMethod for singleton");
    }
}
