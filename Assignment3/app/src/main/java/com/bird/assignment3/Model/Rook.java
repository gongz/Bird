package com.bird.assignment3.Model;

//        Rook: A rook can move horizontally or vertically.
// It can kill any opponent’s piece if it can move to its place.

public class Rook extends ChessPiece {


    public Rook(ChessPosition cPosition, ChessPieceColor cColor) {
        super();
        this.setCurrentPosition(cPosition);
        this.setPieceType(ChessPieceType.ROOK);
        this.setPieceColor(cColor);
    }


    public  boolean canMoveTo(ChessPosition position){
        //a piece can't move outside the board
        if(!position.isValidPosition()){
            return false;
        }
        //a piece can't move to its current position
        if(position.equals(currentPosition)){
            return false;
        }
        //knight requires a position on same row or column
        if(currentPosition.getRow().equals(position.getRow())||
                currentPosition.getColumn().equals(position.getColumn())){

            if(true){
                //no other piece is on the way
                return true;
            } else {

                return false;
            }
        } else {
            return false;
        }

    }
    public  boolean canKill(ChessPosition position){
        return canMoveTo(position);
    }
}
