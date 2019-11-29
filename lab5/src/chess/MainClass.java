package chess;

import java.awt.*;

public class MainClass {
    public static void main (String args[]){
        ChessTable chess = new ChessTable();
        //chess.piece[4][4] = new Pawn(4,4, Color.BLACK);
        //chess.printChessTable();
        Piece[][] table = new Piece[8][8];
        ChessTable chess2 = new ChessTable(table);
        Rook r1 = new Rook (4,2,Color.WHITE);
        //Rook r2 = new Rook (7,2,Color.BLACK);

        chess2.printChessTable();
        chess2.addPiece(r1);
        chess2.printChessTable();
        r1.movePiece(7,2,chess2);
        chess2.printChessTable();

      //  chess.printChessTable();


    }
}
