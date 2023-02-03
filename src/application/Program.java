package application;

import boardgame.Board;
import chess.ChessMath;
import chess.ChessPiece;

public class Program {
    public static void main(String[] args) {
        ChessMath cm = new ChessMath();
        UI.printBoard(cm.getPieces());
    }
}
