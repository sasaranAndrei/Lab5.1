package chess;

import java.awt.*;

public class Piece {
    private String pieceName;
    private Coordinate coordinate;
    private boolean state; // false = dead, true = available
    private Color colour;

    public Piece(String pieceName, Coordinate coordinate, boolean state, Color colour) {
        this.pieceName = pieceName;
        this.coordinate = coordinate;
        this.state = state;
        this.colour = colour;
    }

    public Piece(Coordinate coordinate, boolean state, Color colour) {
        this.coordinate = coordinate;
        this.state = state;
        this.colour = colour;
    }

    public String getPieceName() {
        return pieceName;
    }

    public void setPieceName(String pieceName) {
        this.pieceName = pieceName;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }



    public boolean isLegalMove (Coordinate newCoordinate){
        // test for available coordinates
        if (this.getCoordinate().getCoordX() < 0 || this.getCoordinate().getCoordX() > 7 || newCoordinate.getCoordX() < 0 || newCoordinate.getCoordX() > 7) return false;
        if (this.getCoordinate().getCoordY() < 0 || this.getCoordinate().getCoordY() > 7 || newCoordinate.getCoordY() < 0 || newCoordinate.getCoordY() > 7) return false;
        if (this.getCoordinate().sameValuesAs(newCoordinate)) return false; // a player must move
        return true;
    }

    public boolean isValidMove (Coordinate newCorordinate){
        if (this.isLegalMove(newCorordinate) == false) return false;
        // to do : tests for all game's rules (ex : checkmate)
        return true;
    }

    public void movePiece (Coordinate newCoordinate){
        if (this.isValidMove(newCoordinate) == true){

        }
    }

}
