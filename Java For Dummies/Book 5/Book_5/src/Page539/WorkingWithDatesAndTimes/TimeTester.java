/*
App to display the current time using all 10 classes (creating an object of each 
using now().
 */
package Page539.WorkingWithDatesAndTimes;

import java.time.*;
//import java.util.*;

/**
 *
 * @author byron
 */
public class TimeTester {

    public static void main(String[] args) 
    {
        System.out.println("\nLocalTime: " + LocalTime.now().toString());
        System.out.println("\nLocalDateTime: " + LocalDateTime.now().toString());
        System.out.println("\nZonedDateTime: " + ZonedDateTime.now().toString());
        System.out.println("\nOffsetTime: " + OffsetTime.now().toString());
        System.out.println("\nOffsetDateTime: " + OffsetDateTime.now().toString());
        System.out.println("\nMonthDay: " + MonthDay.now().toString());
        System.out.println("\nYearMonth: " + YearMonth.now().toString());
        System.out.println("\nInstant: " + Instant.now().toString());
    }

}
