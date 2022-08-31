/*
RETRIEVING ITEMS FROM A LINKE LIST
 */

package Page445.RetrievingItemsFromALinkedList;

import java.util.LinkedList;
/**
 *
 * @author byron
 */
public class RetrievingItems 
{
    public static void main(String[] args) 
    {
        LinkedList<String> officers = new LinkedList <String>();
        officers.add("Blake");
        officers.add("Burns");
        officers.add("Houlihan");
        officers.add("Pierce");
        officers.add("McIntyre");
        
        //getFirst()    retrieves first item from the list. Does not delete it.
        //Throws 'NoSuchElement-Exception' if list is empty.
        System.out.println(officers.getFirst());
        
        //element()     Same as getFirst().
        System.out.println(officers.element());
        
        //peek()    same as getFirst(), but returns 'null', not an exception is list is empty...
        System.out.println(officers.peek());
        
        //peekFirst()   Identical to peek()
        System.out.println(officers.peekFirst());
        
        //remove()  same as getFirst(), but removes the the item from the list.
        System.out.println(officers.remove());
        
        //removeFirst()  Identical to remove().
        System.out.println(officers.removeFirst());
        
        //poll()    same as removeFirst(), but returns null if list is empty.
        System.out.println(officers.poll());
        
        //pollFirst()   identical to poll().
        
        //pop() Identical to removeFirst()
        
        //RETRIEVE THE LAST ITEM IN A LIST:
        //getLast()     retrieves last item from the list. Does not delete it.
        //Throws NoSuchElement-Exception if list is empty.
        System.out.println(officers.getLast());
        
        //peekLast()    same as getLast(), but returns null if list is empty.
        System.out.println(officers.peekLast());
        
        //removeLast()  similar to getLast(), but removes the item.
        System.out.println(officers.removeLast());
        
        //pollLast()    similar to removeLast(), but returns null if list is empty.
        System.out.println(officers.pollLast());
        
        
    }
}
