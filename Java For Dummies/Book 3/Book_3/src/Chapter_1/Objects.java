/*
OBJECTS:
* TYPE of an object determines what attributes the object has. (all objects of a
    certain type have the same attributes. (but not necessarily the same values for those attributes).
* The STATE of an object: The combination of the values for all the attributes of an object.
* The INTERFACE of a class is the set of methods and fields it makes public so
    that other objects can access them.

LIFE CYCLE of an OBJECT
* First, the Class must be loaded (into memory) - Java runtime locates the class on disc (.class file)
    and reads it into memory.
    Then java looks for static initializers that initialize static fields (fields that dont belong
    to any particular instance of the class, but belong to the class itself, and is shared by all
    objects created from the class.
    A class is loaded the first time you create an object from the class, or first time you access
    a static field or method of the class. (eg when you run the main method of a class
    the class is initialized because the main method is static.

* An object is created when you use the 'new' keyword.
    To initialize the class, java allocates memory for the object and sets up a reference to
    the object so java runtime can keep track of it. 
    Then java calls the class constructor. (the constructor is responsible for any processing required 
    to initialize the object - initializing variables, opening files or databases, and so on.

* The object lives its life, providing access to it's public methods and fields.

* When its time for the object to die java removes the object from memory, and drops its
    internal reference. The garbage collector takes care ofthis when the object is no longer in use.

WORKING WITH RELATED CLASSES
* INHERITANCE
    An object-orientated technique where one class uses another class as its basis.
    [Base, Superclass, parent class] <-- [Child, derived, sub-class... inherits from Base class]
    The sub-class inherits all the super class's methods and fields.
    You can use the superclass's methods and fields as is, or override them to alter their 
    their behavior.
    Subclasses can still have their own methods and fields, unique to themselves.
    "IS A TYPE OF" relationship. (SoccerBall is-a-type-of Ball)

* INTERFACE
    A set of public method and field declarations that are given a name.
    It does not provide any code that does the work - it only provides the declarations. Then
    the classesthat use it must provide the code to implement the methods and fields.
    It is basically a template for other classes... or like a superclass that only provides the
    declarations of methods and fields.
    A class can only have one base class, but it can implement multiple interfaces.

DESIGNING A PROGRAM WITH OBJECTS
A common way to design a Obj orientated application is to divide it into distinct layers/tiers.
Most common is the 3 layered approach:
    -   Presentation:   The objects in tis layer handle all the direct interaction with the user.
                        HTML pages... Swing pages.... frame classes in a HUI-based app etc.
    -   Logic:          Also known as the 'Business Rules Layer'. (as the objects here are
                        responsible for carrying out the rules that govern the app.
                        The objects here represent the the core objects of the app.
                        For a business-type app this layer includes: Objects that represent
                        business entities (like customers, products, orders, suppliers).
    -   Database:       These objects handle data storage... eg SQL database etc.




*/


package Chapter_1;

public class Objects {
    
}
