/*
To create a ZonedDateTime you must forst create a time zone object by using
the ZoneIdApp class.
You need to know the standard name of the time zone - you can list all the zone ID's
by looping through ZoneIdApp.getAvailableZoneIds()... as shown below:
 */
package Page547.UsingTheZoneIdClass;

import java.time.*;
import java.util.Set;

/**
 *
 * @author byron
 */
public class ZoneIdApp 
{
    public static void main(String[] args) 
    {
        // 1. Get a list of zone ID's
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        for (String id : zoneIds)
            System.out.println(id);
        
        // 2. Create a zoneId object using the name, then create a zonedatetime
        ZoneId z = ZoneId.of("Africa/Johannesburg");
        ZonedDateTime zdate;
        zdate = ZonedDateTime.of(2014, 12, 15, 0, 0, 0, 0, z);
    }
    
}
