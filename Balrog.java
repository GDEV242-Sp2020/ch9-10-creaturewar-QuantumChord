
/**
 * Write a description of class Balrog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Balrog extends Creature
{
    private static final int maximumBalrogHP = 100;
    private static final int minimumBalrogHP = 25;
    private static final int maximumBalrogStrength = 40;
    private static final int minimumBalrogStrength = 20;

    /**
     * Constructor for objects of class Demon
     */
    public Balrog()
    {
        super(
        RandomNumGen.nextInt(maximumBalrogHP - minimumBalrogHP) + minimumBalrogHP,
        RandomNumGen.nextInt(maximumBalrogStrength - minimumBalrogStrength)
        + minimumBalrogStrength
        );
    }
    
    public int damage()
    {
        return (RandomNumGen.nextInt(strength)+1) + (RandomNumGen.nextInt(strength)+1);
    }
}
