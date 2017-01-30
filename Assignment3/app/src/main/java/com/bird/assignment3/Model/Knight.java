package com.bird.assignment3.Model;

/**
 * Created by v596747 on 1/30/17.
 */

//        Knight: A knight can move only in an L pattern: two cells horizontally and one vertically or vice versa.
// It can kill any opponent’s piece if it can move to its place.


public class Knight extends ChessPiece {
    public Knight(ChessPosition position) {
        super();
        this.setCurrentPosition(position);
        this.setPieceType(ChessPieceType.KNIGHT);
    }


    public  boolean canMoveTo(ChessPosition position){

        return true;
    }
    public  boolean canKill(ChessPosition position){

        return true;
    }
}
