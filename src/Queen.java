public class Queen extends ChessPiece {
    String symbol = "Q";

    public Queen(String color) {
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
        if (line == toLine && column == toColumn || !chessBoard.checkPos(toLine) || !chessBoard.checkPos(toColumn))
            return false;
        if (line == toLine || column == toColumn||(Math.abs(toLine - line) == Math.abs(toColumn - column))) return true;
        return false;
    }
}