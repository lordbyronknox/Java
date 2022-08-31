/*
ITERATOR
.iterator()
Implements the UsingIterator interface. Must import java.util.UsingIterator.
Another way to access all the elements in a collection.
Its a special object that lets you step through the elements of a collection.
(From java 1.5 onwards you can use the enhanced for loop instead of the iterator).
The Iterator interface defines 3 methods to access each element:
    hasNext()   -   Returns true if the collection has at least one element that hasn't yet been retrieved.
    next()      -   Returns the next element in the collection.
    remove()    -   Removes the most recently retrieved element.


*/
package Page430.UsingAnIterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author byron
 */
public class UsingIterator {
    public static void main(String[] args) 
    {
        ArrayList <String> nums = new ArrayList<String>();
        nums.add("One");
        nums.add("Two");
        nums.add("Three");
        nums.add("Four");
        
        String s;
        Iterator e = nums.iterator();   //The iterator methods is called to get an iterator for nums.
        while (e.hasNext())             //Now the .hasNext() method can be called.
        {
            s = (String) e.next();      //.next() is called to get the element to be printed. This 
                                        // returns an object, so it must be cast to the desired type.
            System.out.println(s);
        }
        
    }
}
