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




*/
package Chapter_7;


public class Inner_Classses_Anonymous_Classes_Lamda_Epr {
    
}
