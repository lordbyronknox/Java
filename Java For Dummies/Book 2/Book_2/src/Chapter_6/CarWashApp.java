//6.3 Leaving out the 'break' in a switch statement.

package Chapter_6;

import java.util.Scanner;

public class CarWashApp {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("The car wash application! \n\n");
        System.out.print("Enter the package code: ");
        String s = sc.next();
        char p = s.charAt(0);
        
        String details = "";
        
        switch (p)
        {
            case 'E':
            case 'e':
                details += "\t New car scent, plus ... \n";
            case 'D':
            case 'd':
                details += "\t Tyre treatment, plus... \n";
            case 'C':
            case 'c':
                details += "\t Leather treatment, plus... \n";
            case 'B':
            case 'b':
                details += "\t Wax, plus... \n";
            case 'A':
            case 'a':
                details += "\t Wash, vacuum, and hand dry. \n";
                break;
            default:
                details = "That's not one of the codes";
                break;
        }
        System.out.println("\n That package includes: \n" + details);

    }
}
