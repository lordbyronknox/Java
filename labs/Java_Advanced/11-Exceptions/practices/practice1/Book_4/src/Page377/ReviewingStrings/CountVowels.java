//Extracting characters from a string

package Page377.ReviewingStrings;

import java.util.Scanner;

public class CountVowels {
    
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);    //creates Scanner object & assigns it to sc.
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        
        int vowelCount = 0;
        
        for (int i = 0; i < s.length(); i++)    //s.length() sets end point for loop at string's length.
        {
            char c = s.charAt(i);               //returns a char at index 'i'.
            if ((c == 'A') || (c == 'a')        //checking for vowels, upper & lower case.
             || (c == 'E') || (c == 'e')
             || (c == 'I') || (c == 'i')
             || (c == 'O') || (c == 'o')
             || (c == 'U') || (c == 'u'))
             vowelCount++;                      //increments 'vowelCount if true.
        }
        System.out.println("That string contains " + vowelCount + " vowels.");
        }
    }

