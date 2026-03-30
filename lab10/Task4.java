package lab10;

import javax.swing.*;
import java.awt.*;

public class Task4 extends JFrame {
    String message = "";

    public Task4() {
        JButton btn = new JButton("Нажми");
        btn.addActionListener(e -> {
            message = "Кнопка нажата!";
            repaint();
        });

        add(btn, BorderLayout.SOUTH);
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(message, 100, 100);
    }

    public static void main(String[] args) {
        new Task4();
    }
}