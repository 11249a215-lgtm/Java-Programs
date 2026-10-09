import javax.swing.*;
import java.awt.*;

public class LayoutDemo {
    public static void main(String[] args) {
        // b) BorderLayout Example
        JFrame frame = new JFrame("Layout Demo");
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        frame.add(new JButton("North Header"), BorderLayout.NORTH);
        frame.add(new JButton("South Footer"), BorderLayout.SOUTH);
        frame.add(new JButton("East Menu"), BorderLayout.EAST);
        frame.add(new JButton("West Menu"), BorderLayout.WEST);
        
        // c) Calculator GridLayout in Center
        JPanel calcPanel = new JPanel(new GridLayout(4, 3, 5, 5));
        for (int i = 1; i <= 9; i++) {
            calcPanel.add(new JButton(String.valueOf(i)));
        }
        
        frame.add(calcPanel, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}