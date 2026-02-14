import core.Card;
import core.CardStack;
import core.HighCardGame;
import core.Player;
import ui.Console;

public class Main {

   public static void main(String[] args) {

        // get player names with prompt
        var player1 = Console.prompt("Player 1, what is your name? : ");
        var player2 = Console.prompt("Player 2, what is your name? : ");

        // create HighCardGame with names from prompt
        var game = new HighCardGame(player1, player2);
        // each player draws a card
        while (game.checkGameState()) {
            Card card1 = game.getPlayer1().drawFromHand();
            Card card2 = game.getPlayer2().drawFromHand();

            // cards are displayed
            Console.println(card1.toString() + " " + card2.toString());

            // compare and announce winner
            var result = game.compareCards(card1, card2);
            if (result == 1) {
                Console.println(player1 + " wins!");
            } else if (result == 2) {
                Console.println(player2 + " wins!");
            } else {
                Console.println("Its a tie!");
            }
            if (Console.promptForOption("Play another round?", new String[]{"Yes", "No"}).equals("No")) {
                break;
            }
        }
    }
}
