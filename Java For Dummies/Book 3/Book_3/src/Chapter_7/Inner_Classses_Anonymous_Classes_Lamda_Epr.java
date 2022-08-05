/*INNER CLASSES, ANONYMOUS CLASSES, AND LAMDA EXPRESSIONS.

INNER CLASS
- A class within another class.
- You can declare it 'private', 'public', or 'pritected'. (to determine if other classes
    can access it.
eg.

    class outerClassName
    {
        private class innerClassName
        {
            //body of inner class
        }
    }

- An inner class automatically has access to all fields and methods of it's outer class.
    Including private fields and methods.
- An inner class carries a reference to the current instance of the outer class that
    enables it to access instance data for the outer class.
- Because of the outer class instance reference, you cant create or refer to an inner class
    from an outer class static method. 
    (i.e. An outer class static method cant do anything with an inner class)
    But you can create a static inner class.
- The main reason for creating an inner class is to have a class that only it's outer
    class is interested in. So usually the inner class is PRIVATE, so only the outer class
    can see it.
- If an inner class needs to refer to an instance of the outer class you do so by
    using the name of the outer class, then dot, then this:
    MyOuterClass.this


STATIC INNER CLASSES
- Similar to an inner class but does not require an instance of the outer class.
- Cant access any non-static fields or methods in its outer class.


eg.
    class outerClassName
    {
        private static class innerClassName
        {
            //body of inner class.
        }
    }



ANONYMOUS INNER CLASSES
- A class that is defined where you want to instanciate it.
  You code the body of the class right where you need it, you dont have to give
  it a name. (hence... anonymous).
  
eg.
    new ClassOrInterface() { body }

- You cant create a constructor for an anonymous class (because it doesnt have a name).
- You cant pass parameters if the anonymous class is based on an interface. (interfaces
    dont have constructors, so parameters cant be passed to a constructor).
- An anonymous class is a special type of inner class, so it has access to the
    fields and methods of the outer class automatically.
- Anonomous classes cant be static.




LAMBDA EXPRESSIONS
Similar to anonymous classes, but implements a FUNCTIONAL INTERFACE which has ONE abstract method.
eg.
    interface Ball
    {
        void hit();
    }

eg. of an implementation of the Ball interface:
    () -> { System.out.println("You hit it!); }

- Syntax:
    If you use an expression:   (parameter) -> expression
    If you use a statement:     (parameter) -> { statement;... }

- A functional interface can contain other methods, but they cant be abstract, they must be DEFAULT METHODS.


*/
package Chapter_7;


public class Inner_Classses_Anonymous_Classes_Lamda_Epr {
    
}
