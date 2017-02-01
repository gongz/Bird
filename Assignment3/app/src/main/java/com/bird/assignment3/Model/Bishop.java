package com.bird.assignment3.Model;

// Bishop: A bishop can only move diagonally, and kill any opponent’s piece if it can move to its place.

public class Bishop extends ChessPiece {


    public Bishop(ChessPosition cPosition, ChessPieceColor cColor) {
        super();
        this.setCurrentPosition(cPosition);
        this.setPieceType(ChessPieceType.BISHOP);
        this.setPieceColor(cColor);
    }


    public boolean canMoveTo(ChessPosition position) {
        if (!super.canMoveTo(position)) {
        	return false;
        }
        
        return (position.getAbsDistance(currentPosition).getRow() ==
            	position.getAbsDistance(currentPosition).getColumn());
    }
    
    public boolean canKill(ChessPosition position) {
        return true;
    }
}
