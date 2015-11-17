/*
Team Peppy--Lucy Tang, Kyle Moon, Jordan Louie
APCS1 pd5
HW30--Ye Olde Role Playing Game, Expanded
2015-11-15
*/

public class Monster extends Character{
    //constructor
    public Monster(){
        HP = 150;
        strength = (int)(Math.random() * 45 + 20);
        defense = 20;
        attackRate = 1;
    }
}
