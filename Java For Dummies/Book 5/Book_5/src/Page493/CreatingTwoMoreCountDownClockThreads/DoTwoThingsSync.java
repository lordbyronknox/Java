/*
Here we use the SYNCHRONIZE keyword (in CountDownClockSync's run() method) to ensure 
that only one thread calls the run() method at a time by locking it when in use.
* The synchronize keyword only locks the method it is placed in. Other threads can still
    call other methods of the object.
* Note that synchronizing all your methods will defeat the point of multithreading, so
    only sync the methods that need it.
 */
package Page493.CreatingTwoMoreCountDownClockThreads;

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class DoTwoThingsSync {

    ScheduledThreadPoolExecutor pool = new ScheduledThreadPoolExecutor(2);
    CountDownClockSync clock = new CountDownClockSync(20);

    public static void main(String[] args) 
    {
        new DoTwoThingsSync();
    }

    DoTwoThingsSync() {
        pool.execute(clock);
        pool.execute(clock);
        pool.shutdown();
    }
}
