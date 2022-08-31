/*
A simple generic class that implements a stack.
 */
package Page454.GenericStackClass;

import java.util.*;
/**
 *
 * @author byron
 */
//The formal prameter <E> enables anyone using this class to define the element's types.
public class GenStack<E> 
{
    //instanciating a LinkedList object, that accepts type E elements, and assigning it to 'list'.
    private LinkedList<E> list = new LinkedList<E>();
    
    //push() method - adds elements to top of the stack/list.
    public void push(E item)
    {
        list.addFirst(item);
    }
    
    //pop() method, removes and returns the last (top of stack) element (of type E) of the list.
    public E pop()
    {
        return list.poll();
    }
    
    //peek() method, returns the value of the (last) element added, on the top of the list (of type E).
    //Returns null if list is empty.
    public E peek()
    {
        return list.peek();
    }
    
    //hasItems() method, returns true if list is not empty.
    public boolean hasItems()
    {
        return !list.isEmpty();
    }
    
    //size() method, returns number of elements in the list.
    public int size()
    {
        return list.size();
    }
    
    
}
