//1.4
package Chapter_1;

import javax.swing.JOptionPane;
//if you dont import, as above, line 11 would look like this:
// javax.swing.JOptionPane.show......

public class Greeter2 {

//    public static void main(String[] args) {
    
    public void sayHello() {
        JOptionPane.showMessageDialog(null, "Hello, World!", "Greeter",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
