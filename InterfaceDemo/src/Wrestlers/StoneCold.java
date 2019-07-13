/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wrestlers;

/**
 *
 * @author henry
 */
public class StoneCold implements Wrestler{

    @Override
    public void paymentForWork(int hours) {
        System.out.println("The Wrestler will make $" + hours * 200.00 + " for to night's match");
    }

     @Override
    public void themeMusic() {
        System.out.println("Stone Cold's Intro Music");
    }

    @Override
    public void finisher() {
        System.out.println("Stone Cold stuner");
    }
    
}
