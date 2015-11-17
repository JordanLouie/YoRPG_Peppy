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
}
