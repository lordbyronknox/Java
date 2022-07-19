//7.3 Methods with parameters
package Chapter_7;

import java.util.Scanner;

public class GuessingGame3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Let's play a guessing game!");
        
        do {
            playARound(1, getRandomNumber(7, 12));
        } 
        while (askForAnotherRound("Try again?"));
        
        System.out.println("\nThank you for playing!");
    }

    public static void playARound(int min, int max) {
        boolean validInput;
        int number, guess;
        String answer;

        //pick a random number
        number = getRandomNumber(min, max);
        //get the guess
        System.out.println("\nI'm thinking of a number between " + min
                + " and " + max + ".");
        System.out.println("What do you think it is? ");
        guess = getGuess(min, max);

        //check the guess
        if (guess == number) {
            System.out.println("You're right!");
        } else {
            System.out.println("You're WRONG! \nThe number was " + number);
        }
    }

    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static int getGuess(int min, int max) {
        while (true) {
            int guess = sc.nextInt();
            if ((guess < min) || (guess > max)) {
                System.out.print("I said BETWEEN " + min + " and " + max + ". \n"
                        + "Trt again: ");
            } else {
                return guess;
            }
        }
    }

    public static boolean askForAnotherRound(String prompt) {
        while (true) {
            String answer;
            System.out.print("\n" + prompt + " (Y or N)");
            answer = sc.next();
            if (answer.equalsIgnoreCase("Y")) {
                return true;
            } else if (answer.equalsIgnoreCase("N")) {
                return false;
            }
        }
    }
}
