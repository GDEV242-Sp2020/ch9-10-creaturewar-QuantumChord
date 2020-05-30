
/**
 * Write a description of class Demon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    private static final int maximumDemonHP = 50;
    private static final int minimumDemonHP = 15;
    private static final int maximumDemonStrength = 20;
    private static final int minimumDemonStrength = 10;

    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        super(
        RandomNumGen.nextInt(maximumDemonHP - minimumDemonHP) + minimumDemonHP,
        RandomNumGen.nextInt(maximumDemonStrength - minimumDemonStrength)
        + minimumDemonStrength
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