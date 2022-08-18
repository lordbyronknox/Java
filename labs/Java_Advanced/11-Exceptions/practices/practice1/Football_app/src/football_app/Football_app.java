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
public class Football_app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
//        reader("C:\\Users\\byron\\Desktop\\Java\\Java\\labs\\Java_Advanced\\11-Exceptions\\practices\\practice1\\Football_app\\src\\football_app\\scores.txt");
       String[] collection = reader("C:\\Users\\byron\\Desktop\\Java\\Java\\labs\\Java_Advanced\\11-Exceptions\\practices\\practice1\\Football_app\\src\\football_app\\scores.txt").split(",");
       for (String i : collection) 
       System.out.println(i);
 
   }
    
    //method that reads from text file. public static void main(String[] args) 
    {
        
//        reader("C:\\Users\\byron\\Desktop\\Java\\Java\\labs\\Java_Advanced\\11-Exceptions\\practices\\practice1\\Football_app\\src\\football_app\\scores.txt");
       String[] collection = reader("C:\\Users\\byron\\Desktop\\Java\\Java\\labs\\Java_Advanced\\11-Exceptions\\practices\\practice1\\Football_app\\src\\football_app\\scores.txt").split(",");
       for (String i : collection) 
       System.out.println(i);
 
   }
    public static String reader(String filePath)
    {
        try 
        {
        File txtFile = new File(filePath);
        Scanner fileReader = new Scanner(txtFile);
               
        while (fileReader.hasNextLine()) {
           String data = fileReader.nextLine();
//            System.out.println(data);
            return data;
        }
        fileReader.close(); 
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return null;
        
    }
}
