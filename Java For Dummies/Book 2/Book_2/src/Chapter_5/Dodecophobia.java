//Breaking out of a loop
package Chapter_5;

public class Dodecophobia {

    public static void main(String[] args) {
        int number = 2;
        
        while (number <= 20) {      //changing the condition to 'true' creates an infinite loop.
            if (number == 12)       //...unless it hits a 'break' clause.
            {
                break;
            }
            System.out.println(number + " ");
            number += 2;
        }
        System.out.println();
    }
}
