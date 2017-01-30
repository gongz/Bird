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

    public  boolean canMoveTo(ChessPosition position){
        return true;
    }
    public  boolean canKill(ChessPosition position){

        return true;
    }
}
