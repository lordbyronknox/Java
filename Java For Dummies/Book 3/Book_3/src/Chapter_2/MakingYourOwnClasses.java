/*
All classes must be defined by a class declaration.
eg. of the most basic form:
    [public] class ClassName {class-body}

[public]  = this class is available to other classes.
class     =
ClassName = identifier... name you give the class.
            - Start with a capital letter. and Capitalize each word.
            - Use nouns wherever posible. (eg Ball, or RetailCustomer)
            - Avoid using the name of a java API class. (eg Scanner, or String, or Math).
                If you do then you have to use fully qualified names when calling
                to tell them apart (eg. java.util.Scanner).
{class-body} = Everything that goes in between the braces {}.
                It can contain the following:
                - Fields: Variable declarations define the public or private fields of a class.
                - Methods: Methods declarations define the methods of the class.
                - Initializers: Stand-alone blocks of code, only run once - when the class is initialized.
                  Two types: static initializer, and instance initializer.
                - Other classes and interfaces:
                    A class can contain another class (called a nested class or innier class).
                    Classes can also contain interfaces.

FIELDS, METHODS, CLASSES, and INTERFACES contained within a class are called MEMBERS of the class.
(Constructors and Initializers are not considered to be members).

PUBLIC classes must be placed in a source file with the same name. eg. Greeter.java
As a result you cant place two public classes in the same file.


MEMEBERS
Memebers of a class are the fields and methods defined in the class body.
- Fields:   [Also known as CLASS VARIABLES]
            A field is a variable that is defined in the body of a class, outside any of the
            class's methods.
            Fields are available to all the methods of the class.
            If the class is PUBLIC, then the fields are available outside the class too.
            Use the PRIVATE keyword if you dont want the field available outside the class.
            eg of a field:
            public int number = 0;
            private String message;
            public final int MAX_SCORE = 100;

- Methods:  
            eg:
            public boolean isActive() 
            {
                return this.isActive;
            }

            Create a private method - cant be used outside the class:
            private void calculate()
            {
                //code that calculates
            }

Visibility:
            Public or private - whether a field pr method can be accessed from outside the class.
            Public Interface (of a class) = the combination of all the members that have public access.
            A class or field that is made public to other classes is sometimes called EXPOSED:
                eg. "the class exposes the isActive method"
            Private fields and methods are sometimes refered to as 'internal members' as they
            can only be used within a class.

Getters and Setters:
            As a general rule you should avoid making public fields. Instead you can make all your fields 
            private and then selectively grant access to the data they contain by 
            adding ACCESSORS. (namely: Get Accessor / Getters and Set Accessor / Setters)
            Getter = Retrieves a field value.
            Setter = Sets a field value.
            eg.
            public class Player
            {
                private int health;
                
                public int getHealth()          //getter
                { return health;}

                public void setHealth(int h)    //setter
                {health = h;}
            }

            * You dont have to create a setter AND a getter.  You could for example create
                only a getter, then other classes could retrieve the property values, but
                not change them.

OVERLOADING METHODS
    A java class can contain more than one method with the same name - as long as they 
    have different parameters.
    The rule of creating overloaded methods is that every method must have a unique signature.
    A method's signature = the combination of it's name and the number and types of parameters
    it accepts.
    eg.
    public void printSomething(int x)...
    public void printSomething(String x)....

    Two things that are NOT a part of a method's signature:
    -   the return type.
    -   the names of the parameters.


CONSTRUCTORS
    A block of code that is called when an instance of an object is created.
    They are similar to methods, except for:
    -   They dont have a return type.
    -   The name of the constructor must be the same as the name of the class.
    -   Constructors are NOT considered to be members of a class.
    -   the 'new' keyword calls the constructor.

    eg. [the bellow is a constructor... which would be inside a Actor class...]
    public Actor(String first, String Last)
    {
        firstName = first;
        lastName = last;
    }

    You would create an instance of the Actor class by calling the constructor:
    Actor a = new Actor("Arnold", "Schwarzenegger")

    You can overload constructors too... (as long as each constructor has a unique signature)
    eg.
    public Actor(String first, String Last, boolean good)
    {
        firstName = first;
        lastName = last;
        goodActor = good;
    }

    Actor a = new Actor("Arnold", "Schwarzenegger", false);

    
CREATING DEFAULT CONSTRUCTORS
    If you don't provide a constructor for your class, a default constructor is provided.
    Default constructors dont accept any parameters, or do anything... other than allow your class
    to be instanciated.

    A constructor can call on another constructor, using the 'this' keyword. (must be on the first line!)
    - Each constructor can only call one other constructor. (but you can chain constructors...
        ...eg. constructor 1 calls constructor 2, constructor 2 calls constructor 3
      You CANT loop them: constructor 1 --calls-- constructor 2 --calls-- constructor 1.




*/

package Chapter_2;

/**
 *
 * @author byron
 */
public class MakingYourOwnClasses {
    
}
