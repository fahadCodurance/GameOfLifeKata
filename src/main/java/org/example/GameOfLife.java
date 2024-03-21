package org.example;

public class GameOfLife {

    private final Cell [][] board;
    public GameOfLife(Cell[][] board) {
        this.board = board;
    }

    public Cell[][] nextGeneration() {
        for (Cell[] cellRow : board) {
            for (Cell cell : cellRow) {
                /*if(cell.Status == true) {

                }*/
            }
        }
        return board;
    }
}
