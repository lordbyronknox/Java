/*
JAR FILES   [JAR = Java Archive]
- a single compressed file containing one or more classes
- The entire java API is stored in a single JAR file named 'rt.java'.
- They are created by the jar utility, which is in the Java bin directory.
- It contains a MANIFEST FILE that contains info about the files in the archive.
- JAR files are the normal way to distribute finished java applications, and class libraries.

Basic fotmat of jar command:
    jar options jar-file [manifest-file] class-files...


ARCHIVING A PACKAGE
1. Open a command line in the package's root.
2. Use a jar command that specifies:
    - the option cf
    - the name of the jar file
    - and the path to the class files you want to archive.
      eg:   jar cf utils.jar com\lowewriter\ util\*.class
3. Verify the jar file was created properly using commands that specifies the
    option 'tf', and name of jar file. This lists the content of the jar file.
    eg.     jar tf utils.jar





*/
package Page357.CreatingYourOwnPackages;

/**
 *
 * @author byron
 */
public class Jar_file {
    
}
