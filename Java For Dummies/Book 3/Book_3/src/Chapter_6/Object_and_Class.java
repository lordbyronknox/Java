/*
OBJECT
The mother of all classes.
All classes inherit from the Object class. (it is imposible to create a class that does not inherit Object).
It provides a set of methods that are available to every java object.


You can specify an object as type Object if you want...
eg.     
Object emp = new Employee();
...but because the compiler doesnt know that 'emp' is an Employee you wont be able to use
the Employee methods.
You would have to cast it to Employee:  ((Employee) emp).setLastName("Smith");

________________________________________________________________________________
toString() method:
Returns a string representation of an object. (By default it returns the Object's name,
and it's hash code.
NOTE: primitives are NOT objects, and so do not inherit from Object.
    int x = 50;
    String s = x.toString();    //error: wont compile.

You could use a wrapper class to create an object from the value, then call toString():
    String s = new Integer(x).toString();   //this works

Wrapper classes also define their own toSTring methods that you could use:
    String s = Integer.toString(x);

Or you could take a shortcut and use string concatination, like this:
    String s = "" + x;


The default of toString() isn't very useful - unless you want to see the hash code.
So you usually override it in your Classes.
eg. see TestToString2
    public class TestToString
{
public static void main(String[] args)
{
Employee emp = new Employee("Martinez",
"Anthony");
System.out.println(emp.toString());
}
}
class Employee
{
private String lastName;
private String firstName;
public Employee(String lastName, String firstName)
{
this.lastName = lastName;
this.firstName = firstName;
}
public String toString()
{
return "Employee["
+ this.firstName + " "
+ this.lastName + "]";
}
}

________________________________________________________________________________
THE EQUALS METHOD
==          --> compares the object references
.equals()   --> compares the objects data/values

so this returns false:
    Employee emp1 = new Employee("Bob", "Smith");
    Employee emp2 = new Employee("Bob", "Smith");
    if(emp1 == emp2)                                //false
    if(emp1.equals(emp2))                           //true

By default the equals() method returns the same thing as ==.  This is why you have
to override the equals() method in your classes.
CRITERIA FOR CREATING A EQUALS() METHOD (assuming that the parameter is named obj):
    1. It must be reflexive. (this code tests if an object is equal to itself)
        if (this == obj)
        return true;

    2. test the non-null rule. (null isnt equal to anything)
        if(this == null)
        return false;

    3. test that obj is of same type as this. (two objects cant be the same if they aren't of the same type).
        if(this.getClass() != obj.getClass())
        return false;

    4. Cast obj to a variable of your class; then compare the fields you want to
        base the return value on, and return the result.
        Employee emp = (Employee) obj;
        return this.lastName.equals(emp.getLastName()) &&
            this.firstname.equals(emp.getFirstName());










 */
package Chapter_6;


public class Object_and_Class {

    
}
