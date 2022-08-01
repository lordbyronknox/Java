/*
ABSTRACT CLASSES
You can declare a method or an entire class as ABSTRACT.
Which means the method has no body.  It is just a prototype for a method, 
containing: return type, name, list of parameters, and optionally a throw clause.
The syntax is:
                public abstract int hit(int batSpeed);          //note, no curly braces.

A class containing at least one abstract methods must also be declared 'abstract'.
eg. 
    public abstract class Ball
    {
        public abstract int hit(int batSpeed);
    }

An abstract class cant be instanciated. (i.e. Ball b = new Ball();   //cant be done)
Subclasses of an abstract class must provide the implementation for each abstract method in
the abstract class. (i.e. it's methods must override the abstract class's methods).

A private method cant be abstract. (abstract methods must be overridden, and private methods
cant be overridden)

You cant create instances of abstract classes - but you can declare a variable of an abstract type,
and then assign an instance of one of its subclasses to it.

A class cant be both abstract AND final. (final classes cant be subclassed).





*/



package Chapter_5;

/**
 *
 * @author byron
 */
public class Abstract {
    
}
