/*
    NOTE:

    Add to this type any variables and/or methods required
    to represent/manipulate one player in the game.

    You MAY change this to a record/enum as you see fit.
 */
package core;

public class Player {
    private static int win = 0, lose = 0;

    public Player() {
        win = 0;
        lose = 0;
    }
    // add one to win
    public void setWin() {
        win++;
    }

    // add one to lose
    public void setLose() {
        lose++;
    }

    // return win
    public int getWin() {
        return win;
    }
    // return lose
    public int getLose(){
        return lose;
    }
}
