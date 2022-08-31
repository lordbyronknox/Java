/*
A generic class that implements a QUEUE. (using a LinkedList)
QUEUE = a collection that lets you add objects to the end of the list, and remove from the front. 
 */
package Page458.GenericQueueClass;

import java.util.*;
/**
 *
 * @author byron
 */
//the class specifies the formal parameter E. (users of this class can state the
//   type of elements of the queue.

public class GenQueue<E> 
{
    //instanciating a LinkedList object and assigning it to list.
    //list can hold objects of type E (which is any type specified by the user of this class.)
    private LinkedList<E> list = new LinkedList<E>();
    
    //method that adds E type items to the end of the queue.
    public void enqueue(E item)
    {
        list.addLast(item);
    }
    
    //method that returns the first item in the list.
    public E dequeue()
    {
        return list.poll();
    }
    
    //method to check if list is empty.
    public boolean hasItems()
    {
        return !list.isEmpty();
    }
    
    //method that returns number of items in list.
    public int size()
    {
        return list.size();
    }
    
    //method that accepts another GenQueue object who's elements are of the same type, 
    // or of a subtype of this GenQueue's element type. 
    public void addItems(GenQueue<? extends E> q)
    {
        while (q.hasItems())
            list.addLast(q.dequeue());
    }
    
}
