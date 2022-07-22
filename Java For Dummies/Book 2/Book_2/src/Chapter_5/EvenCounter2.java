//Do while loop
//executes the statemets before evaluating the 'while condition'.
//This means the statement is always executed at least once.

package Chapter_5;

public class EvenCounter2 {

    public static void main(String[] args) {
        int number = 2;

        do {                
            System.out.println(number + " ");   //execute statement...
            number += 2;
        } while (number <= 20);                 //...then evaluate condition.

        System.out.println();
    }
}
