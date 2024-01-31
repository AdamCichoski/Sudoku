package src.sudokuBoard;
import processing.core.PApplet;
public class Board {
    public final float SCREEN_WIDTH = 1200, SCREEN_HEIGHT = 800;
    private final float shorterDimension = Math.min(SCREEN_WIDTH, SCREEN_HEIGHT);
    private final float longerDimension = Math.max(SCREEN_WIDTH, SCREEN_HEIGHT);
    private final float boxDimension = shorterDimension *(float)(0.85);
    private final float individualBoxSize = boxDimension/3;
    private final float individualNumberBoxSize = individualBoxSize/3;
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

    /**
     * Method to output the board onto the screen
     */
    public void render(){
        boardLayout();
    }

    /**
     * Draws the matrix layout of the sudoku board (9x9).
     * In this method, the editable and non-editable squares that display the values of the matrix are
     * rendered before adding the separators between each 3x3 square.
     */
    public void boardLayout(){
        screen.fill(255);
        checkScreenValid();
        numberCubeLayout();
        screen.strokeWeight(5);
        //These variables are built to alter the positions that the lines will be drawn onto the board
        short addy =(short)individualBoxSize, addx =(short)individualBoxSize;
        //Drawing the separators between the 3x3 squares
        for (short i=0;i<2;i++){
            screen.line((startingX+addx), startingY, (startingX+addx), (startingY+boxDimension));
            screen.line(startingX, (startingY +addy), (startingX+boxDimension), (startingY+addy));
            addx+= (short)individualBoxSize;
            addy+=(short)individualBoxSize;
        }
    }

    /**
     * Creates the 3x3 boxes inside of the board to store each individual number
     */
    private void numberCubeLayout(){
        screen.strokeWeight(1);
        checkScreenValid();
        short addy=0, addx=0;
        byte count =0;
        short x = (short) startingX;
        short y = (short) startingY;
        for (short i=0; i<9 ;i++){
            y += addy;
            for (short j=0;j<9;j++){
                screen.rect(startingX + addx, startingY + addy, individualBoxSize/3, individualBoxSize/3);
                addx+= individualBoxSize/3;
            }
            addy+= individualBoxSize/3;
            addx =0;

        }

    }

    /**
     * This method is used to ensure that the board is currently valid in terms of the rules of Sudoku.
     * This game only checks in the 3x3 square, horizontally, and vertically. Diagonally is not considered.
     * @return game is valid or not
     */
    private boolean checkMatrix(){
        return false;
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

    /**
     * This method is used for testing. It prints the current state of the matrix of Sudoku into the termnial
     */
    public void printCurrent(){
        for(int i=0;i<currentState.length;i++){
            for (int j=0;j<currentState[i].length;j++){
                System.out.print(currentState[i][j]+ "  ");
            }
            System.out.println();
        }
    }

    /**
     * Checks to make sure that there is a valid screen
     */
    public void checkScreenValid(){
        if(screen == null){
            System.out.println("Screen variable is null. Input a screen to display using setScreen(PApplet screen) method.");
            return;
        }
    }
}
