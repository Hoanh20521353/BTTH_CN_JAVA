package thumuc;
import javax.swing.*;

public class HelloSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Swing");
        JButton button = new JButton("Nhấn tôi!");

        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Chào bạn!"));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);
        button.setBounds(90, 70, 120, 30);

        frame.add(button);
        frame.setVisible(true);
    }
}
