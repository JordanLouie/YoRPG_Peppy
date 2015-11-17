/*
Team Peppy--Lucy Tang, Kyle Moon, Jordan Louie
APCS1 pd5
HW30--Ye Olde Role Playing Game, Expanded
2015-11-15
*/

public class Mage extends Character{
    //default constructor
    public Mage() {
        HP = 75;
        strength = 125;
        defense = 40;
        attackRate = 0.6;
    }

    //overloaded constructor
    public Mage(String Name){
	this();
        name = Name;
    }

    //normal attack, reset defense and attack values
    public void normalize(){
        defense = 40;
        attackRate = 0.6;
    }
}
