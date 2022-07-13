//1.2 Object Orientated example (rather than 'Procedural').

package Chapter_1;

public class HelloApp2 {            //Declaring a public class
    
    public static void main(String[] args) {        //Declaring 'main' method
        
        //Declaring a variable, instanciating an object, and assigning the object to the variable.
        Greeter myGreeterObject = new Greeter();
        Greeter2 myGreeter2Object = new Greeter2(); 
        
        //calling the (Greeter class) object's sayHello() method.
        myGreeterObject.sayHello();  
        myGreeter2Object.sayHello();
    }
}
