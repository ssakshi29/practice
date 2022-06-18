import Cell.Cell;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameOfLifeTest {

    @Test
    void ChecksIfLiveCellsDieWhenLiveNeighbourCellsAreFewerThanTwo(){

        GameOfLifeBoard board = new GameOfLifeBoard(2,2);
        board.aliveCell(Cell.createAliveCell(0,0));
        board.aliveCell(Cell.createAliveCell(1,1));


        GameOfLifeBoard nextBoardGeneration =board.nextGeneration();

        assertTrue(nextBoardGeneration.allDead());

    }

    @Test
    void ChecksIfAliveCellsLiveWithTwoAliveNeighbourCells() {
        GameOfLifeBoard board = new GameOfLifeBoard(3,3);
        board.aliveCell(Cell.createAliveCell(0,1));
        board.aliveCell(Cell.createAliveCell(1,1));
        board.aliveCell(Cell.createAliveCell(2,1));


        GameOfLifeBoard nextBoardGeneration =board.nextGeneration();

        assertTrue(nextBoardGeneration.isAlive(new Cell(1, 2)));
    }


    @Test
    void ChecksIfDeadCellsLiveWithExactlyThreeLiveNeighbours()
    {
        GameOfLifeBoard board = new GameOfLifeBoard(3,3);
        board.aliveCell(Cell.createAliveCell(0,1));
        board.aliveCell(Cell.createAliveCell(1,2));
        board.aliveCell(Cell.createAliveCell(2,1));

        GameOfLifeBoard nextBoardGeneration =board.nextGeneration();

        assertTrue(nextBoardGeneration.isAlive(new Cell(1, 1)));

    }

    @Test
    void ChecksIfAliveCellsDieWithMoreThanThreeLiveNeighbours()
    {
        GameOfLifeBoard board = new GameOfLifeBoard(3,3);
        board.aliveCell(Cell.createAliveCell(0,1));
        board.aliveCell(Cell.createAliveCell(1,0));
        board.aliveCell(Cell.createAliveCell(1,1));
        board.aliveCell(Cell.createAliveCell(1,2));
        board.aliveCell(Cell.createAliveCell(2,1));

        GameOfLifeBoard nextBoardGeneration =board.nextGeneration();

        assertFalse(nextBoardGeneration.isAlive(new Cell(1, 1)));


    }

}
