/*
STATICS
A static method is a method that isn't associated with an instance of a class.
Instead, the method belongs to the class itself. This means you can access a static 
field or method without creating an instance of a class.
You access a static field or method by referencing the class name, not the variable that
references an object.
USES:
-   To provide constants or other values that aren't related to the class instance.
    eg. a 'Billing class' will have a constant named SALES_TAX_RATE that provides the tax rate.
-   To keep track of how many instances of a class have been created.
    eg. In a game, a Ball class may have a static field that keeps track of how many
    balls currently exist. This 'count' doesnt belong to any one instance, but rather the class.
-   In a business app, to keep track of a reference or serial number that's assigned to each
    new object instance.
    eg. An Invoice class might maintain a static field that holds the invoice number that is
    assigned to the next Invoice object created from the class.
-   To provide an alternative way to create instances of the class:
    eg. The getCurrencyInstance that returns an object instance to format numbers in specific
    ways. One reason to use this technique is to create classes that can have only one 
    object instance. (This is called a 'Singleton class'.
-   To provide utility functions that aren't associated with an object at all.
    eg. In the java API library is the Math class, which provides a bunch of static
    methods to do math calculations. 
    Or... you could create a Database class with static methods that perform database operations.

Static fields are declared with the 'static' keyword. It is interchangable with the
visibility keyword:
    private static int ballCount    *Most programmers put the 'visibility' keyword first.
    OR
    static private int ballCount

You CANT use the static keyword within a class method.
FIELDS can be static - local variables CANNOT.
The following example wont compile.

    private void someMethod()
    {
        static int x;
    {


STATIC METHODS
Associated with the class itself, not any object created from the class.
This means they can be called without first creating an object of the class.
The best-know static method is the main method... which is called by java runtime to start an application.
This means applications are run in a static context by default.
RULE: You CANNOT access a nonstatic method or field from a static method. (because the
        static method doesn't have an instance of the class to use to reference instance
        methods or fields.
        eg. The below wont compile:
        
        public class TestClass
        {
            private int x = 5;          //an instance field

            public static void main(String[] args) 
            {
                int y = x;              //error: wont compile
            }
        }

COUNTING INSTANCES
A common use for static variables is to keep track of how many instances of a class have been created.
The following app contains 2 classes:
    CountTest class = keeps track of how many times its constructor is called.
    CountTestApp class = Uses a loop to create 10 instances of the class, displaying
                         the number of of instances that have been createed after creating each instance.
[Note that the instance count is reset to zero ezch time the app is run. SO it only keeps track of 
how many instances have been created during a particular execution of the app]

[****see CountTestApp****]
    


THE SINGLETON PATTERN
A class that you can use to create only ONE instance of.
When you tryu to create an instance, the class first checks to see if an instance exists. If one 
does exist then it uses that instance, otherwise it creates a new one.
eg.

class SingletonClass
{
    private static SingletonClass instance;

    private SingletonClass()
    {}

    public static SingletonClass getInstance()
    {
        if (instance == null)
            instance = new SingletonClass();
        return instance;
    }
}

***************************************
If the below code was run it would return as true, and print "the objects are the same", since 
the first call to 'getInstance()' creates a new instance... whereas the second call finds that
an instance already exists, so a reference to that instance is returned.

SingletonClass s1 = SingletonClass.getInstance();
SingletonClass s2 = SingletonClass.getInstance();
if (s1 == s2)
System.out.println("The objects are the same");
else
System.out.println("The objects are not the same");




PREVENTING INSTANCES
Some classes shouldn't/dont instanciate at all. These classes consist entirely of static
methods and fields.
Math class is a good example. Its methods create utility functions that arent associated
with a particular object.
Other examples - you may create a class with static methods for validating data, or static 
methods to retrieve data from a database. You dont need to create instances of either of these classes.

A simple trick to prevent anyone from instantiating a class:
To create an instance of a class you need a constructor. Just provide a single PRIVATE constructor.
eg. (the Math class uses this technique)

public class Validation
{
    private Validation() {}         //prevents instances
    //static methods and fields go here
}



USING STATIC INITIALIZERS
Initializing = assigning a value to a variable.

eg.

class StaticInit
{
    public static int x;            //declaring
    static {                        //initializing using 'static {-code to be initialized between braces-}'
            x = 32;
            }
    //other class members go here (such as constructors and methods)
}





*/




package Chapter_3;

/**
 *
 * @author byron
 */
public class Statics {
    
}
