//2.3
//Scanner: reads an int value from the user and displays it in console.



package Chapter_2;

import java.util.Scanner;

public class ScannerApp {
    static Scanner sc = new Scanner(System.in); //create a class variable and assigning it a object.
                                                //(System.in) = standard keyboard console input.
    public static void main(String[] args) {
        
        System.out.print("Enter an integer: ");
        int x = sc.nextInt();           //nextOnt() = reads an int value from the user, & assigns it to x.
        System.out.println("You entered " + x + ".");
        
       
    }
}
