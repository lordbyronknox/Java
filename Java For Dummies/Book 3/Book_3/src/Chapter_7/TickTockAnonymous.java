package Chapter_7;

import java.awt.event.*;
import javax.swing.*;

public class TickTockAnonymous {

    private String tickMessage = "Tick...";
    private String tockMessage = "Tock...";

    public static void main(String[] args) {
        TickTockAnonymous t = new TickTockAnonymous();
        t.go();
    }

    private void go() {
        //create a timer that calls the Ticker class at one sec intervals
        Timer t = new Timer(1000, new ActionListener() {    //anonymous class as 2nd parameter 
            private boolean tick = true;                    // of Timer class constructor.

            public void actionPerformed(ActionEvent event) {
                if (tick) {
                    System.out.println(tickMessage);
                } else {
                    System.out.println(tockMessage);
                }
                tick = !tick;
            }
        }                                                 // } = end of anonymous class body.
         );                                                   // ); = end of Timer constructor parameter list.
        t.start();
        //Display a message box to prevent the program from ending immediately.
        JOptionPane.showMessageDialog(null, "Click OK to exit pragram");
        System.exit(0);
    }
}
