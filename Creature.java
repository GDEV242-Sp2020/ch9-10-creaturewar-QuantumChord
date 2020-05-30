import java.util.Random;
/**
 * Write a description of class Creature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creature
{
   public int hp;
   public int strength;
   
   public Creature(){
       hp = 10;
       strength = 10;
       
   }
   
   public Creature(int initialStrength, int initialHitpoints)
   {
       strength = initialStrength > 5 ? initialStrength : 5;
       hp = initialHitpoints > 5 ? initialHitpoints : 5;
   }
   
   public void checkHealth()
   {
       System.out.println("This creature's health is: " + hp);
   }
   
   public int damage()
   {
       //TODO: change this
       return RandomNumGen.nextInt(strength) + 1;
    }
    
   public void takeDamage(int damage)
   {
       hp -= damage;
   }
    
    public boolean isAlive()
    {
        if ( hp > 0){
            System.out.println("This creature is alive.");
            return true;
        }
        else{
            System.out.println("This creature is dead.");
            return false;
        }
    }
    
}
