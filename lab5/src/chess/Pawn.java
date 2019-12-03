package chess;

import java.awt.*;

public class Pawn extends Piece {


    public Pawn(int x, int y, Color setColor) {
        super(x, y, setColor);
        this.setName("Pawn");
    }

    @Override
    Boolean isValidMove(int new_coordX, int new_coordY, ChessTable chessTable) {
        if (chessTable.piece[new_coordX][new_coordY] != null){ // already a piece there
            return false;
        }
        // white
        if (this.color == Color.WHITE){
            if (new_coordX == 4){ // move two
                return true;
            }
            if (new_coordX == this.coordX - 1 && this.coordY == new_coordY){ // move one
                return true;
            }
            if (new_coordX == this.coordX - 1){ // strike
                if (new_coordY == this.coordY - 1 || new_coordY == this.coordY + 1){
                    return true;
                }
            }

            return false; // not a pawn type move
        }
        else if (this.color == Color.BLACK){
            if (new_coordX == 3){ // move two
                return true;
            }
            if (new_coordX == this.coordX + 1 && this.coordY == new_coordY){ // move one
                return true;
            }
            if (new_coordX == this.coordX + 1){ // strike
                if (new_coordY == this.coordY - 1 || new_coordY == this.coordY + 1){
                    return true;
                }
            }

            return false; // not a pawn type move
        }
        return false;
    }

    @Override
    void movePiece(int new_coordX, int new_coordY, ChessTable chessTable) {
        if (isValidMove(new_coordX, new_coordY, chessTable)){
            if (chessTable.piece[new_coordX][new_coordY] != null){
                System.out.println("Piece captured");
            }
            chessTable.piece[this.coordX][this.coordY] = null;
            this.coordX = new_coordX;
            this.coordY = new_coordY;
            chessTable.piece[this.coordX][this.coordY] = this;
            System.out.println("Piece moved successfully");
        }
        else {
            System.out.println("Not moving :(");
        }
    }

}
