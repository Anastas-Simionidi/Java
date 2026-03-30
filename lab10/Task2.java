package lab10;

import javax.swing.*;
import java.awt.*;

public class Task2 extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 100);

        g.setColor(Color.BLUE);
        g.fillOval(200, 50, 100, 100);

        g.setColor(Color.GREEN);
        g.drawLine(350, 50, 450, 150);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task2");
        f.add(new Task2());
        f.setSize(600, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}