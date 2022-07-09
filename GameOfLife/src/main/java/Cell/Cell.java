package Cell;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import static java.util.stream.Collectors.toList;

public class Cell {
    private final int xCoordinate;
    private final int yCoordinate;

    public Cell(int row, int column) {
        this.xCoordinate = row;
        this.yCoordinate = column;
    }

    public List<Cell> neighbours() {
        List<Cell> neighbourCells = new LinkedList<>();
        for (int row = xCoordinate - 1; row <= xCoordinate + 1; row++) {
            for (int column = yCoordinate - 1; column <= yCoordinate + 1; column++) {
                if (row != xCoordinate || column != yCoordinate) {
                    neighbourCells.add(new Cell(row, column));
                }
            }
        }
        return neighbourCells;
    }

    public List<Cell> activeNeighbours(List<Cell> cells, List<Cell> neighbours) {
        return neighbours.stream().filter(cells::contains).collect(toList());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cell cell = (Cell) o;
        return xCoordinate == cell.xCoordinate && yCoordinate == cell.yCoordinate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCoordinate, yCoordinate);
    }


}