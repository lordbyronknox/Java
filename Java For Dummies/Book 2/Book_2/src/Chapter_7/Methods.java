//METHODS
// public static return-type method-name (parameters)
//
//  PUBLIC: available to all classes defined in your program.
//  STATIC: you can call this method without first creating an instance of the class
//          in which it's defined.
//          The main method, and any other method in the main methods class should be static. (usually).
//  RETURN-TYPE (eg void, int etc): the value's type that is returned. Void if nothing. otherwise
//              It can be a primitive type (long, float, boolean, char etc),
//              a reference type (eg String), or a class you created.
//  METHOD NAME: preferably something descriptive, like DistanceCalculator.
//  PARAMETER LIST: (listed in parentheses. 
//  METHOD BODY: one or more java statements enclosed in a set of braces {}.


package Chapter_7;

public class Methods {

    public static void main(String[] args) {
        sayHello();
    }
    
    public static void sayHello() {
        System.out.println("Hello!");
    }
}
