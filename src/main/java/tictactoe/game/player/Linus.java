package tictactoe.game.player;

import tictactoe.game.Board;
import tictactoe.game.Position;
import tictactoe.game.Token;

public class Linus extends Player {

    public Linus(String name, Token token) {
        super(name, token);
    }

    @Override
    public Position getNextMove(Board board) {
        Board newBoard = new Board();
        Position position = new Position(0,0);
        if (newBoard.isEmptyAt(position)) {
        }
    }
}
