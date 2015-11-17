/*
Team Peppy--Lucy Tang, Kyle Moon, Jordan Louie
APCS1 pd5
HW30--Ye Olde Role Playing Game, Expanded
2015-11-15
*/

public abstract class Character{
    protected String name;
    protected int HP;
    protected int strength;
    protected int defense;
    protected double attackRate;

    //returns boolean if alive or dead
    public boolean isAlive(){
        return HP > 0;
    }
    
    //returns defense value
    public int getDefense(){
        return defense;
    }

    //returns name value
    public String getName(){
        return name;
    }
      
    //special attack, decrease defense and increase attack
    public abstract void specialize();
    
    //normal attack, reset defense and attack values
    public abstract void normalize();

    //decreases HP
    public void lowerHP(int dmg){
        HP -= dmg;
    }

    //attack value
    public int attack(Character subClass){
        int dmg = (int)((strength * attackRate) - subClass.getDefense());
	if (dmg < 0) dmg = 0;
	subClass.lowerHP(dmg);
        return dmg;
    }

    //info about each class
    public abstract String about();  
}
