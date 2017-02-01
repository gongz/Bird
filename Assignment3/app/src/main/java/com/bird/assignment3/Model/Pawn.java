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
        Integer rowMove = position.getRow() - currentPosition.getRow();
        Integer colMove = position.getColumn() - currentPosition.getColumn();

        // Traditionally the black pieces are arranged in the top two rows as shown.
        if (this.pieceColor.equals(ChessPieceColor.BLACK)) {
            rowMove *= -1;
        }

        return (rowMove == 1 && colMove == 0);
    }

    public boolean canKill(ChessPosition position) {
        if (!super.canMoveTo(position)) {
            return false;
        }
        Integer rowMove = position.getRow() - currentPosition.getRow();
        Integer colDis = Math.abs(position.getColumn() - currentPosition.getColumn());

        // Traditionally the black pieces are arranged in the top two rows as shown.
        if (this.pieceColor.equals(ChessPieceColor.BLACK)) {
            rowMove *= -1;
        }
        return (rowMove == 1 && colDis == 1);
    }
}
