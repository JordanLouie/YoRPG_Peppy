/*
Team Peppy--Lucy Tang, Kyle Moon, Jordan Louie
APCS1 pd5
HW30--Ye Olde Role Playing Game, Expanded
2015-11-15
*/

public class Rogue extends Character{
    //default constructor
    public Rogue() {
        HP = 125;
        strength = 75;
        defense = 40;
        attackRate = 0.8;
    }

    //overloaded constructor
    public Rogue(String Name){
	this();
        name = Name;
    }

    //normal attack, reset defense and attack values
    public void normalize(){
        defense = 40;
        attackRate = 0.8;
    }

    //special attack, decrease defense and increase attack
    public void specialize(){
        defense -= 10;
        attackRate += 0.5;
    }

    //info about each class
    public String about(){
	return "Rogues have the highest attack rate.";
    }
}
