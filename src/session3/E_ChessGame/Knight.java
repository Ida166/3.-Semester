package session3.E_ChessGame;

public class Knight extends ChessPiece {

    public Knight(String color) {
        super("Knight", color);
    }

    @Override
    public boolean isLegalMove(ChessBoard board, int toRow, int toCol) {
        return Movements.isLegalKnightsMove(board, getRow(), getCol(), toRow, toCol);
    }

    @Override
    protected char getLetter() {
        return 'N';
    }

}

