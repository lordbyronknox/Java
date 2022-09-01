/*
Create a class that implements Runnable
 */
package Page481.CreatingAClassThatImplementsRunnable;

/**
 *
 * @author byron
 */
public class LaunchEvent implements Runnable        //LaunchEvent implements Runnable interface.
{
    private int start;                              //private fields to store the constructors parameters.
    private String message;
    
    public LaunchEvent(int start, String message)   //constructor: parameters are - countdown time that event fires, 
    {                                               //                             - msg displayed when time arrives.
        this.start = start;
        this.message = message;
    }
    
    public void run()                               //run() method: uses Thread.sleep() to wait for desired time, before
    {                                               // before displaying the message.
        try
        {
            Thread.sleep(20000 - (start * 1000));   //the length of time the thread should sleep: 20 000 = 20 seconds
        }                                           //(start * 1000) = desired start time
        catch (InterruptedException e)              //so if you set the start time to 6sec (6000ms), the thread sleeps for 14 000ms. 
        {}           
        
        System.out.println(message);                //when the thread wakes up the message is displayed to console.
    }
    
}
