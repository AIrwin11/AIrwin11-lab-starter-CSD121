/*
    NOTE:

    Add to this type any variables and/or methods required
    to represent/manipulate a stack (deck/hand) of playing cards.

    You MAY change this to a record/enum as you see fit.
 */
package core;

import java.util.ArrayList;
import java.util.Collections;
import core.Card.*;

public class CardStack {

    private final ArrayList<Card> deck;

    // create a deck
    public CardStack() {
        deck = new ArrayList<>();
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                deck.add(new Card(r, s));
            }
        }
    }

    // constructor for CardStack to create a full deck if createFull is true, otherwise it returns an empty deck
    public CardStack(boolean createFull) {
        deck = new ArrayList<>();
        if (createFull) {
            for (Suit s : Suit.values()) {
                for (Rank r : Rank.values()) {
                    deck.add(new Card(r, s));
                }
            }
        }
    }

    // return number of cards in stack
    public int getDeckSize() {
        return deck.size();
    }

    // shuffle the deck
    public ArrayList<Card> shuffleDeck() {
        Collections.shuffle(deck);
        return deck;
    }

    // draw a card
    public Card drawCard() {
        return deck.removeFirst();
    }

    // check for empty deck
    public boolean checkIfEmpty() {
        return deck.isEmpty();
    }
    // method to add card to CardStack
    public void addCard(Card card){
        deck.add(card);
    }
}
