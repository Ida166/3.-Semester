package session3.E_ChessGame;

public class Bishop extends ChessPiece {

    public Bishop(String color) {
        super("Bishop", color);
    }

    @Override
    public boolean isLegalMove(ChessBoard board, int toRow, int toCol) {
       return Movements.isLegalDiagonalMove(board, getRow(), getCol(), toRow, toCol, 7);
    }


    @Override
    protected char getLetter() {
        return 'B';
    }

}
