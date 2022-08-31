/*
SEQUENTIAL and PARALLEL STREAMS
    By default streams are sequential - produced by the stream() method and processed one element after the next.
    Parallel streams utilize multicore processors by breaking the elements into two or more smaller streams,
     performs operations on them, and then combines them to create a final result stream.
     to create a parrallel stream just use parallelStream() rather than stream().
    NOTE: You cannot predict the order in which the elements are processed with PARALLEL STREAMS, as you
     cant cant predict the order in which the processor executes the threads.
 */
package Page470.SequentialANDparallelStreams;

import Page464.LookingAtABasicBulkDataOperation.Spell;
import java.util.ArrayList;

/**
 *
 * @author byron
 */
public class ParallelStreams {
    
    public static void main(String[] args) 
    {
        ArrayList<Spell> spells = new ArrayList<>();
        spells.add(new Spell("Apatecium", Spell.SpellType.SPELL, "Makes invisible ink appear."));
        spells.add(new Spell("Avis", Spell.SpellType.SPELL, "Launches birds from your wand."));
        spells.add(new Spell("Engorgio", Spell.SpellType.CHARM, "Enlarges something."));
        spells.add(new Spell("Fidelius", Spell.SpellType.CHARM, "Hides a secret within someone."));
        spells.add(new Spell("Finite Incatatum", Spell.SpellType.SPELL, "Stops all current spells."));
        spells.add(new Spell("Locomotor Mortis", Spell.SpellType.CURSE, "Locks an opponent's legs."));
        
        System.out.println("First Parallel stream: ");
        spells.parallelStream()
                .forEach(s -> System.out.println(s));
        
        System.out.println("\nSecond Parallel stream: ");
        spells.parallelStream()
                .forEach(s -> System.out.println(s));
    }
    
}
