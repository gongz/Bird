package com.bird.assignment3.Model;

/**
 * Created by v596747 on 1/30/17.
 */

//Bishop: A bishop can only move diagonally, and kill any opponent’s piece if it can move to its place.

public class Bishop extends ChessPiece {

    public Bishop(ChessPosition position) {
        super();
        this.setCurrentPosition(position);
        this.setPieceType(ChessPieceType.BISHOP);
    }


    public  boolean canMoveTo(ChessPosition position){
        return true;
    }
    public  boolean canKill(ChessPosition position){

        return true;
    }
}
