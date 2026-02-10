/*
    NOTE:

    Add to this type any variables and/or methods required
    to represent one playing card.

    You MAY change this to a record/enum as you see fit.
 */
package core;



public record Card(Rank rank, Suit suit) {
    // methods here
    public String toString() {
        return rank.getSymbol() + suit.getSymbol();
    }
    public enum Suit {
        HEARTS("♥"), SPADES("♠"), CLUBS("♣"), DIAMONDS("♦");

        // field to store symbol
        private final String symbol;

        // constructor to initialize symbol
        Suit(String symbol) {
            this.symbol = symbol;
        }

        // method to get symbol
        public String getSymbol() {
            return symbol;
        }

    }
    public enum Rank {
        ACE("A", 14),
        KING("K",13),
        QUEEN("Q", 12),
        JACK("J", 11),
        TEN("10",10),
        NINE("9",9),
        EIGHT("8",8),
        SEVEN("7", 7),
        SIX("6", 6),
        FIVE("5", 5),
        FOUR("4", 4),
        THREE("3", 3),
        TWO("2",2);

        // field to store value
        private final int value;

        // field to store symbol
        private final String symbol;

        // constructor to initialize value and symbol
        Rank(String symbol,int value) {
            this.symbol = symbol;
            this.value = value;
        }
        // method to get symbol
        public String getSymbol(){
            return symbol;
        }
        // method to get value
        public int getValue(){
            return value;
        }

    }


}
