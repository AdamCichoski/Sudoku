package src.sudokuBoard;
import processing.core.PApplet;
public class Board {
    public final float SCREEN_WIDTH = 1200, SCREEN_HEIGHT = 800;
    private final float shorterDimension = Math.min(SCREEN_WIDTH, SCREEN_HEIGHT);
    private final float longerDimension = Math.max(SCREEN_WIDTH, SCREEN_HEIGHT);
    private final float boxDimension = shorterDimension *(float)(0.85);
    private final float individualBoxSize = boxDimension/3;
    private final float boxDisplacement = (shorterDimension - boxDimension)/(float)2.0;
    /**
     * The starting value for the starting x position for the layout of the actual sudoku box came from
     * trial and error. The coefficient was just to push the box more over to the right, and was a number
     * that took testing.
     */
    private final float startingX = (float)(1.2)*(SCREEN_WIDTH/3),   startingY = (SCREEN_HEIGHT - boxDimension)/2;

    private PApplet screen;

    private byte[][] currentState = new byte[9][9];

    /**
     * Constructor
     * @param screen is the screen that this board will be displayed on
     */
    public Board(PApplet screen){
        this.screen = screen;
    }

    public void boardLayout(){
        if(screen == null){
            System.out.println("Screen variable is null. Input a screen to display using setScreen(PApplet screen) method.");
            return;
        }
        short addy =0, addx =0;
        for(short i=0;i<3;i++){
            float y = startingY + addy;
            for(short j =0; j<3;j++){
                screen.rect(startingX +addx, startingY +addy, individualBoxSize, individualBoxSize);
                addx+=individualBoxSize;
            }
            addx=0;
            addy+=individualBoxSize;
        }
    }

    /**
     * Generates a random starting layout for the board in terms of the placement of the numbers
     */
    public void generateBoard(){
        byte totalGeneratesCubes = 12;
        for (byte i=0; i<totalGeneratesCubes; i++){
            byte row = (byte)((byte)(Math.random()*9)+1);
            byte column = (byte)((byte)(Math.random()*9)+1);
            while(currentState[row][column] != 0){

            }
        }
    }

    public void printCurrent(){
        for(int i=0;i<currentState.length;i++){
            for (int j=0;j<currentState[i].length;j++){
                System.out.print(currentState[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
