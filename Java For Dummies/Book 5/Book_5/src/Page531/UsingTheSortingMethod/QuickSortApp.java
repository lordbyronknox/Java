/*
The Quicksort method:
   * Pick a number to be the pivot point. (The most common choice is the first number in the array).
   * Split the array into two partitions, one with all numbers less than the pivot, and
     one with all the numbers that are greater than the pivot.
     (This is called 'Partitioning')
   * Now repeat this process on each of the partitions. (That's Recursion)

 */
package Page531.UsingTheSortingMethod;

/**
 *
 * @author byron
 */
public class QuickSortApp {

    public static void main(String[] args) {
        int LEN = 100;                      //variable for number of elements.
        int[] unsorted = new int[LEN];      //Array object instanciated with 100 elements.

        for (int i = 0; i < LEN; i++) //loop to fill array with 100 random numbers.
        {
            unsorted[i] = (int) (Math.random() * 100) + 1;
        }

        System.out.println("Unsorted array:");
        printArray(unsorted);

        int[] sorted = sort(unsorted);              //sort() method called on unsorted array.
        System.out.println("\n\nSorted array:");
        printArray(sorted);                         //sorted passed to printArray() method.
    }

    //method to print the array in a uniform layout (rows and columns)
    private static void printArray(int[] array) {
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 10) {                //if element is less than 10 (i.e. single didget), a space is added
                System.out.print(" ");          // to line up the output in neat columns.
            }
            System.out.print(array[i] + " ");
            if ((i + 1) % 20 == 0) {            //'\n' new line every 20 elements
                System.out.println();
            }
        }
    }

    private static int[] a;             //variable used to hold the array while it is being sorted.

    public static int[] sort(int[] array) {
        a = array;
        sort(0, a.length - 1);          //calls the second sort() method.
        return a;                       //returns a sorted array.
    }

    
    public static void sort(int low, int high) {
        if (low >= high) {                          //if low is >= high then the partition is sorted
            return;                                 //and the recursive call ends.
        }
        //calls the partition() method passing the args provided in the first sort() method.
        int p = partition(low, high);
        sort(low, p);                           //sort() is called twice, once for each partition.           
        sort(p + 1, high);
    }

    
    public static int partition(int low, int high) {
        int pivot = a[low];                             //pivot element selected (first element in array)
        int i = low - 1;
        int j = high + 1;

        while (i < j) {
            for (i++; a[i] < pivot; i++);       //bodyless for loops used to increment i, and decrement j.
            for (j--; a[j] > pivot; j--);
            if (i < j)                          //if i is > j (the pivot value) then swap().
            {
                swap(i, j);
            }
        }
        return j;                               //j is the pivot point
    }

    //method that swaps 2 elements around:
    // a[i] to temp, replaces a[i] with a[j], then replaces a[j] with temp.
    public static void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /*  Alternative swap() method.
    public static void swap(int i, int j) {
        a[i] ^= a[j];
        a[j] ^= a[i];
        a[i] ^= a[j];
    }
    */
    
}
