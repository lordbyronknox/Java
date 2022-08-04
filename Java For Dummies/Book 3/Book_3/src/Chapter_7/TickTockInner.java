package Chapter_7;

import java.awt.event.*;
import javax.swing.*;

public class TickTockInner 
{
    private String tickMessage = "Tick...";
    private String tockMessage = "Tock...";
    
    public static void main(String[] args)
    {
        TickTockInner t = new TickTockInner();  //Inner class can only be used by an instantiated object.
        t.go();                                 //Calling the go() method, using the new instance.
    }                                           
    
    private void go()
    {
        //create a timer that calls the Ticker class at one sec intervals
        Timer t = new Timer(1000, new Ticker());
        t.start();
        
        //Display a message box to prevent the program from ending immediately.
        JOptionPane.showMessageDialog(null, "Click OK to exit program");
        System.exit(0);
    }
    
    //INNER CLASS
    class Ticker implements ActionListener
    {
        private boolean tick = true;
        
        public void actionPerformed(ActionEvent event)
        {
            if (tick) {
                System.out.println(tickMessage);    //inner class accesses outer classes fields directly.
            }
            else {
                System.out.println(tockMessage);
            }
            tick = !tick;
            }
        }
    }
