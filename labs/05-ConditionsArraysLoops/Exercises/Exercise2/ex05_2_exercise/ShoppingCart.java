
package ex05_2_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        

        //Declare and initialize the items String array
        String[] items = {"shirt", "pants", "cap", "socks"};
        items[2] = "belt";
        
        


        // Change message to show the number of items purchased.
        String message = custName + " wants to purchase " + items.length + " items";

        System.out.println(message);
        // Print an element from the items array.  
        System.out.println(items[2]);
        
        //for loop
        for (String i : items) {
            System.out.println(i);
        }
        
    }

}
