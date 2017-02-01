package com.bird.assignment3.Model;


public abstract class ChessPiece {
    protected ChessPosition currentPosition;
    protected ChessPieceType pieceType;
    protected ChessPieceColor pieceColor;

    public ChessPieceColor getPieceColor() {
        return pieceColor;
    }

    public void setPieceColor(ChessPieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public ChessPieceType getPieceType() {
        return pieceType;
    }

    public void setPieceType(ChessPieceType pieceType) {
        this.pieceType = pieceType;
    }

    public ChessPosition getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(ChessPosition currentPosition) {
        this.currentPosition = currentPosition;
    }

    public boolean canMoveTo(ChessPosition position) {
        // A piece can't move outside the board or to its current position
        return position.isValidPosition() && !position.equals(currentPosition);
    }
    
    public boolean canKill(ChessPosition position) {
    	return canMoveTo(position);
    }
}
