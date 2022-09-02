/*
The following creates two threads and executes them WITHOUT syncronization.
The output demonstrates the importance of synchronization.
 */
package Page491.SynchronizingMethods;


import java.util.concurrent.ScheduledThreadPoolExecutor;


public class NotSynchronized {

    ScheduledThreadPoolExecutor pool = new ScheduledThreadPoolExecutor(2);
    CountDownClock clock = new CountDownClock(20);

    public static void main(String[] args) 
    {
        new NotSynchronized();
    }

    NotSynchronized() {
        pool.execute(clock);
        pool.execute(clock);
        pool.shutdown();
    }
}
