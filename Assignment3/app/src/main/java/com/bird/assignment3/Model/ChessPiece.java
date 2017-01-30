package com.bird.assignment3.Model;

/**
 * Created by v596747 on 1/30/17.
 */

public abstract class ChessPiece {
    protected ChessPosition currentPosition;
    protected ChessPieceType pieceType;

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

    public abstract boolean canMoveTo(ChessPosition position);
    public abstract boolean canKill(ChessPosition position);


}