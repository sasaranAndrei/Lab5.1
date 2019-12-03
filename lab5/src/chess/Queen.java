package chess;

import java.awt.*;

public class Queen extends Piece {

    public Queen(int x, int y, Color setColor) {
        super(x, y, setColor);
        setName("Queen");
    }

    @Override
    Boolean isValidMove(int new_coordX, int new_coordY, ChessTable chessTable) {
        if (chessTable.piece[new_coordX][new_coordY] != null && chessTable.piece[new_coordX][new_coordY].color == chessTable.piece[coordX][coordY].color) { // already a piece there
            // can t take an own piece
            return false;
        }
        else {
            if (this.coordX + this.coordY == new_coordX + new_coordY){ // same /

                for(int i = this.coordX - 1, j = this.coordY + 1; i > new_coordX; i--, j++) { //  ^/^
                    if (chessTable.piece[i][j] != null){ // smth in between
                        return false;
                    }
                }

                for (int i = this.coordX + 1, j = this.coordY - 1; i < new_coordX; i++, j--){ // ./.
                    if (chessTable.piece[i][j] != null){ // smth in between
                        return false;
                    }
                }
            }
            else if (this.coordX - this.coordY == new_coordX - new_coordY) { // same \

                for (int i = this.coordX - 1, j = this.coordY - 1; i > new_coordX; i--, j--) {
                    if (chessTable.piece[i][j] != null) { // smth in between
                        return false;
                    }
                }

                for (int i = this.coordX + 1, j = this.coordY + 1; i < new_coordX; i++, j++) {
                    if (chessTable.piece[i][j] != null) { // smth in between
                        return false;
                    }
                }
            } // bishop stuff
            else {// rook stuff
                if (this.coordY == new_coordY && this.coordX != new_coordX){ // vertical move
                    for (int i = this.coordX + 1; i < new_coordX; i++){
                        if (chessTable.piece[i][this.coordY] != null){ // smth in between
                            return false;
                        }
                    }
                    for (int i = this.coordX - 1; i > new_coordX; i--){
                        if (chessTable.piece[i][this.coordY] != null){ // smth in between
                            return false;
                        }
                    } // just one of this for-s are executed

                }
                else if (this.coordX == new_coordX && this.coordY != new_coordY){ // horizontal move
                    for (int j = this.coordY + 1; j < new_coordY; j++){
                        if (chessTable.piece[this.coordX][j] != null){ // smth in between
                            return false;
                        }
                    }
                    for (int j = this.coordY - 1; j > new_coordY; j--){
                        if (chessTable.piece[this.coordX][j] != null){ // smth in between
                            return false;
                        }
                    } // just one of this for-s are executed

                }
                else return false; // not a Rook-style move
                // if it passes all the tests
                return true;
            }
            return false;
        }
    }

    @Override
    void movePiece(int new_coordX, int new_coordY, ChessTable chessTable) {
        if (isValidMove(new_coordX, new_coordY, chessTable)){
            if (chessTable.piece[new_coordX][new_coordY] != null){
                System.out.println("Piece captured");
            }
            chessTable.piece[coordX][coordY] = null;
            this.coordX = new_coordX;
            this.coordY = new_coordY;
            chessTable.piece[coordX][coordY] = this;
            System.out.println("Piece moved successfully");
        }
        else {
            System.out.println("Not moving :(");
        }
    }


}
