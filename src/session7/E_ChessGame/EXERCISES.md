# Session 7 — Exercises 1, 2 and 3, the game

The game is the one from session 5, with the knights. Each exercise is its numbered steps. The
tips are there if you need them.

## Exercise 1 — the rules in a list

1. In `ChessPiece`, keep the rules in a `List<MoveRule>` instead of the array `MoveRule[4]`.
   `ChessPiece.ruleCount` goes away.

   You are done when `Demo` plays a game to the end, as before.

### Discussion

1. What did the old `ChessPiece.addRule` do with a fifth rule?
   * It could not save it in the array, and caused an ArrayIndexOutOfBoundsException.

## Exercise 2 — the captured pieces

1. Write `ChessPiece.toString`, so that a piece prints as `Black Rook`.
2. In `ChessGame`, keep every captured piece in a `List<ChessPiece>`, and print the list when the
   game ends.

   You are done when a game ends with a line such as `Captured: [Black Rook, White Knight]`.

### Tips

- `ChessGame.movePiece` already knows when a piece is captured.

### Discussion

1. The list prints without a loop. Which method does it call on each piece?

## Exercise 3 — the board on a map

1. Write `Position.java`, a square with a row and a column, with `Position.equals` and
   `Position.hashCode`.
2. In `ChessBoard`, keep the pieces in a `Map<Position, ChessPiece>` instead of the array. The
   public methods of `ChessBoard` do not change.

   You are done when `Demo` draws the board with all its pieces and plays a game to the end.

### Tips

- Do step 2 before you write `Position.equals` and `Position.hashCode`. Run the game and look at
  the board.

### Discussion

1. Which classes besides `ChessBoard` did you change? Why so few?
   * No one beside `ChessBoard`, other than the new class Position created. I didn't need to change the other classes 
   * because of abstraction and encapsulation. The other classes interact with the board through its existing methods, 
   * such as getPieceAt() and movePiece(), without needing to know how the board stores its pieces internally
