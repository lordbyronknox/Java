/*
JAR FILES   [JAR = Java Archive]
- a single compressed file containing one or more classes
- The entire java API is stored in a single JAR file named 'rt.java'.
- They are created by the jar utility, which is in the Java bin directory.
- It contains a MANIFEST FILE that contains info about the files in the archive.
- JAR files are the normal way to distribute finished java applications, and class libraries.

Basic format of jar command:
    jar options jar-file [manifest-file] class-files...


CREATING A JAR FILE
1. Right click the project
2. Properties... packaging...
3. Check 'Build JAR after Compiling' and 'Compress JAR file'.
4. click OK.
5. Right click on project name, and select 'Clean and Build'. 


ARCHIVING A PACKAGE

Using Netbeans:
1. Right click the project.
2. Select 'clean and build'

Using command line:
1. Open a command line in the package's root.
2. Use a jar command that specifies:
    - the option cf
    - the name of the jar file
    - and the path to the class files you want to archive.
      eg:   jar cf utils.jar com\lowewriter\ util\*.class
3. Verify the jar file was created properly using commands that specifies the
    option 'tf', and name of jar file. This lists the content of the jar file.
    eg.     jar tf utils.jar



JAVADOCS
Using Netbeans:
1. right click the project
2. Select 'Generate javadoc'
(a page will open in a browser displaying the docs)

To view the docs for a class/method etc...
Select the element... then 'ctrl + shift + space'.  A pop-up window will display
the docs for that element.



MODULES
A module is a way of grouping classes (similar to packages) in a way that explicitly lists
which modules the module depends on, and what public types (classes and interfaces) within
the classes are to be made available to other modules.
I.e. It must list it's dependencies, and visibilities of any packages contained within the module.

Creating a module:
1. Right click the PROJECT.
2. PROPERTIES
3. LIBRARIES....
4. ...click the various tabs (Compile, run... etc) to set the ModulePath as required.


Creating a modular jar file


*/
package Page357.CreatingYourOwnPackages;

/**
 *
 * @author byron
 */
public class Jar_file {
    
}
