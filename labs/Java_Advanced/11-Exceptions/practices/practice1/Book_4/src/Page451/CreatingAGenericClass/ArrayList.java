/*

 */
package Page451.CreatingAGenericClass;

//import java.util.ArrayList;
import Page434.DeletingElements.Employee;


/**
 *
 * @author byron
 */

//The <E> parameter specifies the type of elements that are stored in the list.
// E stands for ELEMENT, and is the recommended parameter type name for any element types
// in a collection.
public class ArrayList<E> 
{
    //Declaring an ArrayList that can hold Employee class objects/elements.
    //So here the FORMAL PARAMETER <E> is <Employee>.
    ArrayList<Employee> empList;
    
    //and here...for example... the <E> is <String> type.
//      ArrayList<String> empList2;
    
    //add() method has the parameter type E... which means it will accept Employee type objects.
    public boolean add(E o)     //E as a parameter type (Here E is Employee).
    {
        return this.add(o);
    }
    
    //use a formal type parameter as a return type
    public E get(int index)     //E as a return type  (Here E is Employee).
    {
        return this.get(index);
    }
}
