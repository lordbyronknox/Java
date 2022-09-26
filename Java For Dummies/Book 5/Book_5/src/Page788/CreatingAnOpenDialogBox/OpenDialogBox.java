/*

 */
package Page788.CreatingAnOpenDialogBox;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author byron
 */
public class OpenDialogBox {

    JFileChooser fc = new JFileChooser();
    int result = fc.showOpenDialog(this);

    public static void main(String[] args) {
       

    }

}

public class javaFilter extends javax.swing.filechooser.FileFilter 
{

    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }
        String name = f.getName();
        if (name.matches(".*\\.java")) {
            return true;
        } else {
            return false;
        }
    }

    public String getDescription() {
        return "Java files (*.java)";
    }
}
