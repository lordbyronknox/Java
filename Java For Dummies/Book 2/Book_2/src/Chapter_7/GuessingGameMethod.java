//7.1 Guessing game, using methods.
package Chapter_7;

import java.util.Scanner;

public class GuessingGameMethod {

    static Scanner sc = new Scanner(System.in);
    
    //class variables must be static if they are going to be accessed by a static method.
    static boolean keepPlaying = true;      //declared as a class variable so main and
                                            // playARound methods can access it.
    public static void main(String[] args) {

        System.out.println("Lets play a guessing game!");

        while (keepPlaying) {
            playARound();
        }
        System.out.println("\n Thank you for playing.");
    }

    public static void playARound() {   //declared as 'static' so the main method can call it.
        boolean validInput;
        int number, guess;
        String answer;

        //pick a random number
        number = (int) (Math.random() * 10) + 1;
        System.out.println("\n I'm thinking of a number between 1 and 10.");

        //get the guess
        System.out.println("What do you think it is? ");
        do {
            guess = sc.nextInt();
            validInput = true;
            if ((guess < 1) || (guess > 10)) {
                System.out.println("I said between 1 and 10! Try again: ");
                validInput = false;
            }
        } while (!validInput);
        //check the guess
        if (guess == number) {
            System.out.println("You're right!");
        } else {
            System.out.println("You're wrong. The number was " + number);
        }

        //play again
        do {
            System.out.println("\n Play again? (Y or N)");
            answer = sc.next();
            validInput = true;
            if (answer.equalsIgnoreCase("Y")) {
            } 
            else if (answer.equalsIgnoreCase("N")) {
                keepPlaying = false;
            } else {
                validInput = false;
            }
        } while (!validInput);
    }
}
