package lab10;

import javax.swing.*;
import java.awt.*;

public class Task10 extends JPanel {
    JTextField field = new JTextField(10);
    String text = "";
    Color color = Color.RED;

    public Task10() {
        JButton btn = new JButton("OK");

        btn.addActionListener(e -> {
            text = field.getText();
            color = new Color(
                    (int)(Math.random()*255),
                    (int)(Math.random()*255),
                    (int)(Math.random()*255)
            );
            repaint();
        });

        add(field);
        add(btn);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.drawString("Привет, " + text, 100, 150);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task10");
        f.add(new Task10());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}