/*
Team Peppy--Lucy Tang, Kyle Moon, Jordan Louie
APCS1 pd5
HW30--Ye Olde Role Playing Game, Expanded
2015-11-15
*/

public class Character{
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
    public void specialize(){
        defense -= 10;
        attackRate += 0.5;
    }
    
    //normal attack, reset defense and attack values
    public void normalize(){
        defense = 40;
        attackRate = 0.4;
    }

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
    public static String about(String subClass){
	String retStr = "";
	if (subClass.equals("Warrior")){
	    retStr = "Warriors have the second most strength after Mages.";
	}
	if (subClass.equals("Mage")){
	    retStr = "Mages have the most strength but least health.";
	}
	if (subClass.equals("Rogue")){
	    retStr = "Rogues have the highest attack rate.";
	}
	if (subClass.equals("Tank")){
	    retStr = "Tanks have the most defense.";
	}
	if (subClass.equals("Healer")){
	    retStr = "Healers have the most HP and can heal themselves.";
	}
	return retStr;
    }	    
}
