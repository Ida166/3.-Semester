package session5.C_ChessGame.rules;

import session5.C_ChessGame.ChessBoard;

public class LShape implements MoveRule {

    @Override
    public boolean allows(ChessBoard board, int fromRow, int fromCol, int toRow, int toCol){
        int rowDistance = Math.abs(toRow - fromRow);
        int colDistance = Math.abs(toCol - fromCol);

        return (rowDistance == 1 && colDistance == 2) || (rowDistance == 2 &&colDistance == 1);
    }

}

