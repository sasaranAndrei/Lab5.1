package chess;

import java.awt.*;

public class Queen extends Piece {

    public Queen(int x, int y, Color setColor) {
        super(x, y, setColor);
        setName("Queen");
    }

    @Override
    Boolean isValidMove(int new_coordX, int new_coordY, ChessTable chessTable) {
        return null;
    }

    @Override
    void movePiece(int new_coordX, int new_coordY, ChessTable chessTable) {

    }


}
