//'Exception' = a catch all exception.

package Chapter_8;

import java.util.*;

public class CatchAllExcetion {

    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        try {
            int c = a / b;
        }
        catch (Exception e) {
            System.out.println("Oops, you cant divide by zero.");
        }
    }   
}

//You can also catch multiple exception types:
//list SPECIFIC exception types first... and then (if you use it) EXCEPTION last.
/*

    try {
        // statements that might throw several types of exceptions
        }
    catch (InputMismatchException e) {
        // statements that process InputMismatchException
        }
    catch (IOException e) {
        // statements that process IOException
        }
    catch (Exception e) {
        // statements that process all other exception types
        }


    METHODS OF THE EXCEPTION CLASS:
    There are methods you can use for your exceptions...
    * String getMessage()    : Describes the error in a text message.
    * void printStackTrace() : Prints the stack trace to the standard error stream.
    * String toString()      : Returns a description of the exception. This description
                                includes the name of the exception class followed by a 
                                colon and the getMessage message.

try {
    int c = a / b;
    }
catch (Exception e) {
    System.out.println(e.getMessage());
    }

*/