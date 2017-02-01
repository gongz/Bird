package com.bird.assignment3.Model;


public class King extends ChessPiece {

    public King(ChessPosition cPosition, ChessPieceColor cColor) {
        super();
        this.setCurrentPosition(cPosition);
        this.setPieceType(ChessPieceType.KING);
        this.setPieceColor(cColor);
    }


    public  boolean canMoveTo(ChessPosition position){
        if (!super.canMoveTo(position)) {
        	return false;
        }
        
        // A King can only move one square at a time in any direction.
        return (position.getAbsDistance(currentPosition).equals(new ChessPosition(1, 0)) ||
        		position.getAbsDistance(currentPosition).equals(new ChessPosition(0, 1)) ||
        		position.getAbsDistance(currentPosition).equals(new ChessPosition(1, 1)));
    }
    
    public  boolean canKill(ChessPosition position){

        return true;
    }

}
