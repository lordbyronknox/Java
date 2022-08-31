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

- USING FOR LOOPS WITH ARRAYS
    eg. This for loop assigns 100 random numbers to an array:
        int[] numbers = new int[100];
        for (i = 0; i < 100; i++)
            numbers[i] = (int) (Math.random() * 100) + 1;

    eg. A loop that fills an array with strings entered by a user:
        String[] players = new String[count];
        for  (i = 0; i < 100; i++)
            System.out.print("Enter player name: ");
            players[i] = sc.nextLine();
        
- USING ARRAYS WITH METHODS
    To write methods that use arrays as return types or parameters, use empty []
    eg.
        public static String[] getDaysOfWeek() {...
    and/or
        public static void printStringArray(String[] strings) {...


- USING TWO-DIMENSIONAL ARRAYS
    An array of arrays.  (...an array who's elements are each arrays)
    An example is an array that holds the sales data for the last five years. Each year's
        records is stored in an array (2001, 2002 etc.), and each array is stored in an array (sales).
    
    Declaring a two dimensional array:
        double sales[][];
    
    Creating a two-dimensional array:
        Use two sets of brackets:
        [5] = (rows) the number of elements. 
        [4] = (columns) length of each array.
        eg.
            double sales = new double[5][4];

    Accessing two-dimensional arrays
        sales[0][0] = 23853.0;      //sets the first value of the first array within sales.





*/


package Page393.UnderstandingArrays;

/**
 *
 * @author byron
 */
public class Arrays {
    
}
