
package Page418.CopyingAnArray;

import java.util.Arrays;
/**
 *
 * @author byron
 */
public class CopyDemo {
    
    public static void main(String[] args) 
    {
        int arrayOriginal[] = {42, 55, 21};
        int arrayNew[] = Arrays.copyOf(arrayOriginal, 4);   //(<array to copy from>, <length of new array>)
        int arrayNew2[] = Arrays.copyOf(arrayOriginal, 15);
        
        printIntArray(arrayNew);
        printIntArray(arrayNew2);
    }
    
    
    static void printIntArray(int arrayNew[])
    {
        for (int i : arrayNew)
        {
            System.out.print(i);
            System.out.print(' ');
        }
        System.out.println();
    }
    
}
