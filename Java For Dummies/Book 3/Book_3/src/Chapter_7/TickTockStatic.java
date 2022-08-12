package Chapter_7;

import java.awt.event.*;
import javax.swing.*;

public class TickTockStatic {

    private static String tickMessage = "Tick...";  //declared as static, so the 
    private static String tockMessage = "Tock...";  // static class can access it.

    public static void main(String[] args) {
        TickTockStatic t = new TickTockStatic();    //create an object so it can access the inner class.
        t.go();
    }

    private void go() {
        //create a timer that calls the Ticker class at one sec intervals
        Timer t = new Timer(1000, new Ticker());
        t.start();

        //Display a message box to prevent the program from ending immediately.
        JOptionPane.showMessageDialog(null, "Click OK to exit pragram");
        System.exit(0);
    }

    static class Ticker implements ActionListener {     //Declared as static. So it can only access
                                                        // static fields.
        private boolean tick = true;

        public void actionPerformed(ActionEvent event) {
            if (tick) {
                System.out.println(tickMessage);
            } else {
                System.out.println(tockMessage);
            }
            tick = !tick;
        }
    }
}
