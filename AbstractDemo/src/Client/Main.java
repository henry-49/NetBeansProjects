/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;
import Wrestlers.*;
/**
 *
 * @author henry
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Wrestler w1 = new Kane();
        w1.themeMusic();
        w1.paymentForWork(4);
        w1.finisher();
    }
    
}
