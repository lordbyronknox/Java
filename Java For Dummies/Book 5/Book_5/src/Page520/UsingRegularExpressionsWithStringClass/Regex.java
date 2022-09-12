/*

 */
package Page520.UsingRegularExpressionsWithStringClass;

/**
 *
 * @author byron
 */
public class Regex {
    public static void main(String[] args) 
    {
        String s = "One:Two;Three|Four\tFive";
        String regex = "[:;|\\t]";              //Note: \t has to be written with an escape character: \\t
        String strings[] = s.split(regex);      // and the symbols are surrounded with "[]".
        for (String word : strings)
            System.out.println(word);
    }
    
}
