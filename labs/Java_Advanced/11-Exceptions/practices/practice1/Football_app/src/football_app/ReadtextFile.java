/*

 */
package football_app;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author byron
 */
public class ReadtextFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        System.out.println(reader("C:\\Users\\byron\\Desktop\\Java\\Java\\labs\\Java_Advanced\\11-Exceptions\\practices\\practice1\\Football_app\\src\\football_app\\scores.txt"));
        
        for (String i : reader("C:\\Users\\byron\\Desktop\\Java\\Java\\labs\\Java_Advanced\\11-Exceptions\\practices\\practice1\\Football_app\\src\\football_app\\scores.txt"))
            System.out.println(i);
            
            }
    
    //method that reads from text file.
    public static List<String> reader(String filePath)
    {
        try 
        {
        File txtFile = new File(filePath);
        Scanner fileReader = new Scanner(txtFile).useDelimiter(",\\\\s*");
        List<String> listOfStrings = new ArrayList<String>();
        String data;
               
        while (fileReader.hasNextLine()) {
           data = fileReader.next();
           listOfStrings.add(data);
        
        }
//        for (String i : listOfStrings)
//            System.out.println(i);
        return listOfStrings;
//        fileReader.close(); 
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return null;
        
    }
}
