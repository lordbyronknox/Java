/*
Using ReentrantLock class's lock() / unlock() methods (instead of 'synchronization')
When a thread gets the lock object, by calling 'lock.lock()' no other threads can get
past the lock, until the first thread reaches the 'lock.unlock()' statement.

Note: there are serveral kinds of 'locks' each with it's own features.
 */
package Page496.Locks;

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class DoTwoThingsLocked {

    ScheduledThreadPoolExecutor pool = new ScheduledThreadPoolExecutor(2);
    CountDownClockLocked clock = new CountDownClockLocked();

    public static void main(String[] args) 
    {
        new DoTwoThingsLocked();
    }

    
    DoTwoThingsLocked() {
        pool.execute(clock);
        pool.execute(clock);
        pool.shutdown();
    }
}
