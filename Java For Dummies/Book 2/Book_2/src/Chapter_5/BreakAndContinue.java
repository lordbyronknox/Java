//Using 'break' and 'continue' in a for loop.
package Chapter_5;

public class BreakAndContinue {

    public static void main(String[] args) {

        for (int number = 1; number <= 10; number++) {
            if (number == 4) {
                continue;                   //skips over 4
            }
            if (number == 6) {
                break;                      //breaks out of loop at 6
            }
            System.out.println(number);
        }
    }
}
