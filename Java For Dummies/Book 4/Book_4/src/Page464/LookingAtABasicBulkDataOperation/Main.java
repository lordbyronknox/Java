//stream() ...defined by the stream interface.
//All classes that inherit from java.Collections implement a stream method that returns a Stream object.
//A stream is simply a sequence of elements of any data type which can be processed sequentially or in parallel
//The stream interface provides methods like filter()... to filter out spesific items, and forEach()... to iterate
// through the items and perform operations on each of them.
//Streams rely on lamda expressions to perform operations on stream elements.
//'pipeline' = sequence of method calls that start by creating a stream, manipulate the stream (ie. filter()), and ends
//  by calling a method that does NOT return another stream object.


package Page464.LookingAtABasicBulkDataOperation;

import java.util.ArrayList;
/**
 *
 * @author byron
 */
public class Main {
    
    public static void main(String[] args){
        
        ArrayList<Spell> spells = new ArrayList<>();
        spells.add(new Spell("Apatecium", Spell.SpellType.SPELL, "Makes invisible ink appear."));
        spells.add(new Spell("Avis", Spell.SpellType.SPELL, "Launches birds from your wand."));
        spells.add(new Spell("Engorgio", Spell.SpellType.CHARM, "Enlarges something."));
        spells.add(new Spell("Fidelius", Spell.SpellType.CHARM, "Hides a secret within someone."));
        spells.add(new Spell("Finite Incatatum", Spell.SpellType.SPELL, "Stops all current spells."));
        spells.add(new Spell("Locomotor Mortis", Spell.SpellType.CURSE, "Locks an opponent's legs."));
        
        //printing the names of each spell
        for (Spell spell : spells)
            System.out.println(spell.name);
        
        //printing the names using the stream() method to convert the ArrayList to a stream.
        //Then use the stream's forEach() method to iterate through the stream, passing a lamda expression that
        //calls System.out.println() for each item in the stream.
        spells.stream().forEach(s -> System.out.println(s));
        
        
        System.out.println("--------------------------\n");
        
        //list just the spells, not the charms or curses, using traditional forEach() loop.
        for (Spell spell : spells)
        {
            if (spell.type == Spell.SpellType.SPELL)
                System.out.println(spell.name);
        }
        
        //...now using steams
        spells.stream().filter(s -> s.type == Spell.SpellType.SPELL)    //stream() converts the ArraysList (spells) to a stream. 
                       .forEach(s -> System.out.println(s));            //filter() selects SPELL items using a lamda, and forEach() prints
                                                                        //the selected items to the console using a lamda.
        
        //parallelStream()                                                                
        //The filter() method returns a Stream object, so it is possible to apply a 2nd filter to the results
        // of the first filter.
        //The filter() argument (called a 'Predicate') is a function that returns a boolean. If true, the element is passed on to the
        // next  
        spells.parallelStream()
                .filter(s -> s.type == Spell.SpellType.SPELL)       
                .filter(s -> s.name.toLowerCase().startsWith("a"))  //selects items that start with 'a'.
                .forEach(s -> System.out.println(s));
            
       
                
        
    }
    
}
