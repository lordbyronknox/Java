
package Page401.UsingArraysWithMethods;

/**
 *
 * @author byron
 */
public class GetDaysOfWeek 
{
    public static void main(String[] args) 
    {
        String[] days = DaysOfTheWeek();
        printStringArray(days);
    }
    
    //method to return the days of the week
    public static String[] DaysOfTheWeek()
    {
        String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
                          "Friday", "Saturday" };
        return days;
    }
    
    //method to print the elements of an array of strings.
    public static void printStringArray(String[] strings)
    {
        for (String s : strings)
        {
            System.out.println(s);
        }
    }
}
