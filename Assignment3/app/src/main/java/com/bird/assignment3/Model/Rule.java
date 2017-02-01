package com.bird.assignment3.Model;

public class Rule {
    public static boolean onDiagonal(ChessPosition p1, ChessPosition p2) {
        return Math.abs(p1.getRow() - p2.getRow()) ==
                Math.abs(p1.getColumn() - p2.getColumn());
    }

    public static boolean withinNRow(ChessPosition p1, ChessPosition p2, Integer n) {
        Integer rowDis = Math.abs(p1.getRow() - p2.getRow());
        return (rowDis <= n);
    }

    public static boolean withinNColumn(ChessPosition p1, ChessPosition p2, Integer n) {
        Integer colDis = Math.abs(p1.getColumn() - p2.getColumn());
        return (colDis <= n);
    }

}
