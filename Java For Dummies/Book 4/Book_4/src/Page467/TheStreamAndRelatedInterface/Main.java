/*

 */
package Page467.TheStreamAndRelatedInterface;

import Page464.LookingAtABasicBulkDataOperation.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author byron
 */
public class Main {
    public static void main(String[] args) 
    {
        //METHODS THAT RETURN STREAMS
        Collection<String> list = Arrays.asList("F", "A", "B", "C", "D", "C");
        
        //distinct() returns a stream on unique elements.
        //limit()   returns a stream of a max specified size.
        //sorted()  sorts the sorts the returned elements.
        //sorted(Comparator<? super T> comparator)   returns elements in sorted order, using Comparator function.
        //        The Comparator function has 2 parameters, and returns -1 if the first is less than the second,
        //        0 if they are equal, and 1 if the 1st is greater than the second.
        list.stream().distinct()
                     .limit(3)
                     .sorted()
                     .forEach(s -> System.out.println(s));
        
        
        //MAPPING METHODS
        //[a common use for the mapping methods is to convert a stream of complex types to a stream of simple types, which
        //  you can then use to perform aggregate  calculations on].
        
        //map()     Returns a stream created by applying the mapper function to each element of the input stream.
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        list2.stream().map(num -> num + 1)
                      .forEach(System.out::println);        // :: = method reference operator. Used to call a method
                                                            // by refereing to it directly, with the help of its class .
        
        //mapToDouble() same as map(), returns a double-valued stream of elements. supports parallel operations.
        //mapToInt()    Return an IntStream
        //mapToLong()   Returns an LongStream
        
        
        //TERMINAL AND AGGREGATE METHODS (these do not return a stream, and are the last methods called in a stream)
        //forEach()       executes the action against each element in the input stream.
        //forEachOrder()  same as forEach(), but elements are processed in order.
        //count()         returns the number of elements in the stream.
        //max()           returns the largest element in the stream.
        //min()           returns the smallest element in the stream.
        //average()       returns an average of all the elements in the stream. (vali for DoubleStream, IntStream and LongStream)
        //sum()           returns the sum of the elements in the stream.
        //summaryStatistics()   returns a summary statistics object that includes various property methods (eg. getCount)
    
        
        
    }
    
}
