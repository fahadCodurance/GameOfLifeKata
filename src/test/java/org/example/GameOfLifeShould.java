package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameOfLifeShould {

    @Test
    void return_empty_board(){

        Cell[][] cellBoard = {
                {new Cell(false), new Cell(false), new Cell(false)},
                {new Cell(false), new Cell(false), new Cell(false)},
                {new Cell(false), new Cell(false), new Cell(false)}};

        GameOfLife game = new GameOfLife(cellBoard);
        assertEquals(cellBoard, game.nextGeneration());
    }

    @Test
    void middle_cell_dies_through_underpopulation(){

        Cell[][] firstGeneration = {
                {new Cell(false), new Cell(false), new Cell(false)},
                {new Cell(false), new Cell(true), new Cell(false)},
                {new Cell(false), new Cell(false), new Cell(false)}};

        Cell[][] expectedSecondGeneration = {
                {new Cell(false), new Cell(false), new Cell(false)},
                {new Cell(false), new Cell(false), new Cell(false)},
                {new Cell(false), new Cell(false), new Cell(false)}};

        GameOfLife game = new GameOfLife(firstGeneration);
        assertEquals(expectedSecondGeneration, game.nextGeneration());
    }





}
