/*
    NOTE:

    Add to this type any variables and/or methods required
    to represent/manipulate one player in the game.

    You MAY change this to a record/enum as you see fit.
 */
package core;


public class Player {
    //field to store player names
    private final String name;
    // field to store player hands
    private  CardStack hand;
    // constructor for player name and their hand
    public Player(String name, CardStack hand) {
        this.name = name;
        this.hand = hand;
    }

    public void setHand(CardStack hand) {
        this.hand = hand;
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
