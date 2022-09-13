/*

 */
package Page527.DirectoryListingApplication;

import java.io.File;
import java.util.Scanner;

public class DirList {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
    {
        System.out.print("Welcome to the Directory Lister");
        do {
            System.out.print("\nEnter a path: ");
            
            //get path name from user.
            String path = sc.nextLine();
            
            //path is passed to File class constructor, to create File object
            File dir = new File(path);                      
            
            if (!dir.exists() || !dir.isDirectory()) {      //check if 'dir' exists and points to a directory (not a file)
                System.out.println("\nThat directory doesn't exist.");
            } else {
                System.out.println("\nListing directory tree of:");
                
                //.getPath() method called to display name of path represented by File object 'dir'.
                System.out.println(dir.getPath());  
                
                //listDirectory() method called to list all subdirectories in 'dir'.
                listDirectories(dir, " ");                  
            }
        } while (askAgain());   //askAgain() method returns true while user enters 'Y' and keeps looping.
    }

    
    private static void listDirectories(File dir, String indent)    //indent = " ".
    {
        File[] dirs = dir.listFiles();  //returns an array of File objects in 'dir'.
        for (File f : dirs)             //loop through the array of file objects.
        {
            if (f.isDirectory()) {      //.isDirectory() returns true is file exists, and is a Directory.
                System.out.println(indent + f.getName());  //prints the indent " ", and file name.
                //then .listDirector() is called recursively to to list the content of f. (current directory)
                // and two spaces are added to the indent to show they are subdirectories/files of f.
                //Once f.isDirectory() returns false the loop ends.
                listDirectories(f, indent + "  ");          
            }
        }
    }

    //method to end do/while look by getting user input, Y or N.
    private static boolean askAgain() {
        System.out.print("Another? (Y or N) ");
        String reply = sc.nextLine();
        if (reply.equalsIgnoreCase("Y")) {
            return true;
        }
        return false;
    }
}
