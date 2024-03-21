package org.example;

public class Cell {
    private boolean cellState;
    private final boolean ALIVE = true;
    private final boolean DEAD = false;
    public Cell(boolean state) {
        this.cellState = state;
    }

    public boolean livesToNextGeneration(Integer neighbourCount) {
        if(underPopulated(neighbourCount) || overPopulated(neighbourCount)) {
            cellState = DEAD;
        }
        if(perfectConditions(neighbourCount)) {
            cellState = ALIVE;
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
