/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainstring;

/**
 *
 * @author henry
 */
public class MainString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        String word = new String("   This is a String Tutorial Class");
        TestString st = new TestString(word);
          System.out.println(word);
          System.out.println(word.trim());
          
        System.out.println("Word Ends with 'c' :"+ word.endsWith("s"));
        System.out.println("Word CodePointAt 5 is : "+ word.codePointAt(0));
        System.out.println(""+word.concat(" in Java"));
        System.out.println("IndexOf a: "+ word.indexOf("a"));
        
        System.out.println("CharAt '9': "+ word.charAt(8));
        System.out.println(word.toUpperCase());
    }
    
    
}
