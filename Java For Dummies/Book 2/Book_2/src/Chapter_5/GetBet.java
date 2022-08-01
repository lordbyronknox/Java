//do while


package Chapter_5;

import java.util.Scanner;

public class GetBet {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int bank = 1000;    //users bank balance.
        int bet;            //the bet entered by the user.
        
        System.out.println("You can bet between 1 and " + bank);
        
        do {
            System.out.println("Enter a bet: ");
            bet = sc.nextInt();
        } while ((bet <= 0) || (bet > bank));
        System.out.println("Your money is good here.");
    }
    
}
