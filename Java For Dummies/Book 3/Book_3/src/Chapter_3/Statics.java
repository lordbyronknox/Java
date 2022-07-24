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









*/
package Chapter_3;

/**
 *
 * @author byron
 */
public class Statics {
    
}
