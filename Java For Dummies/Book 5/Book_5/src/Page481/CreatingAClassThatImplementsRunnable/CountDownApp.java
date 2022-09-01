/*
CountDownApp    VERSION 2

 */
package Page481.CreatingAClassThatImplementsRunnable;

import Page478.ExtendingTheThreadClass.CountDownClock;

/**
 *
 * @author byron
 */
public class CountDownApp 
{
    public static void main(String[] args) 
    {
        Thread clock = new CountDownClock();                //Create an instance of CountDownClock class & assign it to clock.
        Runnable flood, ignition, liftoff;                  //Declare Runnable class variables.
        flood = new LaunchEvent(16, "Flood the pad!");      //create LaunchEvent object, set sleep() till 16 seconds
        ignition = new LaunchEvent(6, "Start engines!");    //...sleep till 6 seconds
        liftoff = new LaunchEvent(0, "Liftoff!");           //...sleep till 0 seconds
        clock.start();                                      //call clock's start() method to start the countdown.
        new Thread(flood).start();                          //Start the 3 LaunchEvent objects as threads by creating new
        new Thread(ignition).start();                       // instances of Thread class and passing the LaunchEvent objects
        new Thread(liftoff).start();                        // as parameters to the Thread constructor... then calling start().
    }                                                       //NOTE: as this program doesnt have to do anything with these
}                                                           // threads after they've started, they aren't saved to variables.
