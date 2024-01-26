package src.sudokuBoard;

public class Rectangle {
    private float x;
    private float y;
    private float xLength;
    private float yLength;
    private short boardX;
    private short boardY;

    /**
     * Constructor
     * @param x the x coordinate
     * @param y the y coordinate
     * @param xLength the length of the rectanlge in terms of x length
     * @param yLength the length of the rectangle in terms of y length
     */
    public Rectangle(float x, float y, float xLength, float yLength, short boardX, short boardY){
        this.x = x;
        this.y = y;
        this.xLength = xLength;
        this.yLength = yLength;
        this.boardX = boardX;
        this.boardY = boardY;
    }
}