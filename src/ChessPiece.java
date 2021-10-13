public abstract class ChessPiece {
    String color;
    boolean check = true;
    String symbol;


    public abstract String getColor();

    public abstract String getSymbol();

    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);


    public ChessPiece(String color) {
        this.color = color;
    }
}
