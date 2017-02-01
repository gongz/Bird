package com.bird.assignment3.Model;

//        Knight: A knight can move only in an L pattern: two cells horizontally and one vertically or vice versa.
// It can kill any opponent’s piece if it can move to its place.


public class Knight extends ChessPiece {

    public Knight(ChessPosition cPosition, ChessPieceColor cColor) {
        super();
        this.setCurrentPosition(cPosition);
        this.setPieceType(ChessPieceType.KNIGHT);
        this.setPieceColor(cColor);
    }

    public boolean canMoveTo(ChessPosition position) {
        if (!super.canMoveTo(position)) {
            return false;
        }

        // A knight can move only in an L pattern: two cells horizontally and one vertically or vice versa.
        Integer rowDis = Math.abs(position.getRow() - currentPosition.getRow());
        Integer colDis = Math.abs(position.getColumn() - currentPosition.getColumn());

        return (rowDis == 1 && colDis == 2) || (rowDis == 2 && colDis == 1);
    }

    public boolean canKill(ChessPosition position) {
        return canMoveTo(position);
    }
}
