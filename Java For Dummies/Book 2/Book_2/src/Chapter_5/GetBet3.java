//
package Chapter_5;

import java.util.Scanner;

public class GetBet3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int bank = 1000;
        int bet;
        boolean validBet;        
        System.out.println("You can bet between 1 and " + bank);
        
        do {
            System.out.println("Place your bet: ");
            bet = sc.nextInt();
            validBet = true;
            if ((bet <= 0) || (bet > bank))
            {
                validBet = false;               //change valid bet to false....
                System.out.println("What, are you crazy?!");
            }
        } while (!validBet);    //while validBet is false the loop continues... back to 'do'.
                System.out.println("Your money is good here."); //if validBet is true, this line executes.
    }   
    }
