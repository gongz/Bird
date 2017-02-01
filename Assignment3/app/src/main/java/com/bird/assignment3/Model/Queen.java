package com.bird.assignment3.Model;


//        Queen: A queen can move horizontally, vertically and diagonally.
// It can kill any opponent’s piece if it can move to its place.

public class Queen extends ChessPiece {


    public Queen(ChessPosition cPosition, ChessPieceColor cColor) {
        super();
        this.setCurrentPosition(cPosition);
        this.setPieceType(ChessPieceType.QUEEN);
        this.setPieceColor(cColor);
    }

    public boolean canMoveTo(ChessPosition position){
        if (!super.canMoveTo(position)) {
        	return false;
        }
        
        ChessPosition dist = position.getAbsDistance(currentPosition);
        return (dist.getRow() == dist.getColumn() || dist.getRow() == 0 || dist.getColumn() == 0);
    }
    
    public boolean canKill(ChessPosition position){
        return true;
    }
}
