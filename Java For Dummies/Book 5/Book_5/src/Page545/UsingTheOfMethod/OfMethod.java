/*
Using the 'of()' method to create a Date-Time Object.
(each of the Date-Time classes has one or more variations of the of() method).
 */
package Page545.UsingTheOfMethod;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author byron
 */
public class OfMethod 
{
    public static void main(String[] args) 
    {
        //here you supply integers that represent the year, month, and day.
        LocalDate date = LocalDate.of(2014,12,15);
        System.out.println(date);
        
        
        //some of the methods let you specify the month as a month object. (enum)
        LocalDate date2 = LocalDate.of(2014,Month.DECEMBER,15);
        
        //The month enumeration has some methods that can be useful,
        //such as printing the number of days in December.
        //The (false) in length indicates if it should be a leap year.
        System.out.println("December has " + Month.DECEMBER.length(false) + " days.");
    }
    
}
