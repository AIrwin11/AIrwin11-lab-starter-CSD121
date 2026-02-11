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
    private static CardStack hand;

    // initialize the player name and the deck they will play
    public Player(String name, CardStack hand, Player player) {
        this.name = name;
        Player.hand = hand;
    }
    // getter method for player name
    public String getName() {
        return name;
    }

    // getter method for player hand
    public CardStack getHand() {
        return hand;
    }

    // method for drawing a card from the players
    public Card drawFromHand(){
        return hand.drawCard();
    }

}
