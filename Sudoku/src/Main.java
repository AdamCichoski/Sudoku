import processing.core.PApplet;
import sudokuBoard.*;
public class Main extends PApplet {
    private Board board;
    int x=0;
    public void settings(){
        board = new Board(this);
        size((short)board.SCREEN_WIDTH,(short)board.SCREEN_HEIGHT);
        if(x == 0){
            board.printCurrent();
            x++;
        }
    }

    public void draw(){
        background(228466);

        board.boardLayout();
    }

    public static void main(String[] args) {
        String[] input = {"Main"};
        PApplet.main(input);
    }
}