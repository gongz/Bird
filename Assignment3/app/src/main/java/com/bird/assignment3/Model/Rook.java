package com.bird.assignment3.Model;

//        Rook: A rook can move horizontally or vertically.
// It can kill any opponent’s piece if it can move to its place.

public class Rook extends ChessPiece {


    public Rook(ChessPosition cPosition, ChessPieceColor cColor) {
        super();
        this.setCurrentPosition(cPosition);
        this.setPieceType(ChessPieceType.ROOK);
        this.setPieceColor(cColor);
    }


    public boolean canMoveTo(ChessPosition position) {
        if (!super.canMoveTo(position)) {
            return false;
        }

        // Rook requires a position on same row or column.
        return (position.getRow() == currentPosition.getRow() ||
                position.getColumn() == currentPosition.getColumn());
    }

    public boolean canKill(ChessPosition position) {
        return canMoveTo(position);
    }
}
