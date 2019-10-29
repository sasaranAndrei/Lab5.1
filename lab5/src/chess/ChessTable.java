package chess;

public class ChessTable {
    public static final int size = 8;

    private Coordinate[] table;//  = new Coordinate[size*size];

    public ChessTable {
        table = new Coordinate[64];
        for (int i = 0 ; i < size*size;i++){
            System.out.println(table[i].getCoordX());
        }
    }
}
