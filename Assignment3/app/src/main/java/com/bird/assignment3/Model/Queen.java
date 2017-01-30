package com.bird.assignment3.Model;

/**
 * Created by v596747 on 1/30/17.
 */

//        Queen: A queen can move horizontally, vertically and diagonally.
// It can kill any opponent’s piece if it can move to its place.

public class Queen extends ChessPiece {
    public Queen(ChessPosition position) {
        super();
        this.setCurrentPosition(position);
        this.setPieceType(ChessPieceType.QUEEN);
    }


    public  boolean canMoveTo(ChessPosition position){
        return true;
    }
    public  boolean canKill(ChessPosition position){

        return true;
    }
}
