public class King extends ChessPiece {
    String symbol = "K";

    public King(String color) {
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
        if ((line == toLine || Math.abs(toLine - line) == 1) &&
                (column == toColumn || Math.abs(toColumn - column) == 1))
        return true;
        return false;
    }

    public boolean isUnderAttack(ChessBoard chessBoard, int line,int column){
        return false;
    }

}
