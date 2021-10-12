public class Horse extends ChessPiece{
    String color;

    public Horse(String color) {
        super(color);
        this.color=color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "H";
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        return false;
    }


}
