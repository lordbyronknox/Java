
package Page419.SortingAnArray;

import java.util.Arrays;

/**
 *
 * @author byron
 */
public class Sort {
    
    public static void main(String[] args) 
    {
        int[] lotto = new int[6];
        for (int i = 0; i < 6; i++)
            lotto[i] = (int)(Math.random() * 100) + 1;
        for (int i : lotto)
        System.out.println(i);
        
        //sort the array
        Arrays.sort(lotto);           
             
        for (int j : lotto)
            System.out.print(j + " ");
        
        
        //Searching an array using binarySearch()  NOTE: Array must be sorted to use this method.
        System.out.println();
        
        int lucky = 7;
        int foundAt = Arrays.binarySearch(lotto, lucky);    //(<array to search>, <element to search for>)
        if (foundAt > -1)
            System.out.println("My number came up!");
        else
            System.out.println("Not lucky today.");
    }
    
}
