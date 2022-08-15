// ADDING ELEMENTS
// .add()

package Page428.AddingAccessingAndPrintingArrayListElements;

import java.util.ArrayList;

/**
 *
 * @author byron
 */
public class AddingElements {
    
    static ArrayList<String> signs = new ArrayList<String>();
    
    public static void main(String[] args) 
    {
        //Adding elements
        signs.add("Drink Pepsi");
        signs.add("No minors allowed");
        signs.add("Say Pepsi, Please");
        signs.add("7-Up: You Like It, It Likes You");
        signs.add("Dr. Pepper 10, 2, 4");
        
        //Adding to specific position
        signs.add(1, " and whisky");        //inserts String at index 1 (i.e. after "Drink Pepsi")
                                            //This would throw exception: IndexOutOfBoundsException is
                                            // there is no object at the specified index.
                                            
                                            
        //Accessing Elements, using .get()
        for (int i = 0; i < signs.size(); i++)      //.size() gets the number of elements in the array list.
            System.out.println(signs.get(i));       //.get() specifies the index value.
        
        System.out.println("**************************\n");
        
        //Using an enhanced for loop
        for (String s: signs)
            System.out.println(s);
        
        System.out.println("**************************\n");
        
        //Enhanced for loop, and .indexOf() to get the index number.
        for (String s : signs)
        {
            int i = signs.indexOf(s);
            System.out.println("Index " + i + " : " + s);
        }
            
        System.out.println("**************************\n");
        
        //Printing an array list  ( toString() )
        //When printing an array list, the toString method of each element (object) is called
        // to return the value, seperated by commas and enclosed in brackets.
        System.out.println(signs);
        
    }
    
    
    
}
