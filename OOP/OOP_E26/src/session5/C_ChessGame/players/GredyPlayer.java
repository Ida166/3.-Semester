package session5.C_ChessGame.players;

import session5.C_ChessGame.ChessBoard;
import session5.C_ChessGame.ChessPiece;

import java.util.Random;

public class GredyPlayer implements Player {

    private Random random = new Random();

    @Override
    public Move chooseMove(ChessBoard board, String color){

        //Loop through the board field by field to search for its own piece.
        for(int row = 0; row <= 7; row++){
            for(int column = 0; column <= 7; column++){

                //Is this one of its own piece
                ChessPiece piece = board.getPieceAt(row, column);
                if (piece == null || !piece.getColor().equals(color)) {
                    continue;               // an empty square, or not one of mine
                }

                //Check if piece can reach an enemy piece on the board
                for(int rowEnemy = 7; rowEnemy >= 0; rowEnemy--) {
                    for (int columnEnemy = 0; columnEnemy <= 7; columnEnemy++) {

                        //Check if the found piece is an enemy piece
                        ChessPiece enemyPiece = board.getPieceAt(rowEnemy, columnEnemy);
                        if (enemyPiece == null || enemyPiece.getColor().equals(color)) {
                            continue;               // an empty square, or not one of mine
                        }

                        if (piece.isLegalMove(board, rowEnemy, columnEnemy)) {
                            return new Move(row, column, rowEnemy, columnEnemy);
                        }
                    }
                }
            }
        }

        //Not possible to capture an enemy piece, so make a random legal move
        for (int attempt = 0; attempt < 500; attempt++) {

            int fromRow = random.nextInt(8);
            int fromCol = random.nextInt(8);

            ChessPiece piece = board.getPieceAt(fromRow, fromCol);

            if (piece == null || !piece.getColor().equals(color)) {
                continue;
            }

            for (int target = 0; target < 30; target++) {

                int toRow = random.nextInt(8);
                int toCol = random.nextInt(8);

                if (piece.isLegalMove(board, toRow, toCol)) {
                    return new Move(fromRow, fromCol, toRow, toCol);
                }
            }
        }
        return null;
    }
}
