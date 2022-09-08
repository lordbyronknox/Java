/*
REGULAR EXPRESSIONS
Also know as regex.
A regular expression is a special type of pattern-matching string. 
Useful for data validation - eg. Making sure users enter properly formatted emails, phone numbers etc...

The below app checks that the user input(3 letter word) matches the following pattern:
starts with: f
contains: a, i, or o
ends with: r

run app and enter the REGULAR EXPRESSION: f[aio]r   ...then any 3 letter word.
 */
package Page507.ReugularExpressionTestProgram;

import java.util.regex.*;
import java.util.Scanner;

public final class Reg {

    static String r, s;
    static Pattern pattern;
    static Matcher matcher;
    static boolean match, validRegex, doneMatching;
    
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
    {
        System.out.println("Welcome to the Regex Tester\n");
        do {
            do {
                System.out.print("\nEnter regex: ");
                r = sc.nextLine();
                validRegex = true;
                try {
                    pattern = Pattern.compile(r);       //compile() compliles user input into a pattern.
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    validRegex = false;
                }
            } while (!validRegex);
            doneMatching = false;
            while (!doneMatching) {
                System.out.print("Enter string: ");
                s = sc.nextLine();
                if (s.length() == 0) {
                    doneMatching = true;
                } else {
                    matcher = pattern.matcher(s);   //Creates a matcher that will match s (input) against pattern.

                    if (matcher.matches()) {
                        System.out.println("Match.");
                    } else {
                        System.out.println(
                                "Does not match.");
                    }
                }
            }
        } while (askAgain());
    }

    private static boolean askAgain() {
        System.out.print("Another? (Y or N) ");
        String reply = sc.nextLine();
        if (reply.equalsIgnoreCase("Y")) {
            return true;
        }
        return false;
    }
}
