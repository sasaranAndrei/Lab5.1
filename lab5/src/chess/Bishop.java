package chess;

import java.awt.*;

public class Bishop extends Piece {


    public Bishop(int x, int y, Color setColor) {
        super(x, y, setColor);
        this.setName("Bishop");
    }

    @Override
    Boolean isValidMove(int new_coordX, int new_coordY, ChessTable chessTable) {
        if (chessTable.piece[new_coordX][new_coordY] != null && chessTable.piece[new_coordX][new_coordY].color == chessTable.piece[coordX][coordY].color) { // already a piece there
            // can t take an own piece
            return false;
        } else { // if there s nothing there
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

                for (int i = this.coordX - 1, j = this.coordY - 1; i > new_coordX; i--, j--){
                    if (chessTable.piece[i][j] != null){ // smth in between
                        return false;
                    }
                }

                for (int i = this.coordX + 1, j = this.coordY + 1; i < new_coordX; i++, j++){
                    if (chessTable.piece[i][j] != null){ // smth in between
                        return false;
                    }
                }
            }
            else {
                System.out.println("Not a Bishop type move");
                return false;
            }
        }
        return true;
    }

    @Override
    void movePiece(int new_coordX, int new_coordY, ChessTable chessTable) {
        if (isValidMove(new_coordX, new_coordY, chessTable)){
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
