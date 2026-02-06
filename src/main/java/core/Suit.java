package core;

public enum Suit {
        HEARTS("♥"),
        SPADES("♠"),
        CLUBS("♣"),
        DIAMONDS("♦");

        //field to store symbol
        private final String symbol;

        //constructor to initialize symbol
        Suit(String symbol) {
            this.symbol = symbol;
        }

        //method to get symbol
        public String getSymbol() {
            return symbol;
        }
}
