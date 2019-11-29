package chess;

import java.awt.*;

public class Bishop extends Piece {


    public Bishop(int x, int y, Color setColor) {
        super(x, y, setColor);
        this.setName("Bishop");
    }

    @Override
    Boolean isValidMove(int new_coordX, int new_coordY, ChessTable chessTable) {
        return null;
    }

    @Override
    void movePiece(int new_coordX, int new_coordY, ChessTable chessTable) {

    }


}
