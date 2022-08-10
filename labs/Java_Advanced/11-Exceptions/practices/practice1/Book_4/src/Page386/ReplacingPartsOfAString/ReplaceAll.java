// .replaceAll()    replaces one part of a string with another.

package Page386.ReplacingPartsOfAString;

import java.util.Scanner;
/**
 *
 * @author byron
 */
public class ReplaceAll 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        
        s = s.replaceAll("cat", "dog");     //first parameter: to be removed.
                                            //second parameter: and replaced with.
        System.out.println(s);
    }
    }
