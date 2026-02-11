/*
    NOTE:

    Add to this type any variables and methods required
    to represent and manipulate the overall state of the high card game.

    You MAY change this to a record/enum as you see fit.
 */
package core;

public class HighCardGame {
    // method for starting game
    private static HighCardGame instance;

    public void startGame(){
        instance = new HighCardGame();
    }
    public void dealCard(){
        instance.dealCard();
    }
    private boolean compareCards(){
        return instance.compareCards();
    }
}
