package com.bird.assignment3.Model;

//        Pawn: A pawn is interesting: it can move only “ahead”, not backwards towards where its color started.
// It can move only one place forward in its own column.
// However to kill it must move one place forward diagonally (it cannot kill by moving straight).


public class Pawn extends ChessPiece {

    public Pawn(ChessPosition cPosition, ChessPieceColor cColor) {
        super();
        this.setCurrentPosition(cPosition);
        this.setPieceType(ChessPieceType.PAWN);
        this.setPieceColor(cColor);
    }

    public boolean canMoveTo(ChessPosition position) {
        if (!super.canMoveTo(position)) {
        	return false;
        }

        ChessPosition dist = position.getDistance(currentPosition);
        return (dist.getRow() == 1 && dist.getColumn() >= 0) ||
        		(dist.getColumn() == 1 && dist.getRow() >= 0);
    }
    
    public boolean canKill(ChessPosition position) {
        return true;
    }
}
