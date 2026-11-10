package session5.C_ChessGame;

import session5.C_ChessGame.rules.Diagonal;
import session5.C_ChessGame.rules.LShape;
import session5.C_ChessGame.rules.StraightLine;

public class Archbishop extends Knight{

    public Archbishop(String color) {
        super("Archbishop", color);
        addRule(new Diagonal(7));
    }

    @Override
    protected char getLetter() {
        return 'P';
    }
}

