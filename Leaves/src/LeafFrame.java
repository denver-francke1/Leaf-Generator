import javax.swing.*;
import java.awt.*;
import java.util.Random;

 class LeafFrame extends JFrame {
    private Leaf leaf = new Leaf();
    private Random rand = new Random();

    public LeafFrame() {
        setTitle("Random Leaf Generator");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    public void paint(Graphics g) {
        super.paint(g);
        for (int i = 0; i <= 100; i++) { // Draw 100 random leaves
            int x = rand.nextInt(getWidth());
            int y = rand.nextInt(getHeight());
            leaf.drawRandomLeaf(g, x, y);
        }
    }
}
