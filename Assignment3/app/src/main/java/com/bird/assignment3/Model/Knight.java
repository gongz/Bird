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

    public  boolean canMoveTo(ChessPosition position){
        return true;
    }

    public  boolean canKill(ChessPosition position){
        return canMoveTo(position);
    }
}
