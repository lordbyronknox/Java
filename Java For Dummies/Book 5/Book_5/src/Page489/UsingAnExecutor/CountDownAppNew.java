/*
Using the ScheduledThreadPoolExecutor class. (Broken down and explained below)
Scheduled  - schedule a run of code for a future time.
ThreadPool - create several threads (a pool of threads) at the same time. When you want to run
             some code you grab an available thread from the pool and use it.
Executor   - An executor executes something.  
 */
package Page489.UsingAnExecutor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author byron
 */
public class CountDownAppNew {
    public static void main(String[] args) 
    {
        
        ScheduledThreadPoolExecutor pool = new ScheduledThreadPoolExecutor(25);
        Runnable flood, ignition, liftoff;
        
        flood = new LaunchEventNew("Flood the pad!");
        ignition = new LaunchEventNew("Start engines!");
        liftoff = new LaunchEventNew("Liftoff!");
        
        //for loop spawns 20 different threads, each with its own initial delay (as t is decremented).
        //.schedule() parameters: (<function to execute>, <delay/time till execution>, <unit of time>)
        for (int t = 20; t >= 0; t--)
            pool.schedule(new CountDownClockNew(t), (long) (20 - t), TimeUnit.SECONDS);
        
        //scheduling the flood, ignition and liftoff launch events.
        pool.schedule(flood, 3L, TimeUnit.SECONDS);
        pool.schedule(ignition, 13L, TimeUnit.SECONDS);
        pool.schedule(liftoff, 19L, TimeUnit.SECONDS);
        pool.shutdown();    //initiates a orderly shut down of existing tasks.
    }
    
}
