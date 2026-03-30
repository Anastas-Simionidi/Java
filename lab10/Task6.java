package lab10;

import javax.swing.*;

public class Task6 extends JFrame {

    public Task6() {
        JTextField field = new JTextField(10);
        JButton btn = new JButton("OK");
        JLabel label = new JLabel();

        btn.addActionListener(e ->
                label.setText("Привет, " + field.getText())
        );

        setLayout(new java.awt.FlowLayout());
        add(field);
        add(btn);
        add(label);

        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task6();
    }
}