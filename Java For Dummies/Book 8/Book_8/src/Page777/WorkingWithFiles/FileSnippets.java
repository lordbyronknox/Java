/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Page777.WorkingWithFiles;

import java.io.File;

/**
 *
 * @author byron
 */
public class FileSnippets 
{
    public static void main(String[] args) 
    {
        //create File object, named 'hits.log'.
        File f = new File("hits.log");      
        
        //hard coding file paths requires escape charaters (\)
        String path = "c:\\logs\\hits.log";  
                                            
        //Creating a file
//        File fl = new File(path);
//        fl.createNewFile();

        
        // f.isFile()           check if a file object is a file or directory
        // f.isDirectory()
        // f.getName()          returns a string of file name (without the path)
        /*
        Get array of files contained in a directory:
            File[] files = dir.listFiles();
            for (File f : files)
                System.out.println(f.getName());
        */
    }
}
