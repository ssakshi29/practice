import Cell.Cell;

import java.util.HashSet;
import java.util.Set;

public class GameOfLifeBoard {
    private final int width;
    private final int height;

    private final Set<Cell> aliveCells = new HashSet<>();

    public GameOfLifeBoard(int height,int width) {
        this.width = width;
        this.height=height;
    }

   public void aliveCell(Cell cell){
       aliveCells.add(cell);
   }

   public boolean allDead()
   {
       return aliveCells.isEmpty();
   }

    public boolean isAlive(Cell cell)
    {
        return aliveCells.contains(cell);
    }

    public GameOfLifeBoard nextGeneration() {
       GameOfLifeBoard nextBoardGeneration = new GameOfLifeBoard(height,width);

       for(int i=0;i<height;i++) {
           for (int j = 0; j < width; j++) {
             if (!aliveCells.contains(new Cell(i, j)) && countneighbourCells(i, j) == 3)
                  nextBoardGeneration.aliveCell(Cell.createAliveCell(i, j));
               if (((countneighbourCells(i, j) == 2) || (countneighbourCells(i, j) == 3)) && aliveCells.contains(new Cell(i, j))) {
                   nextBoardGeneration.aliveCell(Cell.createAliveCell(i, j));
               }
               }
           }
        return nextBoardGeneration;
    }


    private int countneighbourCells(int i, int j) {
          Cell cell = new Cell(i,j);
          int liveCells=0;
          int[][] neighbourCells = cell.neighbours();

          for (int[] neighbourCell : neighbourCells)
            if (aliveCells.contains(new Cell(neighbourCell[0], neighbourCell[1]))) {
                liveCells++;
            }

      return liveCells;
    }



}
