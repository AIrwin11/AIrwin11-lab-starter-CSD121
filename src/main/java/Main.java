import core.Card;
import core.CardStack;
import core.Card.*;

import java.util.ArrayList;

public class Main {

    static void main() {
        // make a new deck
        CardStack cardStack = new CardStack();
        // shuffle the deck
        ArrayList<Card> cards = cardStack.shuffle();
        // draw a card
        var card = cardStack.drawCard();







        IO.println(card);
        /*
             Place your main game logic here.
             This is the ONLY code file that should have any reference to the Console class.

             The basic flow of the game is as follows:

             1. Prompt for player names
             2. Deal a shuffled deck evenly to each of the players
             3. While the players have cards and wish to continue:
                 b. All players draw one card and reveal them
                 c. The player with the higher card wins the round (or it's a tie)
         */

    }
}
