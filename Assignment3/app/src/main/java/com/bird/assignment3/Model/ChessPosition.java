package com.bird.assignment3.Model;

/**
 * Created by v596747 on 1/30/17.
 */

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



}
