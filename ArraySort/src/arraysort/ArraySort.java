/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysort;

import java.util.Arrays;

/**
 *
 * @author henry
 */
public class ArraySort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // defining array
        int array[]= {100, 40, 29, 2, 38, 10, 63};
        int max = array[0];
        int min = array[0];
        
        // using array sort 
        Arrays.sort(array);
        
        for (int i = 0; i < array.length -1; i++) {
            System.out.println(array[i]);
        }
        // for loop for Maximum 
        for (int k = 0; k < array.length; k++) {
            if(array[k] > max){
                max = array[k];
            }
        }
        
        // for loop for Minimum 
         for (int z = 0; z < array.length; z++) {
            if(array[z] < min){
                min = array[z];
            }
        }
        
         // prints Output for Maximum and Minimum
        System.out.println("Max is : "+ max);
        System.out.println("Min is : "+ min);
    }
    
}
