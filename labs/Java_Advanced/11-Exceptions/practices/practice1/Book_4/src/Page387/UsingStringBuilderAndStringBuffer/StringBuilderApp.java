
package Page387.UsingStringBuilderAndStringBuffer;

import java.util.Scanner;
/**
 *
 * @author byron
 */
public class StringBuilderApp 
{
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        System.out.println("Enter a string");
        String s = sc.nextLine();                   //assigns the user's input to s.
        StringBuilder sb = new StringBuilder(s);    //create Stringbuilder object, passing s as
                                                    // it's arguement, and assign it to sb.
        
//        int vowelCount = 0;
        
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if ((c == 'A') || (c == 'a')
             || (c == 'E') || (c == 'e')
             || (c == 'I') || (c == 'i')
             || (c == 'O') || (c == 'o')
             || (c == 'U') || (c == 'u')
             )
            {
                sb.setCharAt(i, '*');       //sets the char at index i, to '*'.
            }
        }
        System.out.println();
        System.out.println(s);
        System.out.println(sb.toString());
    }
    
}
