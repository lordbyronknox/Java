    //2.1

package Chapter_2;

public class Scope {

static int x;               //Class variable: scope = entire body of the Scope class.

    public static void main(String[] args) {
        x = 5;              //Class variable, declared on line 4.
        System.out.println("main: x = " + x);
        myMethod();
    }

    public static void myMethod() {
        int y;              //Local variable: scope = from here to the end of myMethod class's body.
        y = 10;
        if (y == x + 5) {
            int z;
            z = 15;
            System.out.println("myMethod: z = " + z);
        }
        System.out.println("myMethod: x = " + x);
        System.out.println("myMethod: y = " + y);
    }
}
