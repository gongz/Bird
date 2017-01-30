package com.bird.assignment3.Model;

/**
 * Created by v596747 on 1/30/17.
 */

public class King extends ChessPiece {

    public King(ChessPosition position) {
        super();
        this.setCurrentPosition(position);
        this.setPieceType(ChessPieceType.KING);
    }


    public  boolean canMoveTo(ChessPosition position){
        return true;
    }
    public  boolean canKill(ChessPosition position){

        return true;
    }

}
