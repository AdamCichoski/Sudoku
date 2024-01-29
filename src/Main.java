package src;
import processing.core.PApplet;
import processing.core.PFont;
import src.sudokuBoard.*;

/**
 * This is Sudoku game that operates in its own window.
 *
 * @author Adam Cichoski
 */
public class Main extends PApplet {
    private Board board;
//    int x=0;
    public void settings(){
        board = new Board(this);
        size((short)board.SCREEN_WIDTH,(short)board.SCREEN_HEIGHT);
//        if(x == 0){
//            board.printCurrent();
//            x++;
//        }
    }

    public void draw(){
        background(228466);
        
        board.render();
        //        testing();
    }

    public static void main(String[] args) {
        String[] input = {"src.Main"};
        PApplet.main(input);
    }

    public void testing(){
        PFont font = createFont("Times New Roman", 31);
        textFont(font);
        text("Word", 200, 200);

    }


}
