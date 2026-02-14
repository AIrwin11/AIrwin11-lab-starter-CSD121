/*
    NOTE:

    Add to this type any variables and methods required
    to represent and manipulate the overall state of the high card game.

    You MAY change this to a record/enum as you see fit.
 */
package core;

public class HighCardGame {
    // fields to remember the players
    private final Player player1;
    private final Player player2;
    private CardStack hand1;
    private CardStack hand2;


    // constructor for HighCard game logic
    public HighCardGame(String name1, String name2){

        CardStack fullDeck = new CardStack(true);

        fullDeck.shuffleDeck();

        this.hand1 = new CardStack(false);
        this.hand2 = new CardStack(false);

        for (int i = 0; i < 26; i++){
            Card card = fullDeck.drawCard();
            hand1.addCard(card);
        }
        for (int i = 0; i < 26; i++){
            Card card = fullDeck.drawCard();
            hand2.addCard(card);
        }

        this.player1 = new Player(name1, hand1);
        this.player2 = new Player(name2, hand2);
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    // method for comparing cards
    public int compareCards(Card card1, Card card2){
       int value1 =  card1.rank().getValue();
       int value2 =  card2.rank().getValue();
        if (value1 > value2){
            return 1;
        } else if (value1 < value2) {
            return 2;

        }
        return 0;
    }

    // method to check if the game should continue
    public boolean checkGameState(){
        return !player1.getHand().checkIfEmpty() && !player2.getHand().checkIfEmpty();
        }
}


