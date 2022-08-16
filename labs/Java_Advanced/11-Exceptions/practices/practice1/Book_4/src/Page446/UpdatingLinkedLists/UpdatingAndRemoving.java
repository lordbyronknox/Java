/*

 */
package Page446.UpdatingLinkedLists;

import java.util.LinkedList;
/**
 *
 * @author byron
 */
public class UpdatingAndRemoving 
{
    public static void main(String[] args) 
    {
        LinkedList <String> officers = new LinkedList <String>();

        // add the original officers
        officers.add("Blake");
        officers.add("Burns");
        officers.add("Tuttle");
        System.out.println(officers);
        
        //Replace Tuttle with Murdock
        officers.set(2, "Murdock");
        System.out.println(officers);
        
        //Removing an item using it's index, or it's reference
        officers.remove("Murdock");
        System.out.println(officers);
        
        officers.remove(1);
        System.out.println(officers);
        
        //remove all items using clear()
        officers.clear();
        System.out.println(officers);
    }
}
