package lab10;

import javax.swing.*;
import java.awt.*;

public class Task1 extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Прямоугольник
        g.drawRect(50, 50, 150, 100);
        g.drawString("Прямоугольник", 50, 160);

        // Круг
        g.drawOval(250, 50, 100, 100);
        g.drawString("Круг", 270, 160);

        // Линия
        g.drawLine(400, 50, 500, 150);
        g.drawString("Линия", 400, 160);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Рисование фигур");
        frame.add(new Task1());
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}