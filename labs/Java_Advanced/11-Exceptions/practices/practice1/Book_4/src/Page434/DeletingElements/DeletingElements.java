/*
Removing/deleting elements from an array list
.clear()    -   removes all elements
.remove()   -   removes the element at a specified index.

NOTE: the elements are not actually removed, the REFERENCE to the object is removed from the array list.

*/
package Page434.DeletingElements;

import java.util.ArrayList;
/**
 *
 * @author byron
 */
public class DeletingElements {
    
    public static void main(String[] args) 
    {
        ArrayList <Employee> emps = new ArrayList <Employee>();
        
        //Create employee objects
        Employee emp1 = new Employee("Adams", "Gomez");
        Employee emp2 = new Employee("Taylor", "Andy");
        Employee emp3 = new Employee("Kirk", "James");
        
        //add employee objects to array list.
        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);
        
        //print array list
        for (Employee i : emps)
            System.out.println(i.firstName + " " + i.secondName);
        
        //remove element from array list
        emps.remove(emp3);
//        emps.clear();
        
        System.out.println("\n[emp3 removed from list]");
        for (Employee i : emps)
            System.out.println(i.firstName + " " + i.secondName);
        
    }
}
