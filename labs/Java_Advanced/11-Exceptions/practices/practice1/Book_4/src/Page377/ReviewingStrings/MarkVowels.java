//Extracting Substrings from a string.

package Page377.ReviewingStrings;

import java.util.Scanner;

public class MarkVowels 
{
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String originalString = s;
        
        int vowelCount = 0;
        
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if ( (c == 'A') || (c == 'a')
              || (c == 'E') || (c == 'e')
              || (c == 'I') || (c == 'i')
              || (c == 'O') || (c == 'o')
              || (c == 'U') || (c == 'u') )
            {
                String front = s.substring(0, i);   //all characters before the vowel
                String back = s.substring(i + 1);   //all characters after the vowel
                s = front + "*" + back;             //s is assigned the new string with the vowel 
                                                    // replaced by a *.
            //Each loops updates the string, until all vowels are *s.
            //eg. originalString = "alibaba" 
            //      1st loop:  s = "*libaba"
            //      2nd loop:  s = "*libaba"
            //      3rd loop:  s = "*l*baba"
            //      and so on....
            }
        }
        System.out.println();
        System.out.println(originalString);
        System.out.println(s);
        
    }
}
