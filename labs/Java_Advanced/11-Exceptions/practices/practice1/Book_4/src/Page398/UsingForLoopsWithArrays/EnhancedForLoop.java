
package Page398.UsingForLoopsWithArrays;

/**
 *
 * @author byron
 */
public class EnhancedForLoop {
    public static void main(String[] args) {
        
        String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
                          "Friday", "Saturday" };
        
        for (String day : days)             //(variable to assign each element to : array to loop through).
        {
            System.out.println(day);
        }
    }
}
