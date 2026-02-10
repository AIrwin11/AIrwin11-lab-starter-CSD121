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
    private final ArrayList<Card> cards;
    // create a deck
    public CardStack() {
        cards = new ArrayList<>();
        for (Suit s : Suit.values()) {
            for (Rank r: Rank.values()) {
                cards.add(new Card(r,s));
            }
        }
    }
    // return number of cards in stack
    public int getCards() {
        return cards.size();
    }

    // shuffle the deck
    public ArrayList<Card> shuffle() {
        Collections.shuffle(cards);
        return null;
    }
    // draw a card
    public Card drawCard() {
        return cards.removeFirst();
    }
    // check for empty deck
    public boolean isEmpty() {
        return cards.isEmpty();
    }
}