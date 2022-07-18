//
package Chapter_5;

import java.util.Scanner;

public class GuessingGame {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean keepPlaying = true;
        System.out.println("Let's play a guessing game!");

        while (keepPlaying) {
            boolean validInput;
            int number, guess;
            String answer;
            //pick a random number
            number = (int) (Math.random() * 10) + 1;
            //Get the guess
            System.out.println("\n I'm thinking of a number between 1 and 10.");
            System.out.println("What do you think it is?");

            do {
                guess = sc.nextInt();
                validInput = true;
                if ((guess < 1) || (guess > 10)) {
                    System.out.println("I said between 1 and 10."
                            + " Try again: ");
                    validInput = false;
                }
            } while (!validInput);      //checks if validInput is true - if not, executes 'do' again.

            //check the guess
            if (guess == number) {
                System.out.println("You're right!");
            } else {
                System.out.println("You're wrong! the number was " + number);

                //play again?
                do {
                    System.out.print("\n Play again? (Y or N)");
                    answer = sc.next();
                    validInput = true;
                    if (answer.equalsIgnoreCase("Y")); 
                    else if (answer.equalsIgnoreCase("N")) {
                        keepPlaying = false;
                    } else {
                        validInput = false;
                    }
                } while (!validInput);
            }
            System.out.println("\n Thank you for playing!");
        }
    }
}
