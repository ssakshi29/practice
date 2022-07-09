import Cell.Cell;


import java.util.LinkedList;
import java.util.List;

class GameOfLife {

    private final List<Cell> Cells;

    public GameOfLife(List<Cell> Cells) {
        this.Cells = Cells;
    }


    public List<Cell> nextGeneration() {
        List<Cell> aliveCells = new LinkedList<>(Cells);
        Rules rules = new Rules();


        for (Cell cell : Cells) {
            rules.lives(aliveCells, cell, Cells) ;
            rules.deaths(aliveCells,cell, Cells) ;
        }


        return aliveCells;
    }
}

