// ADDING ELEMENTS
// .add()

package Page424.UnderstandingTheArrayListClass;

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
    }
    
    
    
}
