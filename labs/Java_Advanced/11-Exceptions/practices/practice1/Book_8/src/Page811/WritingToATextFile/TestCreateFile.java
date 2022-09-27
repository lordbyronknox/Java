/*
Creating a text file on your hard drive.

Inside a try/catch block:
1.  new File(<file name with or without path>)
2.  fileName.createNewFile()

 */
package Page811.WritingToATextFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author byron
 */
public class TestCreateFile 
{
    public static void main(String[] args) 
    {
        try{
        File myFile = new File("C:\\Users\\byron\\Desktop\\Java\\Java\\Java For Dummies\\Book 5\\Book_5\\src\\Page811\\WritingToATextFile\\test.txt");
        if (myFile.createNewFile()) {
            System.out.println("Thumbs up!");
        }
            else {
                    System.out.println("No luck.");
                    }
        }
        catch (IOException e) {
                System.out.println("ERROR");
                e.printStackTrace();
                }
        
    }
}
