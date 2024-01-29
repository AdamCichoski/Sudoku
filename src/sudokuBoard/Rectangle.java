package src.sudokuBoard;
import processing.core.PApplet;
import processing.core.PFont;

public class Rectangle {
    private byte cubeValue;
    private boolean editable;
    private float x;
    private float y;
    private float xLength;
    private float yLength;
    private short boardX;
    private short boardY;
    private PApplet screen;
    PFont font;

    /**
     * Constructor
     * @param x the x coordinate
     * @param y the y coordinate
     * @param xLength the length of the rectanlge in terms of x length
     * @param yLength the length of the rectangle in terms of y length
     */
    public Rectangle(float x, float y, float xLength, float yLength, PApplet screen){
        this.x = x;
        this.y = y;
        this.xLength = xLength;
        this.yLength = yLength;
        this.screen = screen;
        this.cubeValue = -1;
        this.editable = (cubeValue == -1);

    }
    public void setMatrixCoordinates(short boardX, short boardY){
        this.boardX = boardX;
        this.boardY = boardY;
    }

    public void render(){
        screen.rect(x,y,xLength,yLength);
        font = screen.createFont("Times New Roman", 31);
    }
    public void setCubeValue(byte number){
        this.cubeValue = number;
    }


    public void example(){

    }
}