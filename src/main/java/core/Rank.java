package core;

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

    //field to store value
    private final int value;

    //field to store symbol
    private final String symbol;

    //constructor to initialize value and symbol
    Rank(String symbol,int value) {
        this.symbol = symbol;
        this.value = value;
    }
    //method to get symbol
    public String getSymbol(){
        return symbol;
    }
    //method to get value
    public int getValue(){
        return value;
    }

}
