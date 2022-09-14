/*
The ZoneOffSet class is used to indicate the offset from UTC.
You can create a ZoneOffset by using the following methods of the ZoneOffset class:
    of(String offsetId)
    ofHours(int hours)
    ofHoursMinutes(int hours, int minutes)
    ofHoursMinutesSeconds(int hours, int minutes, int seconds)
    ofTotalSeconds(int totalSeconds)
 */
package Page548.UsingTheOffserClass;

import java.time.OffsetTime;
import java.time.ZoneOffset;

/**
 *
 * @author byron
 */
public class ZoneOffSetClass 
{
    public static void main(String[] args) 
    {
        //creating a ZoneOffset of -8 hours using 'ofHours()':
        ZoneOffset z = ZoneOffset.ofHours(-8);
        System.out.println(z);
        
        //or specify the offset as a string using of():
        ZoneOffset zs = ZoneOffset.of("-08:00");        //You must provide 2 didgets for each unit
        System.out.println(zs);                         // of time (ie. hours, minutes, seconds...)
        
        //once you have a ZoneOffset object you can use it to create an OffsetTime:
        OffsetTime time = OffsetTime.of(10, 30, 0, 0, zs);
        System.out.println(time);
    }
    
}
