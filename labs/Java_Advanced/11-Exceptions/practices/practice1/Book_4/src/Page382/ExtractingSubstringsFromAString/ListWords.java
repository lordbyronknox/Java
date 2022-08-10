// .split() requires you to use an array, as it slits a string into an array of strings,
//  at a specified deliminator.

package Page382.ExtractingSubstringsFromAString;

import java.util.Scanner;

public class ListWords {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String[] word = s.split("\\s+");        // "\\s+" splits the string at any white-space character.
        
        for (String w : word)                   //loops through the array and prints each element.
            System.out.println(w);
    }
}
