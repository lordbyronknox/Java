//catching an arithmetical exception.
package Chapter_8;

import java.util.*;

public class GetInteger {

static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        int i = GetAnInteger();
        System.out.println("You entered " + i);
    }
    
    public static int GetAnInteger() {
        while (true) {
            try {
                return sc.nextInt();
            }
            catch (InputMismatchException e) {
                sc.next();  //next() disposes of the user's input (to prevent an infinite loop).
                System.out.println("That's not an integer. Try again: ");
            }
        }
    }
}
