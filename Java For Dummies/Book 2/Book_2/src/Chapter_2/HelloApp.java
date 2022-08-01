package Chapter_2;

//CLASS VARIABLE: 
//A variable that any method in a class can access.
// - must be declared in the body of the class, but OUTSIDE any methods.
// - must include the word 'static', before the 'type'

//INSTANCE VARIABLE: 
//Must be declared IN a class (same as CLASS VARIABLE), but NO 'ststic' keyword. 
//Can only be used with an instance of a class.
//CANT be use in a static method (not even the main method)

//LOCAL VARIABLE:
//A variable declared in the body of a method.
//Can only use the variable within that method. (not visible to other methods in the class).
//NOT given default values. So you cant refer to it if a value hasn't been assigned to it.


//FINAL (i.e. constant)
//Variables can be declared FINAL = value cant be changed after it has been initialized.
//Most FINAL variables are CLASS or INSTANCE variables.
//Syntax:   static final WEEKDAYS = 5;

public class HelloApp {
    
  
  static String helloMessage;       //declaring a class variable.
                                    //...can be assigned a value inside a method. (eg.line 21)
  
/*  String hellomessage  */         //*declaring an instance variable - ERROR! must be inside a class.  
                                    //...but cannot be use in the STATIC method.
public static void main(String[] args) {
        helloMessage = "Hello, World!";         //assigning a value ("hello world") to the class variable.
        System.out.println(helloMessage);       //*instance variable cant be used here.
        
        int i;                                  //Declaring a local variable.
        i = 10;                                 //If i wasn't assigned a value...
        System.out.println("i = " + i);         //...this would return an ERROR - wont compile.
        
       
        int num1 = 3, num2 = 4;                  //Declaring multiple variables on one line.
        
    }
    
  static String helloWorld;     //class variables can be declared at the start, or end of the class.
}
