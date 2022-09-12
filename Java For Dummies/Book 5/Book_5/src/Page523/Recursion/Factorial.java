/*
Using recursion to calculate the factorial of a number.
(Factorial = the product of all integers from 1 to n.  eg. factorial of 5 = 5 x 4 x 3 x 2 x 1)
 */
package Page523.Recursion;

/**
 *
 * @author byron
 */
public class Factorial 
{
    public static void main(String[] args) 
    {
        int n = 5;
        long fact;
        fact = factorial(n);
//        fact = factorialRecursion(n);
        System.out.println("The factorial of " + n + " is " + fact + ".");
    }
    
    //using a for loop
    private static long factorial(int n)
    {
        long f = 1;
        for (int i = 1; i <= n; i++)
            f = f * i;
        return f;
    }
    
    
    //using recursion
    private static long factorialRecursion(int n)
    {
        if (n == 1)
            return 1;                               //end point
        else
            return n * factorialRecursion(n - 1);   //5 * (5 - 1)
    }                                               //5 * (4 - 1)
}                                                   //5 * (3 - 1)  etc....
