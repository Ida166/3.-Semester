package session3.E_ChessGame;

public class Amazon extends Queen {

    public Amazon (String color) {
        super("Amazon", color);
    }

    @Override
    public boolean isLegalMove(ChessBoard board, int toRow, int toCol) {
        return super.isLegalMove(board, toRow, toCol) || //calls the queens legalMove
                     Movements.isLegalKnightsMove(board, getRow(), getCol(), toRow, toCol);

    }

    @Override
    protected char getLetter() {
        return 'A';
    }
}
