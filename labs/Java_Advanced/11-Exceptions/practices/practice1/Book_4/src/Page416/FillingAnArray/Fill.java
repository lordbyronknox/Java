// Arrays.fill()

package Page416.FillingAnArray;

import java.util.Arrays;

/**
 *
 * @author byron
 */
public class Fill {
    
    public static void main(String[] args) {
        
        int[] ran = new int[10];
        Arrays.fill(ran, 100);      //fills ran's 10 elements with the value 100.
        
        
        for (int i : ran)
        {
            System.out.print(i + " ");            
        }
        
    }
    
}
