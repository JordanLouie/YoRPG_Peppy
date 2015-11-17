/*
Team Peppy--Lucy Tang, Kyle Moon, Jordan Louie
APCS1 pd5
HW30--Ye Olde Role Playing Game, Expanded
2015-11-15
*/

public class Healer extends Character{
    //default constructor
    public Healer() {
        HP = 175;
        strength = 75;
        defense = 40;
        attackRate = 0.4;
    }

    //overloaded constructor
    public Healer(String Name){
	this();
        name = Name;
    }

    //special attack, decrease strength and heals for some HP
    public void specialize(){
        strength -= 20;
	int heal = 30;
	if (HP + heal <= 175) HP += heal;
	else
	    HP = 175;
    }
    
    //normal attack, reset defense and attack values
    public void normalize(){
        defense = 40;
        attackRate = 0.4;
    }

    //info about each class
    public String about(){
	return "Healers have the most HP and can heal themselves.";
    }
}
