package session7.E_ChessGame;

import session7.D_SetAndMap.Card;

import java.util.Objects;

public class Position {
    private int row;
    private int col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Position piece = (Position) other;
        return row == piece.row && col == piece.col;
    }

    @Override
    public int hashCode() {
        return Objects.hash( row, col);
    }

}
