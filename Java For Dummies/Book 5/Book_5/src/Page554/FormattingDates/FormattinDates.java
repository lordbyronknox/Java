/*
Formatting a date/time
DateTimeFormatter class, ofPattern() method, format() method.

Format      pattern Explanation
y           Year (two or four digits, eg yy or yyyy)
M           Month (one or two digits or three or more letters, eg. mm = 09, mmm = Sep )
d           Day of month (such as 1, 28)
H           Hour
m           Minute
s           Second (0 to 59)
h           Clock hour (1 to 12)
a           AM or PM
V           Time zone ID (such as America/Los_Angeles)
z           Time zone name (such as Pacific Daylight Time)

 */
package Page554.FormattingDates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author byron
 */
public class FormattinDates 
{
    public static void main(String[] args) 
    {
        LocalDate today = LocalDate.now();      //output: 2022-09-14
        System.out.println(today);
        
        //To change the format use the DateTimeFormatter class to create an object, and
        // use it's .ofPattern() method to specify the format you would like,
        // then use the .format() method and use the DateTimeFormatter object as the argument.
        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("dd MMM YYYY");
        String formattedDate = today.format(formatter);
        
        System.out.println(formattedDate + "\n");
        
        
        //-------------some examples using a custom method-------------------------
        LocalDateTime now = LocalDateTime.now();
        printDate(now, "YYYY-MM-dd");
        printDate(now, "MM-dd-YYYY");
        printDate(now, "dd MMM YYYY");
        printDate(now, "MMMM d, YYYY");
        printDate(now, "HH:mm");
        printDate(now, "h:mm a");
    }
    
    
    public static void printDate(LocalDateTime date, String pattern)
    {
        DateTimeFormatter f;
        f = DateTimeFormatter.ofPattern(pattern);
        pattern = (pattern + "          ").substring(0, 14);    //substring used to line up output.
        System.out.println(pattern + " " + date.format(f));
    }
    
}
