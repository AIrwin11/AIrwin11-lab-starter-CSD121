/*
    NOTE:

    Add to this type any variables and/or methods required
    to represent one playing card.

    You MAY change this to a record/enum as you see fit.
 */
package core;



public record Card(Rank rank, Suit suit) {
    // methods here
    @Override
    public String toString() {
        return rank.getSymbol() + suit.getSymbol();
    }

}
