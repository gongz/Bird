package com.bird.assignment3.Model;

/**
 * Created by v596747 on 1/30/17.
 */

//        Pawn: A pawn is interesting: it can move only “ahead”, not backwards towards where its color started.
// It can move only one place forward in its own column.
// However to kill it must move one place forward diagonally (it cannot kill by moving straight).


public class Pawn extends ChessPiece {
    public Pawn(ChessPosition position) {
        super();
        this.setCurrentPosition(position);
        this.setPieceType(ChessPieceType.PAWN);
    }


    public  boolean canMoveTo(ChessPosition position){
        return true;
    }
    public  boolean canKill(ChessPosition position){

        return true;
    }


}
