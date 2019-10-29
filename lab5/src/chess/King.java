package chess;

public class King extends Piece {
    public King(String pieceName, int x, int y, boolean state) {
        super(pieceName, x, y, state);

    }

    public King(int x, int y, boolean state) {
        super(x, y, state);
    }
}
