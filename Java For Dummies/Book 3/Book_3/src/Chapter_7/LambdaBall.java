
package Chapter_7;


public class LambdaBall {
    
    public static void main(String[] args){
        //The first ; marks the end of the statement that calls System.out.println
        //The second ; marks the end of the assignment statement that assigns the lambda expression to b.
        Ball b = () -> { System.out.println("You hit it!"); };   //Note the ' ; }; '
        b.hit();                                                 
    }                                                             
    
    interface Ball {
        void hit();
    }    
}
