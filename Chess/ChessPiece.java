package Lesson7.Chess;

public abstract class ChessPiece {
    public String color;
    public boolean check = true;

    public ChessPiece(String color) {
        this.color = color;
    }

    public abstract String getColor();

    public boolean canMovieToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn){
        return check;
    }

    public abstract String getSymbol();

}
