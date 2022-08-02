/*
INTERFACES
Similar to abstract classes, but can only include abstract methods and final fields.
And an interface cant be used as a base class. A class implements an interface by providing code
for each of the interface's methods.
A class can only inherit one other class, but it can implement multiple interfaces.

Here's an example of an interface with one method:

public interface Playable
    {
        void play();
    }

- Any class that implements this interface must provide the implementation (the code) for
    a play() method, with no parameters, and must not return anything (void).
- An interface must be declared as PUBLIC, so other classes can use it.
- It must be in a file with the same name. (i.e. Playable.java).
- Interface names are usually ADJECTIVES, often ending in '...able'. (classes implementing the interface Playable 
    represent objects that can be played).
- All methods in an interface are assumed to be PUBLIC and ABSTRACT... so are usually not declared as such
    in the interface. 
    eg. void play()     //not public or abstract declaration.
- A class that implements an interface must specify an 'implements' clause:
    eg.     public class TicTacToe implements Playable 
            {
                //additional fields and methods go here.

                public void play()
                {
                    //code for the play() method goes here.
                }
            }
- Implementing multiple interfaces:
    public class TicTacToe implements Playable, CardGame, DiceRoll {....

- Implementing interface and inheriting:
    public class TicTacToe extends Game implements Playable, CardGame {....

- An interface is a kind of TYPE, just like a class.  So you can use an interface as a
    type for variable, parameter, or method return value.
    eg.
    Playable game = getGame();      //getGame() returns an object that implements the Playable interface.
    game.play();                    //calls the object's play() method.


ADDING FIELDS TO AN INTERACE
- Interface fields are use to provide constant values that are related to the interface.
- Interface fields are automatically assumed to be PUBLIC, STATIC, and FINAL. (You dont have to
    include these keywords if you dont want to).
eg.
    public interface GolfClub
    {
        int DRIVER = 1;             
        int SPOON = 2;
        int PUTTER = 3;
    }

- Interfaces can EXTEND other interfaces.  (subinterface extends the superinterface)
    Any class that implements the PlayableBall interface must provide the implementation for
    throwBall(), catchBall(), kickBall(), and dropBall().  
    NOTE: catchBall() has the same signature in both interfaces so it is only included once 
    in the PayableBall interface.
eg.
public interface ThrowableBall
{
    void throwBall();
    void catchBall();
}

public interface KickableBall
{
    void kickBall();
    void catchBall();
}

public interface PlayableBall extends ThrowableBall, KickableBall
{
    void dropBall();
}


USING INTERFACES FOR CALLBACKS
Callback: A programming technique where an object (call it 'object A') lets a second object (object B) 
know it should call object A's method whenever a certain event happens (like a mouse click).
Object A = event listener
Object B = event source
The listener object must implement the ActionListener interface, which defines a method called
actionPerformed thats called for each timer event.


MARKER INTERFACE PATTERN
An interface that has no members.  It serves only to identify a class as belonging to a 
set of classes that posses some capability or characteristic.
eg. is the Cloneable interface, which marks classes that can be cloned.

DEFAULT METHODS
If you need to add a method to a interface after it is already being implemented by
one or more classes, instead of adding the method to the interface and then adding it
to all the classes implementing it too.... you can use the DEFAULT METHOD.
The DEFAULT METHOD provides code to any classes that implement the interface but do
not provide the implementation themselves.
The default method provides code that will be used if the class implementing the interface
does not provide itself.

eg.
    interface Payable
    {
        void play();            //method that was in the interface originally.
        default void quit()     //method added at a later stage.
        {   
            System.out.println("You have quit!");
        }
    }





 */




package Chapter_5;



public class Interfaces {

    
}

