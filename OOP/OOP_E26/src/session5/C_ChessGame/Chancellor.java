package session5.C_ChessGame;

import session5.C_ChessGame.rules.StraightLine;

public class Chancellor extends Knight {

    public Chancellor(String color) {
        super("Chancellor", color);
        addRule(new StraightLine(7));
    }

    @Override
    protected char getLetter() {
        return 'C';
    }
}

