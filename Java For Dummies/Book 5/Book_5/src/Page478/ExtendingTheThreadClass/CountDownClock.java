/*
The easiest way to create a thread is to write a class that extends the Thread class. Then, to start a thread,
 create an instance of your thread class and call it's start() method.
Thread is part of the java.language package so you dont have to import it.
 */
package Page478.ExtendingTheThreadClass;

/**
 *
 * @author byron
 */
public class CountDownClock extends Thread {

    public void run()                           //method: called by java when the clock thread has been started.
    {
        for (int t = 20; t >= 0; t--) 
        {        
            System.out.println("T minus " + t); //counts down from 20 to 0.
            try 
            {
                Thread.sleep(1000);             //sleep() method pauses for 1 second every loop.
            } 
            catch (InterruptedException e)      //sleep() throws 'Interupted Exceptions', so the try/catch
            {}                                  // statement handles that - if caught it is ignored.
        }
    }
    
}
