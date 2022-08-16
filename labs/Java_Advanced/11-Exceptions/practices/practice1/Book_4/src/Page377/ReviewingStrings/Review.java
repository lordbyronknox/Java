
package Page377.ReviewingStrings;

public class Review {

    public static void main(String[] args) {
        /*
        1. Strings are refernce types, not value types - They hold a reference to
            an object created from the String class.
        2. Strings are marked with quatations "". (chars are marked with apostrophes ''.
            (Note: chars != strings)
        3. Strings are immutable - once a value has been assigned you cant change it.
           Methods that work with strings usually return a new string.

        */
        
        /*The java compiler lets you work with strings as if they are primitive types.
          eg. You can assign a string literal to a string variable: */
        String line1 = "Oh what a beautiful morning";
        
        //concatenate +
        String line2 = line1 + "\nOh what a beautiful day!";        
        // +=
        line2 += "\nI've got a beautiful feeling";
        
        //primitive types are converted to strings when concatenated
        int empCount = 50;
        String msg = "Number of employees: " + empCount;
        
        //primitve wrapper classes have parse methods that convert string types to numeric types:
        String s = "50";
        int i = Integer.parseInt(s);
        
        /* Use .equals() or .equalsIgnoreCase() to compare strings (NOT ==)
           eg.
            if (lastName.equals("Lowe"))
                System.out.println("True");
        */
        
        //Finding the length of a string. (spaces are included as characters).
        String t = "A wonderful day for a neighbour.";
        int len = t.length();
        
        //Making simple string modifications
        String s1 = " Howard Smith ";
        String s2 = s1.toLowerCase();   //returns " howard smith "
        String s3 = s1.toUpperCase();   //returns " HOWARD SMITH "
        String s4 = s1.trim();          //returns "Howard Smith" - removes spaces, front & back.
        
        //Extracting substrings from a string.
        String sb = "Baseball";
        String bb = sb.substring(4);    //returns "ball", starts from index 4 ("b"), to the end.
        String bc = sb.substring(2, 6); //returns "seba", starts at index 2, ends BEFORE index 6.
        
        //Splitting a string. (split() returns an array of strings)
        String address = "1500 N. Third Street:Fresno:CA:93722";
        String[] parts = address.split(":");    //requires that you use an array.
        
        //Replacing part of a string
        String cats = "I love cats";
        String dogs = s.replaceAll("cat", "dog");
        
        //StringBuilder and StringBuffer (these are classes, not methods)
        //* These two methods are exactly the sam, except that Stringbuilder is more efficient
        //  but not safe for threaded applications. So use Stringbuilder, unless working with threaded apps.
        StringBuilder sbuild = new StringBuilder("This is my string");  //create a Stringbuilder object.
        System.out.println(sbuild);
        
        
    }
    
}
