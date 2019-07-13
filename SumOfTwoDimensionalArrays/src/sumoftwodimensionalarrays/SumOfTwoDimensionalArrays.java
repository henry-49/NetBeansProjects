/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumoftwodimensionalarrays;

/**
 *
 * @author henry
 */
public class SumOfTwoDimensionalArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // defining of array
        int [][] feld = {
                            {2,5,9,6},
                            {7,9,20,12},
                            {9,5,19,6},
                            {2,3,7,4}
                         };
        int sum = 0;
        
        // using for loop to sum the rows and columns
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld.length; j++) {
                sum += feld[i][j];
            }
        }
        // print out sum of array
        System.out.println(sum);
    }
    
}
