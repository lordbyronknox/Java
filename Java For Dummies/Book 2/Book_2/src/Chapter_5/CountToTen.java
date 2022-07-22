//Loops
package Chapter_5;

public class CountToTen {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);  //the scope of 'i' is only in the for loop.
        } //System.outPrint(i) - wont work...you cant access i from here.

        System.out.println("\n");

        //you can declare the counter variable (i) outside the loop too...
        int i;                      //not its scope is from this line till the end of the main method.
        for (i = 1; i <= 10; i++) {   //first loop executes, then i is incremented.
            System.out.println(i);
        }
        System.out.println("last i is = " + i); //i is incremented after the last loop, so i = 11.

        System.out.println("\n");

        //Count evens:
        for (int num = 2; num <= 20; num += 2) {
            System.out.println("Evens are: " + num);
        }

        System.out.println("\n");

        //counting backwards
        for (int count = 10; count >= 1; count--) {
            System.out.println(count);
        }

        System.out.println("\n");

        //Launch Control.
        System.out.println("We are go for launch in T minus ");
        for (int tCount = 10; tCount >= 0; tCount--) {
            if (tCount == 8) {
                System.out.println("Ignition sequence start!");
            } else {
                System.out.println(tCount + "...");
            }
        }
        System.out.println("All engines running!");
        System.out.println("Liftoff! We have liftoff!");
    }
}
