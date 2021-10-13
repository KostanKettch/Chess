public class Horse extends ChessPiece {
    String symbol = "H";

    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getSymbol() {
        return symbol;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (line == toLine && column == toColumn || !chessBoard.checkPos(toLine) || !chessBoard.checkPos(toColumn)||
                (chessBoard.board[toLine][toColumn] != null && chessBoard.board[toLine][toColumn].getColor().equals(chessBoard.nowPlayerColor())))
            return false;

        if ((Math.abs(toLine - line) == 2 && Math.abs(toColumn - column) == 1) ||
                (Math.abs(toLine - line) == 1 && Math.abs(toColumn - column) == 2)) return true;
       return false;
    }


}
