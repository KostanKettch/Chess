public class Bishop extends ChessPiece {
    String symbol = "B";

    public Bishop(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.color;
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

        if (Math.abs(toLine - line) == Math.abs(toColumn - column)) return true;
        return false;
    }
}
