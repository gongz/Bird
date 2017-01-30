package com.bird.assignment3.Model;

/**
 * Created by v596747 on 1/30/17.
 */
//        Rook: A rook can move horizontally or vertically.
// It can kill any opponent’s piece if it can move to its place.

public class Rook extends ChessPiece {
    public Rook(ChessPosition position) {
        super();
        this.setCurrentPosition(position);
        this.setPieceType(ChessPieceType.ROOK);
    }


    public  boolean canMoveTo(ChessPosition position){
        return true;
    }
    public  boolean canKill(ChessPosition position){

        return true;
    }
}
