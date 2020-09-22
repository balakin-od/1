package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class Windows extends JFrame {
    private JPanel panel;
    private JTextPane менюАдминистратораTextPane;
    private JPanel panel1;
    Image image = new ImageIcon("/images/service_logo.png").getImage();
    Image IMG = image.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
    private JLabel Logo2 = new JLabel(new ImageIcon(IMG), JLabel.CENTER);
    private JLabel Logo = new JLabel(new ImageIcon(getClass().getResource("/images/service_logo.png")));
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JTextArea passwordTextArea;
    private JTextArea loginTextArea;
    private JButton loginButton;


    public Windows()  throws IOException {
        setContentPane(panel);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ;
        String login = "Admin";
        String password = "0000";
        String login1 = "Admin";
        String password1 = "0000";
        if ((login.equals(login1)) && (password.equals(password1))) {
            loginButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/yourcompanyname/yourapplicationname/layouts/nameOfYourFxmlFile.fxml"));
                    Parent root = null;
                    try {
                        root = fxmlLoader.load();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                    Stage stage = new Stage();
                    stage.initModality(Modality.APPLICATION_MODAL);
                    stage.setOpacity(1);
                    stage.setTitle("My New Stage Title");
                    stage.setScene(new Scene(root, 450, 450));
                    stage.showAndWait();
                }
            });

        }
         else {
            String error = "";
            error += "Error!";
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.PLAIN_MESSAGE);
        }
        ;
    }
    public static void main(String[] args) throws IOException {
        new Windows();

    }


    private void createUIComponents() {

    }
}

