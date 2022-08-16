/* stringbuilder class
When you create a stringbuilder type object it maintains a fixed area of memory (called the BUFFER) where
it stores the string value. 
The size of the buffer = capacity. (initially set to length of the string + 16).
The length = the length of the string. (this cant exceed the capacity).
The capacity is automatically increased as needed.
*/

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



/*
STRING BUILDER METHODS

append(primitiveType)   Appends the string representation of the primitive type to the end of
                        the string.
append(Object)          Calls the object’s toString method and appends the result to the end
                        of the string.
append(CharSequence)    Appends the string to the end of the StringBuilder’s string value. The
                        parameter can be a String, StringBuilder, or StringBuffer.
char charAt(int)        Returns the character at the specified position in the string.
delete(int, int)        Deletes characters starting with the first int and ending with the
                        character before the second int.
deleteCharAt(int)       Deletes the character at the specified position.
ensureCapacity(int)     Ensures that the capacity of String-Builder is at least equal to the
                        int value; increases the capacity if necessary.
int capacity()          Returns the capacity of this StringBuilder.
int indexOf(String)     Returns the index of the first occurrence of the specified string. If the
                        string doesn’t appear, returns -1.
int indexOf(String, int) Returns the index of the first occurrence of the specified string, starting
                        the search at the specified index position. If the string doesn’t appear,
                        returns -1.
insert(int, primitiveType)   Inserts the string representation of the primitive type at the point
                             specified by the int argument.
insert(int, Object)     Calls the toString method of the Object parameter and then inserts
                        the resulting string at the point specified by the int argument.
insert(int, CharSequence)   Inserts the string at the point specified by the int argument. The second
                            parameter can be a String, StringBuilder, or StringBuffer.
int lastIndexOf(String)     Returns the index of the last occurrence of the specified string. If the
                            string doesn’t appear, returns -1.
int lastIndexOf(String, int)    Returns the index of the last occurrence of the specified string, starting
                                the search at the specified index position. If the string doesn’t appear,
                                returns -1.
int length()            Returns the length of this string.
replace(int, int, String)       Replaces the substring indicated by the first two parameters with the
                                string provided by the third parameter.
reverse()               Reverses the order of characters
setCharAt(int, char)    Sets the character at the specified position to the specified character.
setLength(int)          Sets the length of the string. If that length is less than the current
                        length, the string is truncated; if it’s greater than the current length, new
                        characters — hexadecimal zeros — are added.
String substring(int)   Extracts a substring, beginning at the position indicated by the int
                        parameter and continuing to the end of the string.
String substring(int, int)      Extracts a substring, beginning at the position indicated by the first
                                parameter and ending at the position one character before the value of
                                the second parameter.
String toString()       Returns the current value as a String.
String trimToSize()     Reduces the capacity of the StringBuffer to match the size of
                        the string.

*/