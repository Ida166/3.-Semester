package session3.B_Inheritance;

/** A Rook is a ChessPiece too. Compare with Queen.java. Only the rule differs. */
public class Rook extends ChessPiece {

    public Rook(String color, int row, int col) {
        super("Rook", color);
        setRow(row);
        setCol(col);
        System.out.println("  the Rook constructor runs");
    }

    @Override
    public boolean isLegalMove(int toRow, int toCol) {
        return Movements.isLegalHorizontalMove(row, col, toRow, toCol, 7)
                || Movements.isLegalVerticalMove(row, col, toRow, toCol, 7);
    }
}
