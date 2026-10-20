package session5.C_ChessGame;

import session5.C_ChessGame.rules.LShape;

public class Knight extends ChessPiece {

    public Knight(String color) {
        super("Knight", color);
        addRule(new LShape());
    }

    //Second constructor, protected so only the subclass can use it.
    protected Knight(String type, String color){
        super(type, color);
        addRule(new LShape());
    }

    @Override
    protected char getLetter() {
        return 'N';
    }
}