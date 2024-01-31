package src.sudokuBoard;
import processing.core.PApplet;
import processing.core.PFont;

public class Rectangle {
    private Byte cubeValue;
    private boolean editable;
    private float x;
    private float y;
    private float dimension;
    private short boardX;
    private short boardY;
    private PApplet screen;
    PFont font;

    /**
     * Constructor
     * @param x the x coordinate.
     * @param y the y coordinate.
     * @param dimension is the length of the x and y on the rectangle.
     * @param screen is the screen that the rectangles will be displayed on. This parameter is primarily used to call
     *               functions that are a part of the PApplet class directly onto the screen.
     */
    public Rectangle(float x, float y, float dimension, PApplet screen){
        this.x = x;
        this.y = y;
        this.dimension = dimension;
        this.screen = screen;
    }

    /**
     * Sets the value for a specific coordinate
     * @param boardX The x position inside the matrix for the Sudoku state
     * @param boardY The y position inside the matrix for the Sudoku state
     */
    public void setMatrixCoordinates(short boardX, short boardY, byte cubeValue){
        this.boardX = boardX;
        this.boardY = boardY;
        this.cubeValue = cubeValue;
        editable = false;
    }

    /**
     * Renders the rectangle/square or square to the screen
     * NOTE: In order to call this method, it would be best to create a font in
     * the setup method for the PApplet screen.
     */
    public void render(){
        screen.fill(255);
        screen.strokeWeight(1);
        screen.rect(x,y,dimension,dimension);
        screen.fill(0);
        screen.text(cubeValue, x+((dimension/4)),y+(3*(dimension/4)));
        float textWidth = screen.textWidth(""+cubeValue);
        screen.line(x+(dimension/4), y+(3*dimension/4), (x+(dimension/4)+textWidth), y+(3*dimension/4));
//        screen.text(cubeValue, x+(textWidth/2),y+(3*dimension/4));
    }
    public void example(){

    }
}