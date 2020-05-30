
/**
 * Write a description of class Human here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Human extends Creature
{
    private static final int maximumHumanHP = 30;
    private static final int minimumHumanHP = 10;
    private static final int maximumHumanStrength = 18;
    private static final int minimumHumanStrength = 5;

    /**
     * Constructor for objects of class Human
     */
    public Human()
    {
        super(
        RandomNumGen.nextInt(maximumHumanHP - minimumHumanHP) + minimumHumanHP,
        RandomNumGen.nextInt(maximumHumanStrength - minimumHumanStrength)
        + minimumHumanStrength);
    }
}
