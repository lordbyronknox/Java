/*
Write to a file using:
new FileWriter(<file name with or without path>)
<fileWriterObject>.write(<"text to write to file">)

 */
package Page811.WritingToATextFile;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author byron
 */
public class TestWriteToFile 
{
    public static void main(String[] args) 
    {
        try
        {
        FileWriter myFileWriter = new FileWriter("C:\\Users\\byron\\Desktop\\Java\\Java\\Java For Dummies\\Book 5\\Book_5\\src\\Page811\\WritingToATextFile\\test.txt");
        myFileWriter.write("Test text to the file we just created.");
        myFileWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.out.println("ERROR");
        }
                
    }
    
}
