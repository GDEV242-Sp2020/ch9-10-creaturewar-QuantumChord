
/**
 * Write a description of class Cyberdemon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cyberdemon extends Creature
{
    private static final int maximumCyberdemonHP = 100;
    private static final int minimumCyberdemonHP = 25;
    private static final int maximumCyberdemonStrength = 40;
    private static final int minimumCyberdemonStrength = 20;

    /**
     * Constructor for objects of class Demon
     */
    public Cyberdemon()
    {
        super(
        RandomNumGen.nextInt(maximumCyberdemonHP - minimumCyberdemonHP) + minimumCyberdemonHP,
        RandomNumGen.nextInt(maximumCyberdemonStrength - minimumCyberdemonStrength)
        + minimumCyberdemonStrength
        );
    }
    
    public int damage()
    {
        if (RandomNumGen.nextInt(100) + 1 <= 5){
            return (RandomNumGen.nextInt(strength) +1) + 50;
        }
        else {
            return RandomNumGen.nextInt(strength) + 1;
        }
    }
}
