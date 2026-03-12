package tictactoe.game.player;

import tictactoe.game.*;

public class Linus extends Player {
    /**
     *
     */
    public Linus(String name, Token token) {
        super(name, token);
    }

    @Override
    public Position getNextMove(Board board) {
        var emptyCells = board.getEmptyCells();
        return emptyCells.get(0);
    }
    }