/*
LINKEDLIST
A collection where each element/object maintains a POINTER to the objects ahead and behind it.
No array involved.
The POINTERS are managed by the CreatingALinkedList class, so you dont have to set them up.

ADVANTAGES OVER ARRAYLISTS:
- No predetermined size, and doesn't have to reallocate its array when you add to it.
- More efficient with adding and removing elements into the middle of the list - it just changes the pointers
  of the previous and next object.
- LINKEDLISTS are especially well suited for creating two common types of list:
    STACKS: A list where the items can only be added or removed from the front of the list.
    QUEUES: A list where items are always added to the Back, and removed from the front.

DISADVANTAGE
- Require more memory than arrays and are slower when it comes to simple sequential access.



*/
package Page442.CreatingALinkedList;

import java.util.LinkedList;
/**
 *
 * @author byron
 */
public class CreatingALinkedList {
    
    
    public static void main (String[] args) 
    {
        //creating a linkedlist object.
        LinkedList<String> officers = new LinkedList <String>();     //generic String type. Items added must be
                                                                     // of type String.
        //adding items to the linked list using .add()
        officers.add("Blake");
        officers.add("Burns");
        officers.add("Houlihan");
        officers.add("Pierce");
        officers.add("McIntyre");

        for (String s : officers)
            System.out.println(s);            
        System.out.println("\n******************");
        
        //adding to a linked list using .addFirst()
        officers.addFirst("Zola");
        officers.addFirst("Ziggy");
        
        for (String s : officers)
            System.out.println(s);
        System.out.println("\n******************");
        
        //inserting to a specific index position
        officers.add(2, "INSERTED TO INDEX 2");
        
        for (String s : officers)
            System.out.println(s);
        System.out.println("\n******************");
            
        //using the .offer() method. 
        //As long as the item is accepted offer() returns true.
        officers.offer("This is the OFFER methods");
        
        for (String s : officers)
            System.out.println(s);
        System.out.println("\n******************");
            
            
    }
}
