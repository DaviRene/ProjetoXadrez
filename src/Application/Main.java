package Application;

import BoardGame.Board;
import BoardGame.Position;

public class Main {
    public static void main(String[] args) {

        Position pos = new Position(3,6);
        System.out.println(pos);

        Board board = new Board(8,8);
    }
}
