/*
Using the static parse method which creates a date-time object from a string
 */
package Page544.UsingTheParseMethod;

import java.time.*;
import java.time.format.DateTimeParseException;

/**
 *
 * @author byron
 */
public class Parsing 
{
    public static void main(String[] args) 
    {
        LocalDate d = LocalDate.parse("2014-12-15");
        System.out.println(d);
        
        //T seperates the date from the time.
        //Time is represented in 24 hour clock format.
        LocalDateTime dt = LocalDateTime.parse("2014-12-15T15:45");
        System.out.println(dt);
        
        //If the string is not in the correct format the method throws a
        // DateTimeParseException... so use a try/catch block.
                try
                {
                    dt = LocalDateTime.parse("2014-12-15T03:45PM"); //3:45pm should be 15:45.
                }
                catch (DateTimeParseException ex)
                {
                    System.out.println(ex.toString());
                }
        
    }
    
}
