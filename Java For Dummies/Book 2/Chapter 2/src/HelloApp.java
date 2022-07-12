//Class variables: a variable that any method in a class can access.
// - must be declared in the body of the class, but not in any of the methods.
// - must include the word 'static', before the 'type'

//Instance variable: Must be declared in a class. No 'ststic' keyword. Can only be
//used with an instance of a class.
//U cant use an instance variable in a static method (including the main method)



public class HelloApp {

  static String helloMessage;       //declaring a class variable.
  
/*  String hellomessage  */         //declaring an instance variable - ERROR! must be inside a class.  
    
public static void main(String[] args) {
        helloMessage = "Hello, World!";
        System.out.println(helloMessage);       //instance variable cant be used here.
    }
    
  static String helloWorld;     //class variables can be declared at the start, or end of the class.
}
