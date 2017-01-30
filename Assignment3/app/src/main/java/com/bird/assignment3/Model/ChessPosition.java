package com.bird.assignment3.Model;


//Chess position on board

public class ChessPosition {


    private Integer column;
    private Integer row;


    public ChessPosition(Integer column, Integer row) {
        this.column = column;
        this.row = row;
    }


    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public boolean isValidPosition() {
        return (this.column >= ChessBoard.COLUMN_BEGIN_INDEX &&
                this.column <= ChessBoard.COLUMN_END_INDEX &&
                this.row >= ChessBoard.ROW_BEGIN_INDEX &&
                this.row <= ChessBoard.ROW_END_INDEX);


    }

    public boolean equals(ChessPosition chessPosition) {
        return (this.row == chessPosition.row &&
                this.column == chessPosition.column);
    }
}
