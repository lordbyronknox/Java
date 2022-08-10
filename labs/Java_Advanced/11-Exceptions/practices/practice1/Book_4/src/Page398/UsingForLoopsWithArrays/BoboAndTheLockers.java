
package Page398.UsingForLoopsWithArrays;

/**
 *
 * @author byron
 */
public class BoboAndTheLockers 
{
    public static void main(String[] args)
    {
        //true = open; false = closed
        boolean[] lockers = new boolean[1001];
        
        //close all lockers
        for (int i = 1; i <=1000; i++)
            lockers[i] = false;
        
        for (int skip = 1; skip <= 1000; skip++)
            {
                System.out.println("Bobo is changing every " + skip + " lockers.");
                //inner loop incrementing by outer loop's 'skip' value. 
                //(ie. loops through all lockers skiping every 1, then every 2, and so on. 
                for (int locker = skip; locker < 1000; locker += skip)   
                    lockers[locker] = !lockers[locker];                 //reverses the lockers value
            }                                                           // true to false, and false to true.
            System.out.println("Bobo is bored now so he's going home");
            
            //count the list of open lockers.
            String list = "";
            int openCount = 0;
            for (int i = 1; i <= 1000; i++)
                if (lockers[i])
                {
                    openCount++;
                    list += i + " ";
                }
            System.out.println("Bobo left " + openCount + " lockers open.");
            System.out.println("The open lockers are: " + list);
    }
    
    
}
