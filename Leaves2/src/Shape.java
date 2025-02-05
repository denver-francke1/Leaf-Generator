import java.awt.*;
import java.util.Random;

abstract class Shape {
    protected Random rand = new Random();


    public Shape() {

    }

    // Abstract method to draw the shape
    public void draw(Graphics g, int x, int y, int size) {

    }
}
