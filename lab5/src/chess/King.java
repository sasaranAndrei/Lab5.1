package chess;

import java.awt.*;

public class King extends Piece{

    public King(int x, int y, Color setColor) {
        super(x, y, setColor);
        setName("King");
    }

    @Override
    Boolean isValidMove(int new_coordX, int new_coordY, ChessTable chessTable) {
        return null;
    }

    @Override
    void movePiece(int new_coordX, int new_coordY, ChessTable chessTable) {

    }


}
