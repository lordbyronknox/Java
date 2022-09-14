/*
The LocalDate class has methods that let you extract info about a given date.

 */
package Page550.ExtractingInfoAboutADate;

import java.time.LocalDate;

/**
 *
 * @author byron
 */
public class Extract 
{
    public static void main(String[] args) 
    {
        LocalDate date = LocalDate.now();       //current date
                                                //[At time of creatinging this app 2202-09-14, the returns were:]
        int year = date.getYear();              //2022
        int month = date.getMonthValue();       //9
        Enum monthEnum = date.getMonth();       //SEPTEMBER
        int dayM = date.getDayOfMonth();        //14
        int dayY = date.getDayOfYear();         //257
        Enum dayW = date.getDayOfWeek();        //WEDNESDAY
        
        //check how many days into a year a certain date is
        int daysIntoYear = LocalDate.parse("2016-04-09").getDayOfYear();    //100
        
        //To check the number of days in a month or year:
        int daysInMonth = date.lengthOfMonth();
        int daysInYear = date.lengthOfYear();
        
        
        System.out.println("The date today is: " + date);
        System.out.println(year + "\n" + month + "\n" + monthEnum + "\n" + dayM + "\n"
                            + dayY + "\n" + dayW + "\n2016-04-09 is " + daysIntoYear + " into the year.");
        System.out.println("\nDays in month = " + daysInMonth);
        System.out.println("Days in year = " + daysInYear);
        
        
        
        //COMPARING DATES
        //Remember that the equality operators '==' test if two expressions refer to the same object,
        // they do not compare their values.
        if (LocalDate.now() == LocalDate.now())
            System.out.println("All is right in the universe.");
        else
            System.out.println("There must be a disturbance in the space-time continuum!");
        
        //Use the isEquals() method to compare the values of two objects.
        if (LocalDate.now().isEqual(LocalDate.now()))
            System.out.println("All is right in the universe.");
        
        //You can also use the builtin operators (< > etc) with methods that
        // return int.
        if (LocalDate.now().getDayOfMonth() < 15)
            System.out.println("It is not yet the 15th.");
        
    }
    
    
}
