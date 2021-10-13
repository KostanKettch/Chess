public class Pawn extends ChessPiece {
    String symbol = "P";

    public Pawn(String color) {
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
        if (line == toLine && column == toColumn || !chessBoard.checkPos(toLine) || !chessBoard.checkPos(toColumn) ||
                (chessBoard.board[toLine][toColumn] != null && chessBoard.board[toLine][toColumn].getColor().equals(chessBoard.nowPlayerColor())))
            return false;

        int startPos;
        if (color.equals("White")) startPos = 1;
        else startPos = 6;

        if (toColumn == column && ((getColor().equals("White") && toLine - line == 1 || getColor().equals("Black") && toLine - line == -1) || (line == startPos && Math.abs(toLine - line) == 2)) ||
                (chessBoard.board[toLine][toColumn] != null && !chessBoard.board[toLine][toColumn].getColor().equals(chessBoard.nowPlayerColor()) && Math.abs(toColumn - column) == 1))
            return true;

        return false;
    }


}
