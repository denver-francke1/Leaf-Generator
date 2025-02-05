import java.awt.*;
import java.util.Random;

class Leaf {
    private Random rand = new Random();

    private int small = 20;
    private int medium = 40;
    private int large =60;
    private int sizes[] = {small,medium,large};

    // Draw first type of leaf
    public void leafType1(Graphics g, int x, int y, int size) {

        g.setColor(new Color(0,153,0));
        //  g.setColor(Color.GREEN);
        g.fillOval(x, y, size, size /2);
    }

    // Draw second type of leaf
    public void leafType2(Graphics g, int x, int y, int size) {

        g.setColor(Color.green);
        g.setColor(new Color(0,255,0));
        g.fillArc(x, y, size, size, 0, 180);
    }

    // Draw third type of leaf
    public void leafType3(Graphics g, int x, int y, int size) {

        g.setColor(new Color(144,238,144));
        int[] xPoints = {x, x + size / 2, x + size};
        int[] yPoints = {y + size, y, y + size};
        g.fillPolygon(xPoints, yPoints, 3);
    }

    public void drawRandomLeaf(Graphics g, int x, int y) {
        int type = rand.nextInt(3) + 1;

        int size = sizes[rand.nextInt(sizes.length)];
        switch (type) {
            case 1 -> leafType1(g, x, y, size);
            case 2 -> leafType2(g, x, y, size);
            case 3 -> leafType3(g, x, y, size);
        }
    }
}
