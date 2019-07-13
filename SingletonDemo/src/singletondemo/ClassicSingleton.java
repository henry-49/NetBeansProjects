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
public class ClassicSingleton {
    
    private static ClassicSingleton instance = null;
    
    private  ClassicSingleton(){
        
    }
            
         
    public static ClassicSingleton getInstance(){
        if(instance == null){
            instance = new ClassicSingleton();
        }
        return instance;
    }
   
}
