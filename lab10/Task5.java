package lab10;

import javax.swing.*;

public class Task5 extends JFrame {
    int count = 0;
    JLabel label;

    public Task5() {
        JButton btn = new JButton("Нажать");
        label = new JLabel("0");

        btn.addActionListener(e -> {
            count++;
            label.setText("Нажатий: " + count);
        });

        setLayout(new java.awt.FlowLayout());
        add(btn);
        add(label);

        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task5();
    }
}