/*
GENERICS
- Generics ensure that only a specified TYPE of object can be added to a collection.



 */
package Page450.Generics;

import Page434.DeletingElements.Employee;
import java.util.ArrayList;

/**
 *
 * @author byron
 */
public class CreatingGenerics {
    
    //Declaring an ARRAYLIST named 'empList', that can only hold objects of
    // Employee type... and assigning a new Arraylist object to it.
    ArrayList<Employee> empList = new ArrayList ();
    
    
    //add() method declares the Employee type, so it will only accept this type of object.
    public boolean add(Employee o)
    {
        //body of the method
        return this.add(o);
    }
 
    
    //get() method declares the Employee type, so it returns Employee objects. So now
    // you dont have to cast the result to Employee as the complier already knows.
    public Employee get(int index)
    {
        return this.get(index);
    }
    
}
