package Chapter_3;

public class CountTestApp {

    public static void main(String[] args) {
        printCount();
        for (int i = 0; i < 10; i++) {
            CountTest c1 = new CountTest();     //creates an instance of the class each time it loops.
            printCount();   //static method called directly
        }
    }

    //method that calls the getInstanceCount method and prints to console.
    private static void printCount() {
        System.out.println("There are now " + CountTest.getInstanceCount()
                + " instances of the CountTest class.");
    }
}

//seperate class
class CountTest {

    private static int instanceCount = 0;   //variable storing the instance count.

   //constructor - increments the instanceCount above when called.
    public CountTest() {
        instanceCount++;
    }

    //method of CountTest class... returns the instanceCount value.
    public static int getInstanceCount() {
        return instanceCount;
    }
}
