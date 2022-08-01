//7.2 
package Chapter_7;

import java.util.Scanner;

public class GuessingGame2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Let's play a guessing game");

        do {
            playARound();
        } while (askForAnotherRound());
        System.out.println("\n Thank you for playing!");
    }

    public static void playARound() {
        boolean validInput;
        int number, guess;
        String answer;

        //pick a random number
        number = getRandomNumber();

        //get the guess
        System.out.println("\n I'm thinking of a number between 1 and 10.");
        System.out.print("What do you think it is? ");
        guess = getGuess();

        //check the guess
        if (guess == number) {
            System.out.println("You're right!");
        } else {
            System.out.println("You are WRONG! \nThe number was " + number);
        }
    }

    public static int getRandomNumber() {
        return (int) (Math.random() * 10) + 1;
    }

    public static int getGuess() {
        while (true) {
            int guess = sc.nextInt();
            if ((guess < 1) || (guess > 10)) {
                System.out.print("I said between 1 and 10! \n Try again... : ");
            } else {
                return guess;
            }
        }
    }

    public static boolean askForAnotherRound() {
        while (true) {
            String answer;
            System.out.println("\n Play again? (Y or N");
            answer = sc.next();
            if (answer.equalsIgnoreCase("N")) {
                return false;
            }
        }
    }
}
