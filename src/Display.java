import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Display extends JFrame {
    public static void showGUI(){
        JFrame frame = new JFrame("Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Button newContentPane = new Button();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);

        frame.setIconImage(new ImageIcon("src/img/icon.png").getImage());
        JLabel emptyLabel = new JLabel("Hej, SIDKBK, hur e läget?");
        emptyLabel.setPreferredSize(new Dimension(1080,960));
        frame.getContentPane().add(emptyLabel,BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

}
