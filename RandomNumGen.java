import java.util.Random;

/**
 * Write a description of class RandomNumGen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomNumGen
{
    // instance variables - replace the example below with your own
    private static Random rand;

    /**
     * Constructor for objects of class RandomNumGen
     */
    public RandomNumGen()
    {
        rand = new Random();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static int nextInt(int y)
    {
        if (rand == null)
            rand = new Random();
            
        return rand.nextInt(y);
    }
}
