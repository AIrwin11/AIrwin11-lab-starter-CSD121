package tictactoe.game.player;

import tictactoe.game.Board;
import tictactoe.game.Position;
import tictactoe.game.Token;

import java.util.Random;

public class Optimus extends Player {


    public Optimus(String name, Token token) {
        super(name, token);
    }

    @Override
    public Position getNextMove(Board board) {
        var emptyCells = board.getEmptyCells();

        if (emptyCells.isEmpty()) {
            var random = new Random();
            return emptyCells.get(random.nextInt(emptyCells.size()));
        }
        return null; // Minimax algorithm method call
    }
}
