package ex07_1_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;

        // Get the index of the space character (" ") in custName. 
        spaceIdx = custName.indexOf(" ");
        System.out.println(spaceIdx);
        System.out.println(custName.indexOf(" "));

        // Use the substring method parse out the first name and print it.
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);
        
        String surname = custName.substring(spaceIdx +1, custName.length());
        System.out.println(surname);
    }
}
