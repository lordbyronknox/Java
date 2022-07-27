
package ex11_3_exercise;

public class MyShoppingCart {
    myItem[] items = {new myItem("Shirt",25.60), 
                    new myItem("WristBand",0), 
                    new myItem("Pants",35.99)};
    
    public static void main(String[] args){
        MyShoppingCart cart = new MyShoppingCart();
        cart.displayTotal();
    }
    
    // Use a standard for loop to iterate through the items array, adding up the total price
    //    Skip any items that are back ordered.  Display the Shopping Cart total.
    public void displayTotal(){
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].isBackOrdered())
                continue;
            total += items[i].getPrice();
            }
            System.out.println("Your Total is: " + total);
        }
    }

