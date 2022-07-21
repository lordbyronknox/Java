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
    


*/


package Chapter_1;

public class Objects {
    
}
