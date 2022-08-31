/*
ARRAY LISTS
- Automatically resize themselves.
- Allows you to insert elements into the middles of a collection.
- Allows you to delete items.
- The array list class creates a new array list, copies existing items and 
    then adds the new item.

Methods
    .add(object element)                Adds the specified object to the array list. 
                                        (must match the type of the Array list).     
    .add(int index, object element)     Adds object to array list, at specified index position.
    .addAll(collection c)               Adds all elements of specified collection to this array list.
    .addAll(int index, Collection c)    Adds all elements from specified collection, at specified index position.
    .clear()                            Deletes all elements from the array list.
    .clone()                            Returns a shallow copy of the arrays list. The emements in the copy
                                        are the same as the elements in the original.
    .contains(object element)           Returns boolean indicating if specified object is in the array list.
    .containsAll(Collection c)          Returns boolean - checks if this array list contains all elements 
                                        of specified collection.
    .ensureCapacity(int minCapacity)    Increases capacity to specified value. (does nothing if already greater).
    .get(int index)                     Returns object at specific index.
    .indexOf(Object elem)               Returns the index of first occurance of specific object. 
                                        (Returns -1 of none).
    .isEmpty()                          Returns boolean indicates if the array list is empty.
    .iterator()                         Returns an iterator for the array list.
    .lastIndexOf(object elem)           Returns index position of last occurance of specified object.
    .remove(object elem)                Removes object from list. (only first occurance). Returns boolean
                                        of if object was in the list or not.
    .remove(int index)                  Removes object at specified index, Returns the object that was removed.
    .remove (int from, int to)          Removes all elements between specified indexes. (not including
                                        the elements at 'from' and 'to'... only between.)
    .removeAll(collection c)            Removes all elements in specified collection.
    .retainAll(collection c)            Removes everything not in specified collection.
    .set(int index, object elem)        Sets the specified element to the specified object.  The element
                                        that was at that position is returned as the method's return value.
    .size()                             Returns the number of elements in the list.
    .toArray()                          Returns the elements as an array of objects. (Object[]).
    .toArray(type[] array)              Returns the elements of the array list as the an array of specified type.
    



*/



package Page424.UnderstandingTheArrayListClass;

import java.util.ArrayList;                         //ArrayList needs to be imported.
/**
 *
 * @author byron
 */
public class ArrayLists {
    
    //Array List constructors.
    ArrayList arrList1 = new ArrayList();           //Creates an array list with initial (defualt) capacity of 10.
    ArrayList arrList2 = new ArrayList(20);         //Creates array list with specified capacity (ie. 20).
    ArrayList arrList3 = new ArrayList(arrList2);   //Creates array list and copies all elements from specified collection.
    ArrayList<String> signs = new ArrayList<String>(); //Specifying the TYPE of elements it can hold. <GENERIC>
                                                       //   The advantage of this is that the compiler complains 
                                                       //   if you try add the wrong type.
    
    
    public static void main(String[] args) 
    {
        
    }
    
}
