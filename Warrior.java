/*
Team Peppy--Lucy Tang, Kyle Moon, Jordan Louie
APCS1 pd5
HW30--Ye Olde Role Playing Game, Expanded
2015-11-15
*/

public class Warrior extends Character{
    //default constructor
    public Warrior(){
	HP = 125;
        strength = 100;
        defense = 40;
        attackRate = 0.4;
    }
    
    //overloaded constructor
    public Warrior(String Name){
	this();
        name = Name;
    }

    //special attack, decrease defense and increase attack and strength
    public void specialize(){
        defense -= 10;
        attackRate += 0.2;
	strength += 10;
    }
    
    //normal attack, reset defense and attack values
    public void normalize(){
        defense = 40;
        attackRate = 0.4;
	strength = 100;
    }

    //info about each class
    public String about(){
	return "Warriors have the second most strength after Mages.";
    }
}
