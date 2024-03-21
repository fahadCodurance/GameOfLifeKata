package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CellShould {


    /*@Test
    public void be_alive() {
        Cell cell = new Cell(true);
        assertTrue(cell.livesToNextGeneration());
    }

    @Test
    public void be_dead() {
        Cell cell = new Cell(false);
        assertFalse(cell.livesToNextGeneration());
    }*/

    private Cell aliveCell;

    @BeforeEach
    void setup(){
        aliveCell = new Cell(true);
    }

    @Test
    public void die_with_one_neighbour(){
        assertFalse(aliveCell.livesToNextGeneration(1));
    }

    @Test
    public void die_with_zero_neighbours() {
        assertFalse(aliveCell.livesToNextGeneration(0));
    }

    @Test
    public void die_with_four_neighbours(){
        assertFalse(aliveCell.livesToNextGeneration(4));
    }

    @Test
    public void die_with_five_neighbours() {
        assertFalse(aliveCell.livesToNextGeneration(5));
    }

    @Test
    public void stays_alive_with_2_or_3_neighbours(){
        assertTrue(aliveCell.livesToNextGeneration(2));
        assertTrue(aliveCell.livesToNextGeneration(3));
    }

    @Test
    public void dead_cell_becomes_alive_with_three_neighbours(){
        Cell deadCell = new Cell(false);
        assertTrue(deadCell.livesToNextGeneration(3));
    }

}
