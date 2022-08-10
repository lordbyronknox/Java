/*
ARRAYS
- A set of variables, referenced by using one variable name combined with an index number.
- Each item in an array is called an ELEMENT.
- All ELEMENTS in an array must be of the same TYPE.  eg. String[], or int[]
- Accessing a specific element in an array using the index number in square brackets:
    eg x[5]
- Arrays are objects.

- DECLARING A VARIABLE THAT CAN REFER TO AN ARRAY:
    You can place the brackets on the TYPE or the VARIABLE name:
    int[] array1;
    int array1[];

- CREATING AN ARRAY
    Arrays have fixed lengths. The length determines the number of elements it can hold.
    You CANNOT change the length after you have created the array.
        eg.  String[] x = new String[10]  
    If you dont know the number of elements the array needs you can use a variable:
        System.out.print("How many players on the team: ")
        int count = sc.nextInt();
        String[] players = new String[count];

- INITIALIZING AN ARRAY
    One way is to assign the values one by one:
        eg. String[] days = new Array[7];
            days[0] = "Sunday";
            days[1] = "Monday";
            days[2] = "Tuesday";
            etc....

    The shorthand version, using an array initializer:
        eg. String[] days = { "Sunday", "Monday", "Tuesday", ...etc};

    An example of an int array:
        eg. 
            int[] primes = { 2, 3, 5, 7, 11, 13, 17 };
        or
            int[] primes = new int[] { 2, 3, 5, 7, 11, 13, 17 };

USING FOR LOOPS WITH ARRAYS

        







*/


package UnderstandingArrays;

/**
 *
 * @author byron
 */
public class Arrays {
    
}
