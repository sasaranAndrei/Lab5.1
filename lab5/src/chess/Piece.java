package chess;

import java.awt.*;

abstract public class Piece {
    protected String name;
    protected int coordX;
    protected int coordY;
    protected Color color;

    public Piece(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public Piece(int x, int y, Color setColor) {
        coordX = x;
        coordY = y;
        color = setColor;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract Boolean isValidMove (int new_coordX, int new_coordY, ChessTable chessTable);
    abstract void movePiece(int new_coordX, int new_coordY, ChessTable chessTable);
}
