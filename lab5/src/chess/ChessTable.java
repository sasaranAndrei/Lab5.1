package chess;

import java.awt.*;

public class ChessTable {
    protected Piece piece[][] = new Piece[8][8];

    public ChessTable (Piece piece[][]){
        this.piece = piece;
    }

    public ChessTable() {

        for (int j = 0; j < 8; j++){
            piece[1][j] = new Pawn(1, j, Color.BLACK); // black pawn
            piece[6][j] = new Pawn(6, j, Color.WHITE); // white pawn
        }

        piece[0][0] = new Rook(0,0,Color.BLACK);
        piece[0][7] = new Rook(0,7,Color.BLACK); // black Rooks
        piece[7][0] = new Rook(7,0,Color.WHITE);
        piece[7][7] = new Rook(7,7,Color.WHITE); // white Rooks

        piece[0][1] = new Knight(0,1,Color.BLACK);
        piece[0][6] = new Knight(0,6,Color.BLACK); // black Knights
        piece[7][1] = new Knight(7,1,Color.WHITE);
        piece[7][6] = new Knight(7,6,Color.WHITE); // white Knights

        piece[0][2] = new Bishop(0,2,Color.BLACK);
        piece[0][5] = new Bishop(0,5,Color.BLACK); // black Bishops
        piece[7][2] = new Bishop(7,2,Color.WHITE);
        piece[7][5] = new Bishop(7,5,Color.WHITE); // white Bishops

        piece[0][3] = new Queen(0,3,Color.BLACK);
        piece[7][3] = new Queen(0,3,Color.WHITE); // Queens

        piece[0][4] = new Queen(0,4,Color.BLACK);
        piece[7][4] = new Queen(0,4,Color.WHITE); // Kings
    }

    public Piece[][] getPiece() {
        return piece;
    }

    public void setPiece(Piece[][] piece) {
        this.piece = piece;
    }

    Boolean addPiece (Piece newPiece){
        if (piece[newPiece.coordX][newPiece.coordY] != null){ // a piece is here already
            System.out.println("Occupied position !!!");
            return false;
        }
        else {
            piece[newPiece.coordX][newPiece.coordY] = newPiece;
            System.out.println("Piece added successfully");
            return true;
        }
    }

    void printRow (Piece[] row){
        for (Piece i : row) {
            if (i != null) {
                System.out.print(i.name + " ");
                System.out.print("\t");
            }
            else {
                System.out.print("\t");
            }
        }
        System.out.println();
    }

    public void printChessTable (){
        System.out.print("\t");
        for (int i = 0; i < 8; i++){
            System.out.print(i + "\t\t");
        }
        System.out.println();
        for (int i = 0; i < 8; i++){
            System.out.print(i + "\t");
            printRow(piece[i]);
        }
    }


}
