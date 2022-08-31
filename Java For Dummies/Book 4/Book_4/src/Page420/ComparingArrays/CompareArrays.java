/*
Comparing array variable: == is true only if both variables point to the same array instance.
To compare two arrays, element by element use:
  - Arrays.equals()   for one-dimentional arrays   
  - Arrays.deepEquals()  for two-dimentional arrays.

*/

package Page420.ComparingArrays;

 import java.util.Arrays;
/**
 *
 * @author byron
 */
public class CompareArrays 
{
    public static void main(String[] args) 
    {
        int[] array1 = new int[] { 1, 3, 2, 8 };
        int[] array2 = { 1, 3, 2, 8 };
        int[] array3 = new int[] { 2, 3, 1, 8 };
        int[][] Two_D_array1 = new int[][] { {1, 2}, {3, 4} };
        int[][] Two_D_array2 = { {1, 2}, {3, 4} };
        int[][] Two_D_array3 = { {2, 1}, {3, 4} };
                
        
        if (Arrays.equals(array1, array2))      //true
            System.out.println("Yes, Equal");
        else
            System.out.println("Not Equal.");
        
        if (Arrays.equals(array1, array3))      //same elements, but different order = false.
            System.out.println("Yes, Equal");
        else
            System.out.println("Not Equal.");
        
        if (Arrays.deepEquals(Two_D_array1, Two_D_array2))      
            System.out.println("2D array is Equal");
        else
            System.out.println("2D array is NOT Equal.");
        
        if (Arrays.deepEquals(Two_D_array1, Two_D_array3))      
            System.out.println("2D array is Equal");
        else
            System.out.println("2D array is NOT Equal.");
        
    }
    
}
