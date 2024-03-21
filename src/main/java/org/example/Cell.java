package org.example;

public class Cell {
    private boolean cellState;
    
    public Cell(boolean state) {
        this.cellState = state;
    }

    public boolean livesToNextGeneration(Integer neighbourCount) {
        if(neighbourCount < 2 || neighbourCount > 3) {
            cellState = false;
        }
        if(neighbourCount == 3) {
            cellState = true;
        }
        return cellState;
    }

}
