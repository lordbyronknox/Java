/*
Using the wildcard '?' as a formal parameter.

In the below example the addItems method does not accept String type objects as arguements,
even though String class is a subclass of the Object class.
Inheritance does not work this way with FORMAL TYPE PARAMETERS.  You must use a 
feature of GENERICS called wildcards.
eg.
    public void addItems(ArrayList<Object> list)
    {
        //body of method
    }

    addItems(new ArrayList<String>());

-----------------------------------------------------
The below example accepts any type of ArrayList as an argument.
Eg.
    public void addItems(ArrayList<?> list)

-----------------------------------------------------
This example uses the wildcard and extends...
If you have an Employee class, and two classes that inherit from Employee (SalaryEmployee
and WageEmplyee), and you want the addItem method to accept an ArrayList of Employee objects,
SalaryEmployee objects, and wageEmployee objects.

<? extends Employee> states that this method will accept Employee class objects, AND
any object from a class that inherits from Employee.

eg.
public void addItems(ArrayList<? extends Employee> list)

-------------------------------------------------------
If the addItems method appears in a GENERIC class that uses the FORMAL PARAMETER <E>
to specify the type of elements the class accepts... And you want your method to accept
an ArrayList of type <E> or any of its subclasses...

eg.
public void addItems(ArrayList<? extends E> list)

 */
package Page457.UsingWildcardTypeParameters;
import java.util.ArrayList;
/**
 *
 * @author byron
 */
public class WildCard<E> 
{
    public void addItems(ArrayList<? extends E> list)
    {
        this.addItems(list);
    }
}
