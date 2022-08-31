/*
Updating elements using .set() method.
(replacing an existing object element with another).
*/
package Page432.UpdatingElements;

import java.util.ArrayList;

/**
 *
 * @author byron
 */
public class UpdateElements {
    
    public static void main(String[] args) 
    {
        ArrayList<String> nums = new ArrayList<String>();
        nums.clear();           //remove all elements
        nums.add("One");
        nums.add("Two");
        nums.add("Three");
        
        System.out.println(nums);
        
        nums.set(0, "Uno");         //replace the object at index 0, with "Uno".
        nums.set(1, "Dos");
        nums.set(2, "Tres");
        
        System.out.println(nums);
       
                
                }
    
}
