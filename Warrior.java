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
}
