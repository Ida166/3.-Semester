package session5.C_ChessGame;

import session5.C_ChessGame.rules.Diagonal;

public class Amazon extends Knight{

    public Amazon(String color) {
        super("Amazon", color);
        addRule(new Diagonal(7));
    }

    @Override
    protected char getLetter() {
        return 'A';
    }
}
