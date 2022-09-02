/*
The previous CountDownApp class works, but the CountDownClock and LaunchEvent threads depend on timing
to coordinate their activities.  After these threads start they run independently of each other. As a result
if you run the program a few times the "Start engines" message sometimes appears before, and sometimes after the
"T minus 6" message.

In this improved version of the app the CountDown class adds a new method, getTime(), that gets the current
time in the countdown. Then the LaunchEvent class checks the countdown time every 10ms and triggers the event 
only when the countdown clock says its time. This version runs consistently.

In addition, it uses an interface as a buffer between the classes. The interface defines a method that gets the 
current status of the clock. Then the CountDownClock class can implement this interface and the LaunchEvent class 
can use any object that implements this interface to get the time.
 */
package Page486.CoordinatingCountDownApplication;

import java.util.ArrayList;
/**
 *
 * @author byron
 */
public class CountDownApp 
{
    public static void main(String[] args) 
    {
        //create CountDownClock object with start time argument of 20
        CountDownClock clock = new CountDownClock(20);          
        
        //ArrayList to store LaunchEvent objects.
        ArrayList<Runnable> events = new ArrayList<>();
        events.add(new LaunchEvent(16, "Flood the pad!", clock));
        events.add(new LaunchEvent(6, "Start engines!", clock));
        events.add(new LaunchEvent(0, "Liftoff!", clock));
        
        //Starts the clock
        clock.start();
        for (Runnable e : events)       //creates threads to run each LaunchEvent object.
            new Thread(e).start();
    }
}

//interface implemented by the CountDownClock class
interface TimeMonitor
{
    int getTime();
}


class CountDownClock extends Thread implements TimeMonitor
{
    private int t;                          //t, used to store current value of the countdown clock... so
                                            // it can be accessed by the constructor, run(), and getTime().
    public CountDownClock(int start)        //constructor. Accepts a start time as argument.
    {                                       //In this case: clock.t = 20
        this.t = start;
    }
    
    public void run()                       
    {
        for (; t >= 0; t--)                 //for loop to test and decrement the t variable.
        {                                   //t variable already initialized so there is no initialization value.
            System.out.println("T minus " + t);
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {}
        }
    }
    
    //getTime() method that returns t.
    public int getTime()
    {
        return t;
    }
}



class LaunchEvent implements Runnable
{
    private int start;
    private String message;
    TimeMonitor tm;
    
    public LaunchEvent(int start, String message, TimeMonitor monitor)
    {
        this.start = start;
        this.message = message;
        this.tm = monitor;        
    }
    
    public void run()
    {
        boolean eventDone = false;
        while (!eventDone)
        {
            try
            {
                Thread.sleep(10);           //10ms sleep - then checks the countdown clock if its time time to execute.
            }
            catch (InterruptedException e)
            {}
            if (tm.getTime() <= start)
            {
                System.out.println(this.message);
                eventDone = true;
            }
        }
    }
}


