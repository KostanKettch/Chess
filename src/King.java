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
        if (line == toLine && column == toColumn || !chessBoard.checkPos(toLine) || !chessBoard.checkPos(toColumn)||
                (chessBoard.board[toLine][toColumn] != null && chessBoard.board[toLine][toColumn].getColor().equals(chessBoard.nowPlayerColor())))
            return false;
        if ((line == toLine || Math.abs(toLine - line) == 1) &&
                (column == toColumn || Math.abs(toColumn - column) == 1))
            return true;

        return false;
    }

    public boolean isUnderAttack(ChessBoard chessBoard, int line, int column) {
        if (chessBoard.checkPos(line) && chessBoard.checkPos(column)) {
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    if (chessBoard.board[i][j] != null) {
                        if (!chessBoard.board[i][j].getColor().equals(color) && chessBoard.board[i][j].canMoveToPosition(chessBoard, i, j, line, column)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } else return false;
    }
}
