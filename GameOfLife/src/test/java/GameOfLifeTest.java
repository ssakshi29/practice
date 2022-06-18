import Cell.Cell;
import org.junit.jupiter.api.Test;

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





}
