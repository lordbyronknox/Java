//You can omit expressions in a for loop.


package Chapter_5;

import java.util.Scanner;

public class Omit {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Where should I start?");
        int a = sc.nextInt();
        //first param omitted because it is declared and initialized before the loop.
        for ( ; a >= 0; a--)    
            System.out.println(a);
        
        
        //omiting all all expressions, this creates an infinite loop
        // (this doesn the same as a while(true) loop.
        for (;;)
            System.out.println("Oops");
    }
    
}
