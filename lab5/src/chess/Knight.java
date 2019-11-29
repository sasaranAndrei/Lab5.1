package chess;

import java.awt.*;

public class Knight extends Piece {
    public Knight(int x, int y, Color setColor) {
        super(x, y, setColor);
        setName("Knight");
    }

    @Override
    Boolean isValidMove(int new_coordX, int new_coordY, ChessTable chessTable) {
        return null;
    }

    @Override
    void movePiece(int new_coordX, int new_coordY, ChessTable chessTable) {

    }

}
