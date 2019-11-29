package chess;

import java.awt.*;

public class Pawn extends Piece {


    public Pawn(int x, int y, Color setColor) {
        super(x, y, setColor);
        this.setName("Pawn");
    }

    @Override
    Boolean isValidMove(int new_coordX, int new_coordY, ChessTable chessTable) {
        return null;
    }

    @Override
    void movePiece(int new_coordX, int new_coordY, ChessTable chessTable) {

    }

}
