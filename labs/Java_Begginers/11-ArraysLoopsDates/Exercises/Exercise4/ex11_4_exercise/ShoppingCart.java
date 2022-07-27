package ex11_4_exercise;

import java.util.ArrayList;

public class ShoppingCart {
    public static void main(String[] args){   
        // Declare, instantiate, and initialize an ArrayList of Strings.  Print and test your code.
        ArrayList<String> items = new ArrayList<>();
        items.add("shirt");
        items.add("socks");
        items.add("tie");
        
        System.out.println(items);
        
        // add (insert) another element at a specific index
        items.add(1, "shoes");

	// Check for the existence of a specific String element.  
        //   If it exists, remove it.
        if (items.contains("tie")) {
            items.remove("tie");
         
            System.out.println(items);
           

        }
    }
}
