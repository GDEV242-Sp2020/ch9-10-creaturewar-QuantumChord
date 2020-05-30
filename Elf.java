
/**
 * Write a description of class Elf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elf extends Creature
{
    private static final int maximumElfHP = 25;
    private static final int minimumElfHP = 8;
    private static final int maximumElfStrength = 18;
    private static final int minimumElfStrength = 5;

    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        super(
        RandomNumGen.nextInt(maximumElfHP - minimumElfHP) + minimumElfHP,
        RandomNumGen.nextInt(maximumElfStrength - minimumElfStrength)
        + minimumElfStrength
        );
    }
    
    
    public int damage()
    {   
        if (RandomNumGen.nextInt(10) + 1 == 10){
            return (RandomNumGen.nextInt(strength) +1) * 2;
        }
        else {
            return RandomNumGen.nextInt(strength) +1;
        }
    }
    
}
