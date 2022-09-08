/*
Here we create and start the thread object.
 */
package Page478.ExtendingTheThreadClass;

/**
 *
 * @author byron
 */
public class CountDownApp 
{
    public static void main(String[] args) 
    {
        Thread clock = new CountDownClock();    //Instantiate a CountDownClock object and assign it to a Thread variable.
        clock.start();                          //thread started by calling start() method.
    }
}
