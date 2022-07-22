//WHILE LOOPS
//  while (expression) {
//        statement
//         }
//  while loops starts by evaluating the expression. If that is true, then statement is
//  executed. Then it starts again... until the expression is false.


package Chapter_5;

public class EvenCounter {
    
    public static void main(String[] args) {
        
        int number = 2;
        
        while (number <= 20) {
            System.out.print(number + " ");
            number += 2;
        }
        System.out.println(" ");
    }
    
}
