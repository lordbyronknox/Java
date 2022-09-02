package Page491.SynchronizingMethods;

public class CountDownClock implements Runnable
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
}
    


