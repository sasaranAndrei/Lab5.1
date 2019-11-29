package chess;

import java.awt.*;

public class EmptySpace extends Piece {
    public EmptySpace(int coordX, int coordY) {
        super(coordX, coordY);
        this.name = "<empty space>";
        this.color = null;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    Boolean isValidMove(int new_coordX, int new_coordY, ChessTable chessTable) {
        return null;
    }

    @Override
    void movePiece(int new_coordX, int new_coordY, ChessTable chessTable) {

    }


}
