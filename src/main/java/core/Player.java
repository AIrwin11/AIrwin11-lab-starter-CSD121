/*
    NOTE:

    Add to this type any variables and/or methods required
    to represent/manipulate one player in the game.

    You MAY change this to a record/enum as you see fit.
 */
package core;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private final String name;
    private final CardStack hand;


    // initialize the player name and the deck they will play
    public Player(String name, CardStack hand) {
        this.name = name;
        this.hand = hand;
    }
    // constructor to store name
    public String getName() {
        return name;
    }
    // constructor to store player hand
    public CardStack getHand() {
        return hand;
    }
    private CardStack drawFromHand(){
        hand.drawACard();
        return hand;
    }

}
