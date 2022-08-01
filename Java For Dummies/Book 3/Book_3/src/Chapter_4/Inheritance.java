/*
INHERITANCE:




FINAL
- FINAL VARIABLE: 
-               Making a variable 'final' makes it a constant - value cant be changed once assigned.
- FINAL METHODS: 
-               cant be overridden by a subclass.
-               You should avoid using final methods unless you have a good reason to.
-               Final methods execute more efficiently (slightly better performance than non-final methods)
-               Private methods are automatically considered FINAL because you cant override a method you cant see.
- FINAL CLASSES: 
-               Cant be used as a base class.
-               All its methods are considered final too.

- eg. FINAL METHOD
    public class Spaceship 
    {
        public final int getVelocity() {
            return this.velocity;
        }
    }

- eg. FINAL CLASS
    public final class Baseball
    {
        //members for Baseball class go here
    }


CASTING UP AND DOWN
- An object of a derived type can be treated as though it were an object of the base type.
  Baseball class -extends-> Ball Class.   So a Baseball object can be treated as a Ball object.
  So thsi is allowed:   
                    Ball b = new Baseball();
  Here an object of type Baseball is created, and a reference to this object is assigned to 
  variable 'b'.... whose type is Ball.
  This is 'UPCASTING', and it is done automatically by java.

  Casting down is not done automatically - you have to explicitly cast the type:
  eg.

    public void toss(Baseball b);

The following WONT compile:

    Ball b = new Baseball();
    toss(b);                    //the toss() method expects an argument of type Baseball.
 
You must cast the type to use the method:

    Ball b = new Baseball();
    toss((Baseball) b);


DETERMINE AN OBJECT'S TYPE
use the 'instanceof' operator:
eg.
    if (emp instanceof SalariedEmployee) {
        msg = "Salary employee.";
    }
    else {
    msg = "Not salary employee";
    }



*/
package Chapter_4;


public class Inheritance {
    String test = "test";
}
