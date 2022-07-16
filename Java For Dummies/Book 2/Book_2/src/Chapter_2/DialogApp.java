//2.4 JOptionPane
// Displays an input dialog box, with prompt, and asigns the string entered by the user
//  to a variable, s.


package Chapter_2;

import javax.swing.JOptionPane;

public class DialogApp {
    
     public static void main(String[] args) {
         String s;
         s = JOptionPane.showInputDialog("Enter an integer: "); //receives input from user as a string.
         int x = Integer.parseInt(s);                           //parses s and returns an integer.
         System.out.println("You entered " + x + ".");
     }
}
