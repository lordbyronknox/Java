/*
File class: 
The file class is the key to processing files and directories.
A File object represents a single file or directory, that may or may not exist. 
(The file/directory does not actually have to exist on your hard drive).
Creating a File object:
    File f = new File("hits.log");      // (<file name>)
                                        //The file is created in the current directory (usually the
                                        //directory where Java Virtual Machine is started.
Create a new file on the hard drive:
    File f = new File(path);
    if (f.createNewFile())              //.createNewFile() returns boolean to let you know
       ...code here...                  //if the file was successfully created or not. (false if file
                                        // already exists)

Paths class:
Path interface:
Designed to replace the File class.

 */
package Page777.WorkingWithFiles;

import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;

public class FileVisitorDemo 
{

    public static void main(String[] args) 
    {
        //create Path object, using Paths static .get() method, that starts the file tree at c:\Windows\System32.
        Path start = Paths.get("c:\\Windows\\System32"); 
        //Create a FileVisitor object, visitor (which walks through every file in a tree and calling a method
        // you define (myFileVisitor class further down).
        MyFileVisitor visitor = new MyFileVisitor();
        try {
            Files.walkFileTree(start, visitor); //walk through the file tree, beginning at 'start'
        } catch (Exception e) {                 // and using MyFileVisitor object, visitor.
            System.out.println(e.getMessage());
        }
    }

//inner class    
    private static class MyFileVisitor extends SimpleFileVisitor<Path> 
    {
//method to print name of file to console, and return FileVisitResult.CONTINUE
        public FileVisitResult visitFile(Path file, BasicFileAttributes attr) 
        {
            System.out.println(file.toString());
            return FileVisitResult.CONTINUE;
        }
//method which is called every time a file cant be accessed, and prints a error msg.
        public FileVisitResult visitFileFailed(Path file, BasicFileAttributes attr) 
        {
            System.out.println(file.toString() + " COULD NOT ACCESS!");
            return FileVisitResult.CONTINUE;
        }
//method that is called every time a directory cant be accessed, prints error msg.
        public FileVisitResult preVisitDirectoryFailed(Path dir, IOException e) 
        {
            System.out.println(dir.toString() + " COULD NOT ACCESS!");
            return FileVisitResult.CONTINUE;
        }
    }
    
}
