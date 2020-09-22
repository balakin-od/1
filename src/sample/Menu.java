package sample;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Menu extends JFrame {
    private JPanel Menu;
    private JTextPane менюАдминистратораTextPane;
    private JPanel panel1;
    Image image = new ImageIcon("/images/service_logo.png").getImage();
    Image IMG = image.getScaledInstance(120,120,java.awt.Image.SCALE_SMOOTH);
    private JLabel Logo2 = new JLabel(new ImageIcon(IMG), JLabel.CENTER);
    private JLabel Logo = new JLabel(new ImageIcon(getClass().getResource("/images/service_logo.png")));



    public Menu() throws IOException {

        add(Logo2);
        add(Logo);
        setContentPane(Menu);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);;


    }

    public static void main(String[] args) throws IOException {
        new Windows();

    }


    private void createUIComponents() {

    }
}

