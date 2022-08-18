/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package football_app;

// import necessary packages
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class GFG {
    // include throws to handle some file handling exceptions
    public static void main(String[] args)
        throws IOException
    {
        // arraylist to store strings
        List<String> listOfStrings
            = new ArrayList<String>();
       
        // load content of file based on specific delimiter
        Scanner sc = new Scanner(new FileReader("C:\\Users\\byron\\Desktop\\Java\\Java\\labs\\Java_Advanced\\11-Exceptions\\practices\\practice1\\Football_app\\src\\football_app\\scores.txt"))
                         .useDelimiter(",\\s*");
        String str;
       
        // checking end of file
        while (sc.hasNext()) {
            str = sc.next();
           
            // adding each string to arraylist
            listOfStrings.add(str);
        }
       
        // convert any arraylist to array
        String[] array
            = listOfStrings.toArray(new String[0]);
       
        // print each string in array
        for (String eachString : array) {
            System.out.println(eachString);
        }
    }
}