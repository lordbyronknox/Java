/*
Improving the CountDownApp by using an ArrayList to store the Runnable objects, then starting them using an
advanced for loop.
 */
package Page481.CreatingAClassThatImplementsRunnable;

import Page478.ExtendingTheThreadClass.CountDownClock;
import java.util.ArrayList;

/**
 *
 * @author byron
 */
public class CountDownAppUsingArrayList {

    public static void main(String[] args) {
        Thread clock = new CountDownClock();
        ArrayList<Runnable> events = new ArrayList<>();     //ArrayList to store LaunchEvent objects
        events.add(new LaunchEvent(16, "Flood the pad!"));  //create and add LaunchEvent objects to events ArrayList.
        events.add(new LaunchEvent(6, "Start engines!"));
        events.add(new LaunchEvent(0, "Liftoff!"));
        clock.start();                                      //start the countdown
        
        for (Runnable e : events) {                         //loop through events, create a Thread object for each and pass
            new Thread(e).start();                          //  the element as a parameter, and call start() on each.
        }
    }
}
