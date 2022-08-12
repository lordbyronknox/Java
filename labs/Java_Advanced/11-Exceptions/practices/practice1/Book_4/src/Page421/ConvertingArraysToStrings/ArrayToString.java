//Array.toString()

package Page421.ConvertingArraysToStrings;

import java.util.Arrays;
/**
 *
 * @author byron
 */
public class ArrayToString 
{
    public static void main(String[] args) 
    {
        int[] array = { 1, 3, 2, 8 };
        int[][] Two_D_array2 = { {1, 2}, {3, 4} };
        
        //print array's elements to console using Arrays.toString() method.
        System.out.println(Arrays.toString(array));
        
        //print 2d array's elements to console.
        for (int[] i : Two_D_array2)
            for (int j : i)
        {
            System.out.println(j);
        }
        
    }
}
