package sample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class Table extends JFrame {

    private JPanel panel1;

    public Table() throws IOException {
        setContentPane(panel1);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    static class ButtonEventListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            //Действие кнопки перехода меню администратора

        }

        public static void main(String[] args) throws IOException {
            new Table();

        }


        private void createUIComponents() {

        }

}
}
