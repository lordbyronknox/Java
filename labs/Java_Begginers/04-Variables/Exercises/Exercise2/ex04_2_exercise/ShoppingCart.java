
package ex04_2_exercise;

public class ShoppingCart {
    
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        
        
        // Declare and initialize numeric fields: price, tax, quantity, and total.   
        double price = 10.00;
        double tax = 1.50;
        int quantity = 1;
        double total;
        
        
        // Modify message to include quantity 
        String message = custName+" wants to purchase a "+ quantity + " " + itemDesc;
        
        System.out.println(message);
        
        
        // Calculate total and then print the total cost
        total = price * quantity * tax;
        System.out.println("which will cost: R" + total);

        
    }    
}
