/*
You cant use mathematical operators (- + / etc) with dates. 
you can use plus(), minus(), until() methods

ChronoUnit is an enum. The possible values are:
CENTURIES
DAYS
DECADES
ERAS        Indicates wheather the date refers to the Common Era (CE, aka AD) or Before Era (BCE, aka BC)
FOREVER     Represents the largest value that can be represented as a duration.
HALF-DAYS
HOURS
MICROS
MILLENNIA
MILLIS
MINUTES
MONTHS
NANOS
SECONDS
WEEKS
YEARS

 */
package Page552.CalculatingWithDates;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author byron
 */
public class DateCalculator {

    public static void main(String[] args) 
    {
        //add
        System.out.println("Today: " + LocalDate.now());
        System.out.println("Tomorrow: " + LocalDate.now().plusDays(1));     //add day/s to current date
        System.out.println("Next week: " + LocalDate.now().plusWeeks(1));   //add weeks
        System.out.println("Next month: " + LocalDate.now().plusMonths(1)); //add months
        System.out.println("Next year: " + LocalDate.now().plusYears(1));   //add years
        
        //subract
        System.out.println("Next year: " + LocalDate.now().minusDays(4));   //subract days
        
        //find the difference between two dates using until()
        // <firstDate>.until(<secondDate>, <units_of_time>)
        LocalDate date1 = LocalDate.parse("2014-05-16");
        LocalDate date2 = LocalDate.parse("2014-12-15");
        System.out.println(date1.until(date2, ChronoUnit.DAYS));
        
        //calculate number of days till next invoice date. (invoicing done on the 15th of the month).
        LocalDate today = LocalDate.now();                                            //current date
        LocalDate invDate = LocalDate.of(today.getYear(), today.getMonthValue(), 15); //2022-09-15
        if (today.getDayOfMonth() > 15)                                               //if current date is after 15...
            invDate = invDate.plusMonths(1);                                          //...set invoice date to 15 of next month.
        long daysToInvoice = today.until(invDate, ChronoUnit.DAYS);                   //calculate days until next invoice date.
        System.out.println(daysToInvoice + " day/s until next invoice date.");
       
    }
    
}
