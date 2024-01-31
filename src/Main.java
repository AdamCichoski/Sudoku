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
    private PFont font;
    Rectangle r; //Testing variable (troubleshooting Rectangle class)
//    int x=0;
    public static void main(String[] args) {
        String[] input = {"src.Main"};
        PApplet.main(input);
    }

    /**
     * Built in PApplet method
     */
    public void setup(){
        font = createFont("Arial", 40, true);
        textFont(font);
//        (float)((800*0.85)/9)
    }

    /**
     * Built in PApplet method
     */
    public void settings(){
        board = new Board(this);
        size((short)board.SCREEN_WIDTH,(short)board.SCREEN_HEIGHT);
        r = new Rectangle(50,50, 50,this);
        r.setMatrixCoordinates((short) 1,(short)1,(byte)1);

//        if(x == 0){
//            board.printCurrent();
//            x++;
//        }
    }

    /**
     * Built in PApplet method
     */
    public void draw(){
        background(228466);

        r.render();
        board.render();
        //        testing();
    }

    /**
     * Method designed to test PApplet methods
     */
    public void testing(){
        PFont font = createFont("Times New Roman", 31);
        textFont(font);
        text("Word", 200, 200);

    }


}
