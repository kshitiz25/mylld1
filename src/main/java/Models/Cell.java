package Models;

public class Cell {
    private Player players;
    private int row;
    private int col;
    private CellState cellState;

    public Cell(int i, int j) {
        this.row =i;
        this.col =j;
        this.cellState = CellState.EMPTY;
    }

    public Player getPlayers() {
        return players;
    }

    public void setPlayers(Player players) {
        this.players = players;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }


}