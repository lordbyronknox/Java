//

package Page464.LookingAtABasicBulkDataOperation;

/**
 *
 * @author byron
 */
public class Spell {
    
    public String name;
    public SpellType type;
    public String description;
    
    public enum SpellType {SPELL, CHARM, CURSE}
    
    public Spell(String spellName, SpellType spellType, String spellDescription)
    {
        name = spellName;
        type = spellType;
        description = spellDescription;
    }
    
    @Override
    public String toString()
    {
        return name;
    }
    
}
