import javax.swing.*;
import java.awt.*;

public class GUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JButton button1 = new JButton();
        JButton button2 = new JButton();

        //BorderLayout layout = new BorderLayout();
        button1.setSize(60,90);
        button2.setSize(90,90);
        button1.setText("Enter");
        button2.setText("Reset");

        frame.setSize(600,550);
        // frame.setLocationRelativeTo(null);

        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);
       // frame.setLayout(layout);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        frame.setVisible(true);


    }
}
