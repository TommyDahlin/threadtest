import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Button extends JPanel implements ActionListener {
    protected JButton b1, b2, b3;
    public Button(){
        ImageIcon leftButtonIcon = createImageIcon("img/left.png");
        ImageIcon rightButtonIcon = createImageIcon("img/right.png");
        ImageIcon upButtonIcon = createImageIcon("img/up.png");

        b1 = new JButton("Disable middle button", leftButtonIcon);
        b1.setVerticalTextPosition(AbstractButton.CENTER);
        b1.setHorizontalTextPosition(AbstractButton.LEADING);
        b1.setMnemonic(KeyEvent.VK_D);
        b1.setActionCommand("disable");

        b2 = new JButton("Middle button", upButtonIcon);
        b2.setVerticalTextPosition(AbstractButton.BOTTOM);
        b2.setHorizontalTextPosition(AbstractButton.CENTER);
        b2.setActionCommand("clicked");
        b2.setMnemonic(KeyEvent.VK_M);

        b3 = new JButton("Enable middle button", rightButtonIcon);
        b3.setMnemonic(KeyEvent.VK_E);
        b3.setActionCommand("enable");
        b3.setEnabled(false);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        b1.setToolTipText("Click this button to disable the middle button.");
        b2.setToolTipText("Click this button to click this button.");
        b3.setToolTipText("Click this button to enable the middle button.");

        add(b1);
        add(b2);
        add(b3);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if ("disable".equals(e.getActionCommand())){
            b2.setEnabled(false);
            b1.setEnabled(false);
            b3.setEnabled(true);
        } else {
            b2.setEnabled(true);
            b1.setEnabled(true);
            b3.setEnabled(false);
        }
    }
    protected static ImageIcon createImageIcon(String path){
        java.net.URL imgURL = Button.class.getResource(path);
        if (imgURL != null){
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Could not find img in path " + path);
            return null;
        }
    }
}
