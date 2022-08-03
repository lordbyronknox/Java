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

see TestEquality2.java


________________________________________________________________________________

THE CLONE METHOD
Making an exact copy of an object.

NOTE: this code does not clone, it simply creates two variables that reference the same object.
    Employee emp1 = new Employee("Stewart", "Martha");
    Employee emp2 = emp1;

You can do this: (this sets the second obect's values to the same as the first object).
    Employee emp1 = new EMployee("Stewart", "Martha");
    Employee emp2 = new Employee();
    emp2.setLastName(emp1.getLastName());
    emp2.setFirstName(emp1.getFirstName());
    emp2.setSalary(emp1.getSalary());

The clone method is provided to handle this, but it isn't easy to use so only use it when necessary.
Note:
    the clone() method is provided by the Object class.
    clone() returns an object... so you have to cast it's result when using it in your classes.
    clone() is private... so you have to override it in your classes if you want others to access it.
    
see CloneTest.java


SHALLOW CLONE
You can call the clone() method from Object directly in your clone method. 
(IF ALL THE FIELDS IN YOUR CLASS ARE PRIMITIVES OR STRINGS)
It can automatically create a copy of your object that contains duplicates of all primitive type 
fields, and immutable reference types such as Strings.
1. use the super keyword to class the Object clone method, 
eg. super.clone()
2. Declare that the class supports the Cloneable interface.
3. enclose the super.clone() method in a try/catch statement that catches the
    exception CloneNotSupportedException. (this exception is thrown if you forget to implement
    the Cloneable interface.

eg.
    class Employee implements Cloneable
    {
        // Fields and methods omitted...
        public Object clone()
        {
        Employee emp;
        try
            {
                emp = (Employee) super.clone();
            }
        catch (CloneNotSupportedException e)
            {
            return null; // will never happen
            }
        return emp;
        }
    }


CREATING DEEP COPIES
A clone in which any subobjects within the main object are also cloned.

see CloneTest2.java



________________________________________________________________________________

THE CLASS class
Every class used by a java application is represented in memory by an object
of the Class type. (each different class in an app has only one instance representing it in
the Class object.
Therefor the following is 'true':

    Object o1 = new Employee();
    Object 02 = new Employee();
    if(o1.getClass() == 02.getClass())      //true: both are Employee class.
    ....                                      as they used the Employee() constructor.

eg. To get the class of an object:

    HourlyEmployee emp = new Employee();
    Class c = emp.getClass()

Here the c refers to a Class object for the HourlyEmployee class, NOT the Employee class.

There are many Class methods. The most important ones are:
getName()   - Returns a string representation of the name of a class.
getSuperclass - Returns another Class object representing this Class object's superclass.

Tofind out if an object is of a particular type:
    
    if (emp.getCLass().getName().equals("Employee"))
        System.out.println("This is an employee object);



 */
package Chapter_6;


public class Object_and_Class {

    
}
