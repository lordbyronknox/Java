//Avoid exceptions by testing the data first

package Chapter_8;

import java.util.*;

public class GetInteger2 {

static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        int i = GetAnInteger();
        System.out.println("You enetered: " + i);
    }
    
    public static int GetAnInteger() {
        while (!sc.hasNextInt()) {  //hasNextInt() checks to see if the next value is an int.
            sc.nextLine();                  //nextLine() discards the bad data.
            System.out.println("That's not an integer. Try again: ");
        }
        return sc.nextInt(); //parse data to an integer and return the result.
    }
    
}
