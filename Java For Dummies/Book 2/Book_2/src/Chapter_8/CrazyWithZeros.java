//8.3 Using 'FINALLY' in a try statement.
//finally block is executed whether or not any exceptions are thrown by the try block or caught
//  by any catch blocks. Its purpose is to let you clean up any mess that might be left
//  behind by the exception, such as open files or database connections.

package Chapter_8;

public class CrazyWithZeros {

    public static void main(String[] args) {
        try {
            int answer = divideTheseNumbers(5, 0);
        } catch (Exception e) {
            System.out.println("Tried twice, still didn't work!");
        }
    }

    public static int divideTheseNumbers(int a, int b) throws Exception {
        int c;
        
        try {
            c = a / b;
            System.out.println("It worked!");
        } catch (Exception e) {
            System.out.println("Didn't work the first time.");
            c = a / b;

            System.out.println("It worked the second time!");
        } finally {
            System.out.println("Better clean up my mess.");
        }
        
        System.out.println("It worked after all.");
        return c;
    }
}
