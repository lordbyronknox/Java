//SWITCH STATEMENT: Using strings in the expressions.
//i.e. 'SUPER' instead of 'A'.

package Chapter_6;

import java.util.Scanner;
public class CarWashStringApp {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("The Car Wash Application\n\n");
        System.out.print("Enter the package code: ");
        String s = sc.next();
        
        String details = "";
        
        switch (s.toUpperCase())
        {
            case "PRESIDENTIAL":
                details = "\tNew Car Scent, plus ... \n";
            case "ELITE":
                details += "\tTire Treatment, plus ... \n";
            case "DELUXE":
                details += "\tLeather/Vinyl Treatment, plus ... \n";
            case "SUPER":
                details += "\tWax, plus ... \n";
            case "STANDARD":
                details += "\tWash, vacuum, and hand dry.\n";
                break;
            default:
                details = "That's not one of the codes.";
                break;
        }
        System.out.println("\n That package includes: \n" + details);
    }
    
}
