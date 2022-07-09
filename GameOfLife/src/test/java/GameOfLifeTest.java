import Cell.Cell;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameOfLifeTest {

    @Test
    void ShouldCheckNextGenerationBlockPatternInGrid() {
        List<Cell> Cells = new LinkedList<>();
        Cells.add(new Cell(1, 1));
        Cells.add(new Cell(1, 2));
        Cells.add(new Cell(2, 1));
        Cells.add(new Cell(2, 2));

        List<Cell> expectedAliveCells = new LinkedList<>();
        expectedAliveCells.add(new Cell(1, 1));
        expectedAliveCells.add(new Cell(1, 2));
        expectedAliveCells.add(new Cell(2, 1));
        expectedAliveCells.add(new Cell(2, 2));


        GameOfLife board = new GameOfLife(Cells);

        List<Cell> nextGenerationAliveCells = board.nextGeneration();

        assertEquals(expectedAliveCells, nextGenerationAliveCells);

    }


    @Test
    void ShouldCheckNextGenerationBoatPatternInGrid() {
        List<Cell> Cells = new LinkedList<>();
        Cells.add(new Cell(0, 1));
        Cells.add(new Cell(1, 0));
        Cells.add(new Cell(2, 1));
        Cells.add(new Cell(0, 2));
        Cells.add(new Cell(1, 2));

        List<Cell> expectedAliveCells = new LinkedList<>();
        expectedAliveCells.add(new Cell(0, 1));
        expectedAliveCells.add(new Cell(1, 0));
        expectedAliveCells.add(new Cell(2, 1));
        expectedAliveCells.add(new Cell(0, 2));
        expectedAliveCells.add(new Cell(1, 2));


        GameOfLife board = new GameOfLife(Cells);

        List<Cell> nextGenerationAliveCells = board.nextGeneration();

        assertEquals(expectedAliveCells, nextGenerationAliveCells);

    }


    @Test
    void ShouldCheckNextGenerationBlinkerPatternInGrid() {
        List<Cell> Cells = new LinkedList<>();
        Cells.add(new Cell(1, 1));
        Cells.add(new Cell(1, 0));
        Cells.add(new Cell(1, 2));


        List<Cell> expectedAliveCells = new LinkedList<>();
        expectedAliveCells.add(new Cell(1, 1));
        expectedAliveCells.add(new Cell(0, 1));
        expectedAliveCells.add(new Cell(2, 1));



        GameOfLife board = new GameOfLife(Cells);

        List<Cell> nextGenerationAliveCells = board.nextGeneration();



        assertEquals(expectedAliveCells, nextGenerationAliveCells);

    }

    @Test
    void ShouldCheckNextGenerationToadPatternInGrid() {
        List<Cell> cells = new LinkedList<>();
        cells.add(new Cell(1, 1));
        cells.add(new Cell(1, 2));
        cells.add(new Cell(1, 3));
        cells.add(new Cell(2, 2));
        cells.add(new Cell(2, 3));
        cells.add(new Cell(2, 4));


        List<Cell> expectedAliveCells = new LinkedList<>();
        expectedAliveCells.add(new Cell(1, 1));
        expectedAliveCells.add(new Cell(2, 4));
        expectedAliveCells.add(new Cell(0, 2));
        expectedAliveCells.add(new Cell(2, 1));
        expectedAliveCells.add(new Cell(1, 4));
        expectedAliveCells.add(new Cell(3, 3));



        GameOfLife board = new GameOfLife(cells);

        List<Cell> nextGeneration = board.nextGeneration();


        assertEquals(expectedAliveCells, nextGeneration);
    }


}
