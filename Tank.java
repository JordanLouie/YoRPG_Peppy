/*
Team Peppy--Lucy Tang, Kyle Moon, Jordan Louie
APCS1 pd5
HW30--Ye Olde Role Playing Game, Expanded
2015-11-15
*/

public class Tank extends Character{
    //default constructor
    public Tank() {
        HP = 125;
        strength = 75;
        defense = 80;
        attackRate = 0.4;
    }

    //overloaded constructor
    public Tank(String Name){
	this();
        name = Name;
    }

    //normal attack, reset defense and strength values
    public void normalize(){
        defense = 80;
        strength = 75;
    }

    //special attack, increase defense and decrease strength
    public void specialize(){
        defense += 30;
        strength -= 10;
    }

    //info about each class
    public String about(){
	return "Tanks have the most defense.";
    }
}
