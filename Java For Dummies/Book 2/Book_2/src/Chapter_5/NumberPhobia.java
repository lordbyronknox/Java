//Letting the user decide when the loop should stop, using input.


package Chapter_5;

import java.util.Scanner;
        
        public class NumberPhobia {

            static Scanner sc = new Scanner(System.in);     //assigning a Scanner object to
                                                            // a class variable.
            public static void main(String[] args)
            {
                int number = 2;
                String input;
//                String input = "Y";                     //option 2: set the input to "Y", then...
//                while (input.equalsIgnoreCase("Y")) {   //  evaluate the input in the while loop condition.
                while (true){  
                    System.out.println(number + " ");
                    System.out.print("Do you want to keep counting?" + "(Y or N)");
                    input = sc.next();
                    if (input.equalsIgnoreCase("N"))
                        break;
                    number += 2;
                }
                System.out.println("\nWhew! That was close. \n");
            }
            
}
