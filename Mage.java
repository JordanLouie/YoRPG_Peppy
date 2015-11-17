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

    //normal attack, reset defense and strength values
    public void normalize(){
        defense = 40;
        strength = 125;
    }

    //special attack, decrease defense and increase strength
    public void specialize(){
        defense -= 10;
        strength += 30;
    }

    //info about each class
    public String about(){
	return "Mages have the most strength but least health.";
    }
}
