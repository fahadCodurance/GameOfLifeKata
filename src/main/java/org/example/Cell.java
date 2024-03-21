package org.example;

public class Cell {
    private Status cellState;
    public enum Status {
        ALIVE,
        DEAD
    }
    public Cell(Status state) {
        this.cellState = state;
    }

    public Status livesToNextGeneration(Integer neighbourCount) {
        if(underPopulated(neighbourCount) || overPopulated(neighbourCount)) {
            cellState = Status.DEAD;
        }
        if(perfectConditions(neighbourCount)) {
            cellState = Status.ALIVE;
        }
        return cellState;
    }

    private static boolean perfectConditions(Integer neighbourCount) {
        return neighbourCount == 3;
    }

    private static boolean overPopulated(Integer neighbourCount) {
        return neighbourCount > 3;
    }

    private static boolean underPopulated(Integer neighbourCount) {
        return neighbourCount < 2;
    }

}
