//EXCEPTIONS
//objects that are created when an error occurs in a java program.
//When an exception object is created, java is said to have 'thrown and exception'.
//Exceptions are thrown back to the statement that caused the exception. The statement can 
//  either 'CATCH' the exception, or leave it for the method that called the method.
//  If the exception isn't caught the by the program, the program ends abruptly and 
//  a message is displayed on the console.
//TWO basic types of exceptions are:
//      CHECKED: an exception that the complier requires you to provide for, or it wont compile.
//      UNCHECKED: an exception you can provide for, but dont have to.

//Some typical exceptions:  
//      IllegalArguimentException: you passed an incorrect argument to a method.
//      InputMissmatchException: The console input doesnt match the data type
//                                  expected by the method of the Scanner class.
//      ArithmeticException: You tried an illegal type of arithmetic operation,
//                              such as 'dividing by zero'.
//      IOException: A method that performs I/O encountered an unrecoverable I/O error.
//      ClassNotFoundException: A necessary class could not be found.


//TRY STATEMENT:
// try {
//      statement that can throw exceptions
//      }
// catch (exception-type identifier)
//      {
//      statement executed when exception is thrown
//      }
package Chapter_8;


public class Exceptions {
    
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            int c = a / b;      //cant divide by zero
        }
        catch (ArithmeticException e) {
            System.out.println("Oops, cant divide by zero.");
        }
    }
}
