package session9.D_ChessGame;

public enum PieceType {
    KING(100), QUEEN(9), ROOK(5), BISHOP(3), KNIGHT(3), CENTAUR(1);

    private int value;

    PieceType( int value) {
        this.value = value;
    }
}
