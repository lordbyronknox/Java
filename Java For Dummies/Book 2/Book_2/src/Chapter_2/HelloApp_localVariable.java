package Chapter_2;

//Local variable: Declared in the body of a method.  No 'static' keyword.
//Can only be use within the method. (other methods in the class can't see it.)
//Only exist when the method is being used.

public class HelloApp_localVariable {
    
    public static void main(String[] args) {
        
        String helloMessage;                    //local variable: must be declared before it is used.
        helloMessage = "Hello, World!";         //...usually at the start of the method's body.
                                                
        System.out.println(helloMessage);
        
        
// this would not work as the variable is declared after it is used.
/*      helloMessage = "Hello World";
        System.out.println(helloMessage);
        String helloMessage;
*/
        
    }
}
