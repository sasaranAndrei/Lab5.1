package chess;

import java.awt.*;

public class MainClass {
    public static void main (String args[]){
        ChessTable chess = new ChessTable();
        //chess.piece[4][4] = new Pawn(4,4, Color.BLACK);
        chess.printChessTable();
        /*
        Piece[][] table = new Piece[8][8];
        ChessTable chess2 = new ChessTable(table);
        Rook r1 = new Rook (4,2,Color.WHITE);
        Bishop b1 = new Bishop (2,4,Color.BLACK);
        //Rook r2 = new Rook (7,2,Color.BLACK);


        chess2.printChessTable();
        chess2.addPiece(r1);
        chess2.addPiece(b1);
        chess2.printChessTable();
        r1.movePiece(7,2,chess2);
        chess2.printChessTable();

        b1.movePiece(4,2, chess2);
        chess2.printChessTable();

        r1.movePiece(4,2,chess2);
        chess2.printChessTable();
        //chess.printChessTable();
        */
        chess.piece[6][5].movePiece(4,5,chess);
        chess.printChessTable();
        chess.piece[1][4].movePiece(3,4,chess);
        chess.printChessTable();
        chess.piece[6][4].movePiece(4,4,chess);
        chess.printChessTable();
       // chess.piece[0][3].movePiece(1,4,chess);
        chess.printChessTable();
    }
}
