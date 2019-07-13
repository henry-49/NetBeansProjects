/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;
import java.util.*;
import java.math.*;
import java.text.*;
import java.util.regex.*;
/**
 *
 * @author henry
 */
public class BubbleSort {
public static void bubbelsort(int [] array){
        boolean isSorted = false;
        int lastSorted = array.length -1;
        while (!isSorted) {        
        isSorted=true;
            for (int i = 0; i < lastSorted; i++) {
                if (array[i] > array[i + 1]) {
                    //swap(array, i, i + 1);
                    isSorted = false;
                }
            }
            lastSorted--;
     }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    }
    
}
