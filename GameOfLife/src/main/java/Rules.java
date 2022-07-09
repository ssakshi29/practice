import Cell.Cell;


import java.util.List;

public class Rules {

    void deaths(List<Cell>aliveCells,Cell cell, List<Cell> Cells) {

        List<Cell> neighbours = cell.neighbours();
        List<Cell> activeNeighbour = cell.activeNeighbours(Cells, neighbours);

        if (activeNeighbour.size() < 2 || activeNeighbour.size() > 3) {
            aliveCells.remove(cell);
        }
    }

    void lives(List<Cell> aliveCells, Cell cell, List<Cell> Cells) {
        List<Cell> neighbours = cell.neighbours();

        for (Cell cells : neighbours) {
            List<Cell> cellNeighbour =   cells.neighbours();
            List<Cell> activeNeighbour = cell.activeNeighbours(Cells, cellNeighbour);

            if (activeNeighbour.size() == 3) {
                if (!aliveCells.contains(cells)) {
                    aliveCells.add(cells);
                }
            }
        }
    }

}
