import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Write a description of class War here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class War
{
    ArrayList<Creature> army1, army2;
    
    private int armySize = 200;
    
    public War()
    {
        begin();
    }
    
    private void begin()
    {
        army1 = new ArrayList<Creature>();
        army2 = new ArrayList<Creature>();
    }
    
    public void beginWar()
    {
        if (army1 == null || army2 == null)
            begin();
            createArmy(armySize);
            fight();
    }
    
    private void createArmy(int size)
    {
        for(int i = 0; i <size; i++){
            int rand = RandomNumGen.nextInt(10)+1;
            if (rand < 5){
                army1.add(new Human());
            }
            else if (rand < 10){
                army1.add(new Elf());
            }
            else {
                rand = RandomNumGen.nextInt(5) +1;
                if (rand < 2){
                    army1.add(new Demon());
                }
                else if (rand < 5){
                    army1.add(new Cyberdemon());
                }
                else{
                    army1.add(new Balrog());
                }
            }
            
            if (rand < 6){
                army2.add(new Human());
            }
            else if (rand < 12){
                army2.add(new Elf());
            }
            else {
                rand = RandomNumGen.nextInt(5) +1;
                if (rand < 2){
                    army2.add(new Demon());
                }
                else if (rand < 5){
                    army2.add(new Cyberdemon());
                }
                else{
                    army2.add(new Balrog());
                }
            }
        }
    }
    
    private void fight()
    {
        boolean combat = true;
        int turn = 1;
        
        while(combat)
        {
            switch(turn)
            {
                case 1:
                    Collections.shuffle(army1);
                    Collections.shuffle(army2);
                    if (army1.size() > 0 && army2.size() > 0){
                        army2.get(0).takeDamage(army1.get(0).damage());
                        if (army2.get(0).isAlive())
                        {
                            army2.remove(0);
                        }
                        turn = 2;
                    }
                    else
                    {
                        turn = 3;
                    }
                    
                    break;
                case 2:
                    Collections.shuffle(army1);
                    Collections.shuffle(army2);
                    if (army2.size() > 0 && army1.size() > 0){
                        army1.get(0).takeDamage(army2.get(0).damage());
                        if (army1.get(0).isAlive())
                        {
                            army1.remove(0);
                        }
                        turn = 1;
                    }
                    else
                    {
                        turn = 3;
                    }
                    break;
                    
                    default:
                        combat = false;
                    if (army2.size() > 0 && army1.size() <= 0)
                        System.out.println("The Army of the Dawn has won.");
                    if  (army2.size() <= 0 && army1.size() > 0)
                        System.out.println("The Army of the Shadow has won.");
                        break;
                    }
                }
            }
        }
        
                    
