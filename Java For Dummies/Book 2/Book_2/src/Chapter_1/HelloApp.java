//public (class) = can be accessed by other by other java elements
//class = all java programs are made up of classes - classes contain code that
//          defines the behavior of objects created within it.
//HelloApp = identifier: name of the class.
//public (method) = the method should have public access.
//static =  main methods have to be declared as static. 
//          Static methods are called from classes, not objects, so you can call 
//          it without creating an instance of the class.
//          
//void = does not return a value.
//main = the identifier (name) of the method.
//(String[] args) = the parameters of the main method.


package Chapter_1;

public class HelloApp {
    
    public static void main(String[] args) {
        
        System.out.println("Hello World");
    }
   
}


//STATEMENTS
//Declaration Statements:
//  int 1;
//  String s = "This is a statement";
//  Customer c = new Customer();
//
//Expression Statements:    (perform calculations)
//  i = a + b;
//  salesTax = invoiceTotal * taxRate;
//  System.out.println("Hello");
//
//COMMENTS
//  End-Of-Line:  //text here     Can be placed after or in the middle of code, or on its own line.
//  Traditional:  /* */           Can span multiple lines. Can be used in between code. Cant be nested.
//  JavaDoc:      can be used to create web-based documentation automatically.
//
//OBJECTS
//Creating an object of a class: 
//   ClassName = type for the variable. (Means this variable can hold objects created from this class)
//   variableName = name you give the object.
//   new ClassName() =  'new' tells java to create an object. 'ClassName()' is the CONSTRUCTOR call.
//   
//      ClassName variableName = new ClassName();
//eg.   HelloApp myVariable = new HelloApp();