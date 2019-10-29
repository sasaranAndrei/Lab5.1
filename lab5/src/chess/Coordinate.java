package chess;

public class Coordinate {
    private int coordX;
    private int coordY;
    private Piece piece; // if piece = Null => empty spot

    public Coordinate(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.piece = null;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public boolean sameValuesAs (Coordinate coordinate){
        if (this.getCoordX() != coordinate.getCoordX()) return false;
        if (this.getCoordY() != coordinate.getCoordY()) return false;
        return true;
    }
}
