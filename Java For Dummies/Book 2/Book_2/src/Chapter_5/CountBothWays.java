//Incremet and Decrement in the same loop.
//Note: 
// *    In the initialization expresseion, you cant declare more than one variable.
//      ...which is why the variables are declared before the loop.
// *    In the expression list... you can use assignment statements, increments & decrements,
//      ...method calls, object creation (using 'new').
// *    You can use compound conditions created with boolean operators.
//      [...see countDown on line
package Chapter_5;

public class CountBothWays {

    public static void main(String[] args) {
        int a, b;
        for (a = 1, b = 10; a <= 10; a++, b--) {    //Note: 2 arguments in first and last paramaters
            System.out.println(a + " " + b);
        }

        //countdown
        //uses TWO expressions in the count expression: ?: and count--.
        System.out.println("We are go for launch in T minus ");
        for (int count = 10; count >= 0; System.out.println(
                (count == 8) ? "Ignition sequence start!" : count + "..."), count--);
        
        System.out.println("All engines running!");
        System.out.println("Liftoff! We have liftoff!");
    }

}
