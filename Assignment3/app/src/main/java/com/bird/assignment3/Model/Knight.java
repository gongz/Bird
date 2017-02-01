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
        return (position.getAbsDistance(currentPosition).equals(new ChessPosition(2, 1)) ||
        		position.getAbsDistance(currentPosition).equals(new ChessPosition(1, 2)));
    }

    public boolean canKill(ChessPosition position) {
        return canMoveTo(position);
    }
}
